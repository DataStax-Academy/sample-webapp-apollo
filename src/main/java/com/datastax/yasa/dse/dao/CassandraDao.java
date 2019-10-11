package com.datastax.yasa.dse.dao;
import static com.datastax.oss.driver.api.querybuilder.QueryBuilder.bindMarker;
import static com.datastax.oss.driver.api.querybuilder.QueryBuilder.selectFrom;
import static com.datastax.oss.driver.api.querybuilder.relation.Relation.column;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.datastax.dse.driver.api.core.DseSession;
import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.datastax.oss.driver.api.core.metadata.schema.ColumnMetadata;
import com.datastax.oss.driver.api.core.metadata.schema.TableMetadata;
import com.datastax.yasa.dse.dto.TableColumn;

/**
 * DAO to work with Cassandra
 *
 * @author Cedrick LUNVEN (@clunven)
 */
@Repository
public class CassandraDao {
    
    /** Keys to sort keyspaces. */
    public  static final String KEYSPACES_ADMIN    = "ADMIN";
    public  static final String KEYSPACES_USER     = "USER";
    
    /** Loger for that class. */
    protected Logger LOGGER = LoggerFactory.getLogger(getClass());
   
    /** Hold Connectivity to DSE. */
    @Autowired
    protected DseSession dseSession;
    
    /** Get precise informations on column cannot retrieve from ColumnDefinitions objects. */
    private PreparedStatement selectColumnsStatement;
    
    /**
     * Default constructor.
     */
    public CassandraDao() {
        super();
    }
    
    /**
     * Allow explicit intialization for test purpose.
     */
    public CassandraDao(DseSession dseSession) {
        this.dseSession     = dseSession;
        initialize();
    }
    
    @PreDestroy
    public void cleanUp() {
        if (dseSession != null) {
            LOGGER.info("Shutdown Hook: Closing Dse Session");
            dseSession.close();
        }
    }
    
    
    @PostConstruct
    protected void initialize() {
        selectColumnsStatement = dseSession.prepare(
                selectFrom("system_schema", "columns")
                .column("column_name").column("clustering_order")
                .column("kind").column("position").column("type")
                .where(column("keyspace_name").isEqualTo(bindMarker("keyspace_name")))
                .where(column("table_name").isEqualTo(bindMarker("table_name")))
                .build());
    }
    
    /**
     * List keyspaces, sorted for the UI.
     * 
     * Note : dseSession.getCluster().getMetadata().getKeyspaces() is nice but does not fit expected
     * filtering Graph/NotGraph Admin/User.
     * 
     * @return
     */
    public Map <String, TreeSet<String>> listCassandraKeyspacesNames() {
        Map < String, TreeSet<String> > keyspaces = new HashMap<>();
        keyspaces.put(KEYSPACES_ADMIN, new TreeSet<>());
        keyspaces.put(KEYSPACES_USER, new TreeSet<>());
        ResultSet rs = dseSession.execute(selectFrom("system_schema", "keyspaces").all().build());
        for (Row row : rs) {
            boolean ok = true;
            Iterator<String> iter = row.getMap("replication", String.class, String.class).keySet().iterator();
            while(ok && iter.hasNext()) { 
                ok = !iter.next().contains("Graph");
            }
            if (ok) {
                String keyspace = row.getString("keyspace_name");
                if (keyspace.startsWith("dse_")    || 
                    keyspace.startsWith("system") || 
                    keyspace.startsWith("solr_admin") ||  
                    "dsefs".equals(keyspace) || 
                    "HiveMetaStore".equals(keyspace)) {
                    keyspaces.get(KEYSPACES_ADMIN).add(keyspace);
                } else {
                    keyspaces.get(KEYSPACES_USER).add(keyspace);
                }
            }
        }
        return keyspaces;
    }
    
    /**
     * List table names for a keyspace.
     * 
     * @param keyspace
     *      target keyspace
     * @return
     *      list of tables
     */
    public Stream < String > listTablesNamesByKeySpace(String keyspace) {
        return dseSession.getMetadata().getKeyspace(keyspace).get()
                         .getTables().values().stream()
                         .map(TableMetadata::getName)
                         .map(CqlIdentifier::asInternal);
    }
    
    public LinkedHashMap< String, TableColumn > listColumnsFull(String keySpace, String tableName) {
        ResultSet rs = dseSession.execute(selectColumnsStatement.bind()
                                    .setString("keyspace_name", keySpace)
                                    .setString("table_name", tableName));
        List < TableColumn > results = new ArrayList<>();
        for (Row row : rs.all()) {
            String kind = row.getString("kind");
            TableColumn tc = new TableColumn();
            tc.setPartitionKey("partition_key".equalsIgnoreCase(kind));
            tc.setClusteringColumn("clustering".equalsIgnoreCase(kind));
            tc.setName(row.getString("column_name"));
            tc.setPosition(row.getInt("position"));
            tc.setType(row.getString("type"));
            results.add(tc);
        }
        
        Collections.sort(results);
        LinkedHashMap<String, TableColumn > mapOfColumns = new LinkedHashMap<>();
        results.stream().forEach(col -> mapOfColumns.put(col.getName(), col));
        return mapOfColumns;
    }
    
    /**
     * List columns for a table.
     * 
     * @param keyspace
     *      target keyspace
     * @return
     *      list of tables
     */
    public Stream < ColumnMetadata > listColumns(String keySpace, String tableName) {
         return dseSession.getMetadata().getKeyspace(keySpace).get()
                          .getTable(tableName).get()
                          .getColumns().values()
                          .stream();
    }
   
    /**
     * !!! PLEASE USE PREPARE STATEMENT ANYTIME POSSIBLE !!!
     * 
     * Here the request is coming from the ui/user and can not anticipate.
     * 
     * @param cqlQuery
     * @return
     */
    public ResultSet executeCQLQuery(String cqlQuery) {
        return dseSession.execute(cqlQuery);
    }
    
}
