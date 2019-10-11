package com.datastax.yasa.ui.webbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Bean for Graph.
 */
public class GraphWebBean implements Serializable {
    
    /** Serial. */
    private static final long serialVersionUID = -6551761426456222851L;
    
    /** screem items. */
    private List < String > userGraphs  = new ArrayList<>();
    
    /** Current graph */
    private String graphName;
    private String gremlinQuery;

    /**
     * Getter accessor for attribute 'userGraphs'.
     *
     * @return
     *       current value of 'userGraphs'
     */
    public List<String> getUserGraphs() {
        return userGraphs;
    }

    /**
     * Setter accessor for attribute 'userGraphs'.
     * @param userGraphs
     * 		new value for 'userGraphs '
     */
    public void setUserGraphs(List<String> userGraphs) {
        this.userGraphs = userGraphs;
    }

    /**
     * Getter accessor for attribute 'graphName'.
     *
     * @return
     *       current value of 'graphName'
     */
    public String getGraphName() {
        return graphName;
    }

    /**
     * Setter accessor for attribute 'graphName'.
     * @param graphName
     * 		new value for 'graphName '
     */
    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    /**
     * Getter accessor for attribute 'gremlinQuery'.
     *
     * @return
     *       current value of 'gremlinQuery'
     */
    public String getGremlinQuery() {
        return gremlinQuery;
    }

    /**
     * Setter accessor for attribute 'gremlinQuery'.
     * @param gremlinQuery
     * 		new value for 'gremlinQuery '
     */
    public void setGremlinQuery(String gremlinQuery) {
        this.gremlinQuery = gremlinQuery;
    }
    

}
