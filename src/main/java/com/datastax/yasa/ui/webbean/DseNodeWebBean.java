package com.datastax.yasa.ui.webbean;

import java.util.HashSet;
import java.util.Set;

/**
 * POJO for UI
 */
public class DseNodeWebBean {
    
    /** UI. */
    private String hostname;
    
    /** Adress. */
    private String hostAdress;
    
    /** Dse Version. */
    private String dseVersion;
    
    /** Current State. */
    private String state;
    
    /** cassandra. */
    private Set < String > workloads = new HashSet<>();
   
    /**
     * Getter accessor for attribute 'hostname'.
     *
     * @return
     *       current value of 'hostname'
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Setter accessor for attribute 'hostname'.
     * @param hostname
     * 		new value for 'hostname '
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Getter accessor for attribute 'hostAdress'.
     *
     * @return
     *       current value of 'hostAdress'
     */
    public String getHostAdress() {
        return hostAdress;
    }

    /**
     * Setter accessor for attribute 'hostAdress'.
     * @param hostAdress
     * 		new value for 'hostAdress '
     */
    public void setHostAdress(String hostAdress) {
        this.hostAdress = hostAdress;
    }

    /**
     * Getter accessor for attribute 'dseVersion'.
     *
     * @return
     *       current value of 'dseVersion'
     */
    public String getDseVersion() {
        return dseVersion;
    }

    /**
     * Setter accessor for attribute 'dseVersion'.
     * @param dseVersion
     * 		new value for 'dseVersion '
     */
    public void setDseVersion(String dseVersion) {
        this.dseVersion = dseVersion;
    }

    /**
     * Getter accessor for attribute 'state'.
     *
     * @return
     *       current value of 'state'
     */
    public String getState() {
        return state;
    }

    /**
     * Setter accessor for attribute 'state'.
     * @param state
     * 		new value for 'state '
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter accessor for attribute 'workloads'.
     *
     * @return
     *       current value of 'workloads'
     */
    public Set<String> getWorkloads() {
        return workloads;
    }

    /**
     * Setter accessor for attribute 'workloads'.
     * @param workloads
     * 		new value for 'workloads '
     */
    public void setWorkloads(Set<String> workloads) {
        this.workloads = workloads;
    }

}
