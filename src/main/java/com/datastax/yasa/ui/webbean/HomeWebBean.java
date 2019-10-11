package com.datastax.yasa.ui.webbean;

import java.util.ArrayList;
import java.util.List;

/**
 * Web Bean to display some information from.
 */
public class HomeWebBean {
    
    /** cluster name. */
    private String clusterName;
    
    /** Driver version. */
    private String dseDriverVersion;
    
    /** Configuration. */
    private String loadBalancingPolicy;
    private String reconnectionPolicy;
    private String retryPolicy;
    
    private String  queryConsistencyLevel;
    private int     queryFetchSize;
    private boolean queryDefaultIdempotence;
    private int     queryRefreshNodeInterval;
    private int     queryRefreshNodeMaxPendingRequest;
    private int     queryRefreshNodeListInterval;
    private int     queryRefreshNodeListMaxPendingRequest;
    private int     queryRefreshSchemaInterval;
    private int     queryRefreshSchemaPendingRequest;
    
    /** list of nodes. */
    private List < DseNodeWebBean > dseNodeList = new ArrayList<>();
    
    /**
     * Getter accessor for attribute 'clusterName'.
     *
     * @return
     *       current value of 'clusterName'
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Setter accessor for attribute 'clusterName'.
     * @param clusterName
     * 		new value for 'clusterName '
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * Getter accessor for attribute 'dseNodeList'.
     *
     * @return
     *       current value of 'dseNodeList'
     */
    public List<DseNodeWebBean> getDseNodeList() {
        return dseNodeList;
    }

    /**
     * Setter accessor for attribute 'dseNodeList'.
     * @param dseNodeList
     * 		new value for 'dseNodeList '
     */
    public void setDseNodeList(List<DseNodeWebBean> dseNodeList) {
        this.dseNodeList = dseNodeList;
    }

    /**
     * Getter accessor for attribute 'dseDriverVersion'.
     *
     * @return
     *       current value of 'dseDriverVersion'
     */
    public String getDseDriverVersion() {
        return dseDriverVersion;
    }

    /**
     * Setter accessor for attribute 'dseDriverVersion'.
     * @param dseDriverVersion
     * 		new value for 'dseDriverVersion '
     */
    public void setDseDriverVersion(String dseDriverVersion) {
        this.dseDriverVersion = dseDriverVersion;
    }

    /**
     * Getter accessor for attribute 'loadBalancingPolicy'.
     *
     * @return
     *       current value of 'loadBalancingPolicy'
     */
    public String getLoadBalancingPolicy() {
        return loadBalancingPolicy;
    }

    /**
     * Setter accessor for attribute 'loadBalancingPolicy'.
     * @param loadBalancingPolicy
     * 		new value for 'loadBalancingPolicy '
     */
    public void setLoadBalancingPolicy(String loadBalancingPolicy) {
        this.loadBalancingPolicy = loadBalancingPolicy;
    }

    /**
     * Getter accessor for attribute 'reconnectionPolicy'.
     *
     * @return
     *       current value of 'reconnectionPolicy'
     */
    public String getReconnectionPolicy() {
        return reconnectionPolicy;
    }

    /**
     * Setter accessor for attribute 'reconnectionPolicy'.
     * @param reconnectionPolicy
     * 		new value for 'reconnectionPolicy '
     */
    public void setReconnectionPolicy(String reconnectionPolicy) {
        this.reconnectionPolicy = reconnectionPolicy;
    }

    /**
     * Getter accessor for attribute 'retryPolicy'.
     *
     * @return
     *       current value of 'retryPolicy'
     */
    public String getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * Setter accessor for attribute 'retryPolicy'.
     * @param retryPolicy
     * 		new value for 'retryPolicy '
     */
    public void setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    /**
     * Getter accessor for attribute 'queryConsistencyLevel'.
     *
     * @return
     *       current value of 'queryConsistencyLevel'
     */
    public String getQueryConsistencyLevel() {
        return queryConsistencyLevel;
    }

    /**
     * Setter accessor for attribute 'queryConsistencyLevel'.
     * @param queryConsistencyLevel
     * 		new value for 'queryConsistencyLevel '
     */
    public void setQueryConsistencyLevel(String queryConsistencyLevel) {
        this.queryConsistencyLevel = queryConsistencyLevel;
    }

    /**
     * Getter accessor for attribute 'queryFetchSize'.
     *
     * @return
     *       current value of 'queryFetchSize'
     */
    public int getQueryFetchSize() {
        return queryFetchSize;
    }

    /**
     * Setter accessor for attribute 'queryFetchSize'.
     * @param queryFetchSize
     * 		new value for 'queryFetchSize '
     */
    public void setQueryFetchSize(int queryFetchSize) {
        this.queryFetchSize = queryFetchSize;
    }

    /**
     * Getter accessor for attribute 'queryDefaultIdempotence'.
     *
     * @return
     *       current value of 'queryDefaultIdempotence'
     */
    public boolean isQueryDefaultIdempotence() {
        return queryDefaultIdempotence;
    }

    /**
     * Setter accessor for attribute 'queryDefaultIdempotence'.
     * @param queryDefaultIdempotence
     * 		new value for 'queryDefaultIdempotence '
     */
    public void setQueryDefaultIdempotence(boolean queryDefaultIdempotence) {
        this.queryDefaultIdempotence = queryDefaultIdempotence;
    }

    /**
     * Getter accessor for attribute 'queryRefreshNodeInterval'.
     *
     * @return
     *       current value of 'queryRefreshNodeInterval'
     */
    public int getQueryRefreshNodeInterval() {
        return queryRefreshNodeInterval;
    }

    /**
     * Setter accessor for attribute 'queryRefreshNodeInterval'.
     * @param queryRefreshNodeInterval
     * 		new value for 'queryRefreshNodeInterval '
     */
    public void setQueryRefreshNodeInterval(int queryRefreshNodeInterval) {
        this.queryRefreshNodeInterval = queryRefreshNodeInterval;
    }

    /**
     * Getter accessor for attribute 'queryRefreshNodeMaxPendingRequest'.
     *
     * @return
     *       current value of 'queryRefreshNodeMaxPendingRequest'
     */
    public int getQueryRefreshNodeMaxPendingRequest() {
        return queryRefreshNodeMaxPendingRequest;
    }

    /**
     * Setter accessor for attribute 'queryRefreshNodeMaxPendingRequest'.
     * @param queryRefreshNodeMaxPendingRequest
     * 		new value for 'queryRefreshNodeMaxPendingRequest '
     */
    public void setQueryRefreshNodeMaxPendingRequest(int queryRefreshNodeMaxPendingRequest) {
        this.queryRefreshNodeMaxPendingRequest = queryRefreshNodeMaxPendingRequest;
    }

    /**
     * Getter accessor for attribute 'queryRefreshNodeListInterval'.
     *
     * @return
     *       current value of 'queryRefreshNodeListInterval'
     */
    public int getQueryRefreshNodeListInterval() {
        return queryRefreshNodeListInterval;
    }

    /**
     * Setter accessor for attribute 'queryRefreshNodeListInterval'.
     * @param queryRefreshNodeListInterval
     * 		new value for 'queryRefreshNodeListInterval '
     */
    public void setQueryRefreshNodeListInterval(int queryRefreshNodeListInterval) {
        this.queryRefreshNodeListInterval = queryRefreshNodeListInterval;
    }

    /**
     * Getter accessor for attribute 'queryRefreshNodeListMaxPendingRequest'.
     *
     * @return
     *       current value of 'queryRefreshNodeListMaxPendingRequest'
     */
    public int getQueryRefreshNodeListMaxPendingRequest() {
        return queryRefreshNodeListMaxPendingRequest;
    }

    /**
     * Setter accessor for attribute 'queryRefreshNodeListMaxPendingRequest'.
     * @param queryRefreshNodeListMaxPendingRequest
     * 		new value for 'queryRefreshNodeListMaxPendingRequest '
     */
    public void setQueryRefreshNodeListMaxPendingRequest(int queryRefreshNodeListMaxPendingRequest) {
        this.queryRefreshNodeListMaxPendingRequest = queryRefreshNodeListMaxPendingRequest;
    }

    /**
     * Getter accessor for attribute 'queryRefreshSchemaInterval'.
     *
     * @return
     *       current value of 'queryRefreshSchemaInterval'
     */
    public int getQueryRefreshSchemaInterval() {
        return queryRefreshSchemaInterval;
    }

    /**
     * Setter accessor for attribute 'queryRefreshSchemaInterval'.
     * @param queryRefreshSchemaInterval
     * 		new value for 'queryRefreshSchemaInterval '
     */
    public void setQueryRefreshSchemaInterval(int queryRefreshSchemaInterval) {
        this.queryRefreshSchemaInterval = queryRefreshSchemaInterval;
    }

    /**
     * Getter accessor for attribute 'queryRefreshSchemaPendingRequest'.
     *
     * @return
     *       current value of 'queryRefreshSchemaPendingRequest'
     */
    public int getQueryRefreshSchemaPendingRequest() {
        return queryRefreshSchemaPendingRequest;
    }

    /**
     * Setter accessor for attribute 'queryRefreshSchemaPendingRequest'.
     * @param queryRefreshSchemaPendingRequest
     * 		new value for 'queryRefreshSchemaPendingRequest '
     */
    public void setQueryRefreshSchemaPendingRequest(int queryRefreshSchemaPendingRequest) {
        this.queryRefreshSchemaPendingRequest = queryRefreshSchemaPendingRequest;
    }
    
}
