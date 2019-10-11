package com.datastax.yasa.dse.dto;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Display results in the Web UI.
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class TableResult {
    
    /** Query. */
    private String executedQuery;
    
    /** execution Time. */
    private long executionTime;
    
    /** Keyspace */
    private String keySpace;
    
    /** TableName */
    private String tableName;
    
    /** Columns Results */
    private LinkedHashMap<String, TableColumn> columns = new LinkedHashMap<>();
    
    /** Value for cells. */
    private List < LinkedHashMap<String, TableValue> > rows = new ArrayList<>();

    /**
     * Getter accessor for attribute 'executedQuery'.
     *
     * @return
     *       current value of 'executedQuery'
     */
    public String getExecutedQuery() {
        return executedQuery;
    }

    /**
     * Setter accessor for attribute 'executedQuery'.
     * @param executedQuery
     * 		new value for 'executedQuery '
     */
    public void setExecutedQuery(String executedQuery) {
        this.executedQuery = executedQuery;
    }

    /**
     * Getter accessor for attribute 'keySpace'.
     *
     * @return
     *       current value of 'keySpace'
     */
    public String getKeySpace() {
        return keySpace;
    }

    /**
     * Setter accessor for attribute 'keySpace'.
     * @param keySpace
     * 		new value for 'keySpace '
     */
    public void setKeySpace(String keySpace) {
        this.keySpace = keySpace;
    }

    /**
     * Getter accessor for attribute 'tableName'.
     *
     * @return
     *       current value of 'tableName'
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Setter accessor for attribute 'tableName'.
     * @param tableName
     * 		new value for 'tableName '
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Getter accessor for attribute 'columns'.
     *
     * @return
     *       current value of 'columns'
     */
    public LinkedHashMap<String, TableColumn> getColumns() {
        return columns;
    }

    /**
     * Setter accessor for attribute 'columns'.
     * @param columns
     * 		new value for 'columns '
     */
    public void setColumns(LinkedHashMap<String, TableColumn> columns) {
        this.columns = columns;
    }

    /**
     * Getter accessor for attribute 'executionTime'.
     *
     * @return
     *       current value of 'executionTime'
     */
    public long getExecutionTime() {
        return executionTime;
    }

    /**
     * Setter accessor for attribute 'executionTime'.
     * @param executionTime
     * 		new value for 'executionTime '
     */
    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * Getter accessor for attribute 'rows'.
     *
     * @return
     *       current value of 'rows'
     */
    public List<LinkedHashMap<String, TableValue>> getRows() {
        return rows;
    }

    /**
     * Setter accessor for attribute 'rows'.
     * @param rows
     * 		new value for 'rows '
     */
    public void setRows(List<LinkedHashMap<String, TableValue>> rows) {
        this.rows = rows;
    }
    
}
