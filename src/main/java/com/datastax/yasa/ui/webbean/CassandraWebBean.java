package com.datastax.yasa.ui.webbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.datastax.yasa.dse.dto.TableResult;

/**
 * Bean behind the cassandra screen,
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class CassandraWebBean implements Serializable {
    
    /** serial/ */
    private static final long serialVersionUID = 7682232628558255421L;
    
    /** screem items. */
    private List < String > userKeyspaces  = new ArrayList<>();
    private List < String > adminKeyspaces = new ArrayList<>();
    private String          currentKeySpace;
    private String          currentTableName;
    private List < String > tableNames     = new ArrayList<>();
    private String          cqlQuery;
    private TableResult     result;

    /**
     * Getter accessor for attribute 'userKeyspaces'.
     *
     * @return
     *       current value of 'userKeyspaces'
     */
    public List<String> getUserKeyspaces() {
        return userKeyspaces;
    }

    /**
     * Setter accessor for attribute 'userKeyspaces'.
     * @param userKeyspaces
     * 		new value for 'userKeyspaces '
     */
    public void setUserKeyspaces(List<String> userKeyspaces) {
        this.userKeyspaces = userKeyspaces;
    }

    /**
     * Getter accessor for attribute 'adminKeyspaces'.
     *
     * @return
     *       current value of 'adminKeyspaces'
     */
    public List<String> getAdminKeyspaces() {
        return adminKeyspaces;
    }

    /**
     * Setter accessor for attribute 'adminKeyspaces'.
     * @param adminKeyspaces
     * 		new value for 'adminKeyspaces '
     */
    public void setAdminKeyspaces(List<String> adminKeyspaces) {
        this.adminKeyspaces = adminKeyspaces;
    }

    /**
     * Getter accessor for attribute 'tableNames'.
     *
     * @return
     *       current value of 'tableNames'
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * Setter accessor for attribute 'tableNames'.
     * @param tableNames
     * 		new value for 'tableNames '
     */
    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    /**
     * Getter accessor for attribute 'currentKeySpace'.
     *
     * @return
     *       current value of 'currentKeySpace'
     */
    public String getCurrentKeySpace() {
        return currentKeySpace;
    }

    /**
     * Setter accessor for attribute 'currentKeySpace'.
     * @param currentKeySpace
     * 		new value for 'currentKeySpace '
     */
    public void setCurrentKeySpace(String currentKeySpace) {
        this.currentKeySpace = currentKeySpace;
    }

    /**
     * Getter accessor for attribute 'serialversionuid'.
     *
     * @return
     *       current value of 'serialversionuid'
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Getter accessor for attribute 'currentTableName'.
     *
     * @return
     *       current value of 'currentTableName'
     */
    public String getCurrentTableName() {
        return currentTableName;
    }

    /**
     * Setter accessor for attribute 'currentTableName'.
     * @param currentTableName
     * 		new value for 'currentTableName '
     */
    public void setCurrentTableName(String currentTableName) {
        this.currentTableName = currentTableName;
    }

    /**
     * Getter accessor for attribute 'cqlQuery'.
     *
     * @return
     *       current value of 'cqlQuery'
     */
    public String getCqlQuery() {
        return cqlQuery;
    }

    /**
     * Setter accessor for attribute 'cqlQuery'.
     * @param cqlQuery
     * 		new value for 'cqlQuery '
     */
    public void setCqlQuery(String cqlQuery) {
        this.cqlQuery = cqlQuery;
    }

    /**
     * Getter accessor for attribute 'result'.
     *
     * @return
     *       current value of 'result'
     */
    public TableResult getResult() {
        return result;
    }

    /**
     * Setter accessor for attribute 'result'.
     * @param result
     * 		new value for 'result '
     */
    public void setResult(TableResult result) {
        this.result = result;
    }
    

}
