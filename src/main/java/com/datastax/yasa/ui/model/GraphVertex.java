package com.datastax.yasa.ui.model;

import java.io.Serializable;
import java.util.Map;

/**
 * 
 * @author Cedrick LUNVEN (@clunven)
 */
public class GraphVertex implements Serializable {
    
    /** Serial. */
    private static final long serialVersionUID = 1725380197503378087L;
    
    /** Unique identifier for node. */
    private String id;
    
    /** Type of node. */
    private String label;
    
    /** Unique identifier for graph. */
    private String group;
    
    /** Unique identifier for graph. */
    private String shape = "ellipse";
    
    /** Color of edges. */
    private Map<String, String > color = null;
    
    /**
     * Getter accessor for attribute 'id'.
     *
     * @return
     *       current value of 'id'
     */
    public String getId() {
        return id;
    }

    /**
     * Setter accessor for attribute 'id'.
     * @param id
     * 		new value for 'id '
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Fluent.
     */
    public GraphVertex id(String id) {
        setId(id);
        return this;
    }

    /**
     * Getter accessor for attribute 'label'.
     *
     * @return
     *       current value of 'label'
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * Fluent.
     */
    public GraphVertex label(String label) {
        setLabel(label);
        return this;
    }

    /**
     * Setter accessor for attribute 'label'.
     * @param label
     * 		new value for 'label '
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter accessor for attribute 'color'.
     *
     * @return
     *       current value of 'color'
     */
    public Map<String, String> getColor() {
        return color;
    }

    /**
     * Setter accessor for attribute 'color'.
     * @param color
     * 		new value for 'color '
     */
    public void setColor(Map<String, String> color) {
        this.color = color;
    }

    /**
     * Setter accessor for attribute 'shape'.
     * @param shape
     * 		new value for 'shape '
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * Getter accessor for attribute 'shape'.
     *
     * @return
     *       current value of 'shape'
     */
    public String getShape() {
        return shape;
    }

    /**
     * Getter accessor for attribute 'group'.
     *
     * @return
     *       current value of 'group'
     */
    public String getGroup() {
        return group;
    }

    /**
     * Setter accessor for attribute 'group'.
     * @param group
     * 		new value for 'group '
     */
    public void setGroup(String group) {
        this.group = group;
    }

}
