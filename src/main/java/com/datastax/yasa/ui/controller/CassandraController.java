package com.datastax.yasa.ui.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.context.WebContext;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.datastax.oss.driver.api.core.metadata.schema.ColumnMetadata;
import com.datastax.yasa.dse.dao.CassandraDao;
import com.datastax.yasa.dse.dto.TableColumn;
import com.datastax.yasa.dse.dto.TableResult;
import com.datastax.yasa.dse.dto.TableValue;
import com.datastax.yasa.ui.webbean.CassandraWebBean;

@Controller
@RequestMapping(value="/cassandra")
public class CassandraController extends AbstractController {
    
    /** Vie name. */
    private static final String CASSANDRA_VIEW = "cassandra";
    
    /** Params. */
    private static final String PARAM_KEYSPACE = "keyspace";
    private static final String PARAM_TABLE    = "table";
    private static final String PARAM_QUERY    = "query";
    
    @Autowired
    private CassandraDao cassandraDao;
    
    /** {@inheritDoc} */
    public String getSuccessView() {
        return CASSANDRA_VIEW;
    }

    /** {@inheritDoc} */
    @Override
    public void get(HttpServletRequest req, HttpServletResponse res, WebContext ctx) throws Exception {
        CassandraWebBean cwb = (CassandraWebBean) ctx.getVariable("cbean");
        if (cwb == null) {
            cwb = new CassandraWebBean();
            Map <String, TreeSet<String>> keyspaces = cassandraDao.listCassandraKeyspacesNames();
            cwb.getAdminKeyspaces().addAll(keyspaces.get(CassandraDao.KEYSPACES_ADMIN));
            cwb.getUserKeyspaces().addAll(keyspaces.get(CassandraDao.KEYSPACES_USER));
        }
        
        String keySpaceName = req.getParameter(PARAM_KEYSPACE);
        if (null != keySpaceName && keySpaceName.length() > 0) {
            cwb.setCurrentKeySpace(keySpaceName);
            cwb.setCurrentTableName(null);
            cwb.getTableNames().addAll(cassandraDao
                    .listTablesNamesByKeySpace(keySpaceName)
                    .collect(Collectors.toList()));
        }
        
        String tableName = req.getParameter(PARAM_TABLE);
        if (null != tableName && tableName.length() > 0) {
            cwb.setCurrentTableName(tableName);
        }
         
        // Keyspaces
        if (StringUtils.hasLength(keySpaceName) && StringUtils.hasLength(tableName)) {
            cwb.setCqlQuery(String.join(",", cassandraDao.listColumns(keySpaceName, tableName)
                                .map(ColumnMetadata::getName)
                                .map(CqlIdentifier::asInternal)
                                .collect(Collectors.toList())));
            LOGGER.info("{GET} QUERY  {}", cwb.getCqlQuery());
        }
        ctx.setVariable("cbean", cwb);
    }

    /** {@inheritDoc} */
    @Override
    public void processPost(HttpServletRequest req, HttpServletResponse res, WebContext ctx) throws Exception {
        CassandraWebBean cwb = new CassandraWebBean();
        String currentKeySpace  = req.getParameter(PARAM_KEYSPACE);
        String currentTableName = req.getParameter(PARAM_TABLE);
        String cqlQuery        = req.getParameter(PARAM_QUERY).replaceAll("\\r\\n", " ");
        LOGGER.info("{POST} - Executing Query {}", cqlQuery);
        if (null != cqlQuery && cqlQuery.length() > 0) {
            ResultSet rs = cassandraDao.executeCQLQuery(cqlQuery);
            
            // Look for definition as not in ColumnDefinition
            LinkedHashMap<String, TableColumn> allColumns = 
                    cassandraDao.listColumnsFull(currentKeySpace, currentTableName);
            
            TableResult tableResult = new TableResult();
            tableResult.setExecutedQuery(cqlQuery);
            tableResult.setKeySpace(currentKeySpace);
            tableResult.setTableName(currentTableName);
            
            // Fill Columns Titles
            for(String columnName : allColumns.keySet()) {
                if (rs.getColumnDefinitions().contains(columnName)) {
                    tableResult.getColumns().put(columnName, allColumns.get(columnName));
                }
            }
            
            // Fill Rows
            for (Row currentRow : rs) {
                // Get column in proper order
                LinkedHashMap<String, TableValue> uiRow = new LinkedHashMap<>();
                for(String columnName : tableResult.getColumns().keySet()) {
                    TableValue tv = new TableValue();
                    tv.setColumnName(columnName);
                    tv.setRawValue(currentRow.getObject(columnName));
                    uiRow.put(columnName, tv);
                }
                tableResult.getRows().add(uiRow);
            }
            cwb.setResult(tableResult);
            cwb.setCqlQuery(String.join(",", tableResult.getColumns().keySet()));
        }
        Map <String, TreeSet<String>> keyspaces = cassandraDao.listCassandraKeyspacesNames();
        cwb.getAdminKeyspaces().addAll(keyspaces.get(CassandraDao.KEYSPACES_ADMIN));
        cwb.getUserKeyspaces().addAll(keyspaces.get(CassandraDao.KEYSPACES_USER));
        cwb.setCurrentKeySpace(currentKeySpace);
        cwb.setCurrentTableName(currentTableName);
        
        cwb.getTableNames().addAll(cassandraDao.listTablesNamesByKeySpace(currentKeySpace).collect(Collectors.toList()));
        ctx.setVariable("cbean", cwb);
    }
   
}
