package com.datastax.yasa.ui.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Options.
 * 
 * @author Cedrick LUNVEN (@clunven)\
 */
public class GraphOption implements Serializable {

    /** Serial. */
    private static final long serialVersionUID = 1305402041671605065L;
    
    private List < String > data = new ArrayList<>();

    /**
     * Getter accessor for attribute 'data'.
     *
     * @return
     *       current value of 'data'
     */
    public List<String> getData() {
        return data;
    }

    /**
     * Setter accessor for attribute 'data'.
     * @param data
     * 		new value for 'data '
     */
    public void setData(List<String> data) {
        this.data = data;
    }

}
