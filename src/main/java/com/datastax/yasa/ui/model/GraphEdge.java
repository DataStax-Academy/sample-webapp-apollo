package com.datastax.yasa.ui.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Bean Coding for 
 * @author Cedrick LUNVEN (@clunven)
 */
public class GraphEdge implements Serializable {

    /** Serial */
    private static final long serialVersionUID = 1831229442542944978L;
    
    /** Source Vertex. */
    private String from;
    
    /** Destination Vertex. */
    private String to;
    
    /** Should not be colored. */
    private boolean dashed =false;
    
    /** Edges are directed in DSE Graph. */
    private String arrows = "to";
    
    /** Color of edges. */
    private Map<String, String > color = null;
    
    public GraphEdge() {
    }
    
    public GraphEdge(String from, String to) {
        this.from = from;
        this.to = to;
        color = new HashMap<>();
        color.put("color", "#687684");
    }

    /**
     * Getter accessor for attribute 'from'.
     *
     * @return
     *       current value of 'from'
     */
    public String getFrom() {
        return from;
    }

    /**
     * Setter accessor for attribute 'from'.
     * @param from
     * 		new value for 'from '
     */
    public void setFrom(String from) {
        this.from = from;
    }
    
    public GraphEdge from(String from) {
        setFrom(from);
        return this;
    }

    /**
     * Getter accessor for attribute 'to'.
     *
     * @return
     *       current value of 'to'
     */
    public String getTo() {
        return to;
    }

    /**
     * Setter accessor for attribute 'to'.
     * @param to
     * 		new value for 'to '
     */
    public void setTo(String to) {
        this.to = to;
    }
    
    public GraphEdge to(String to) {
        setTo(to);
        return this;
    }

    /**
     * Getter accessor for attribute 'dashed'.
     *
     * @return
     *       current value of 'dashed'
     */
    public boolean isDashed() {
        return dashed;
    }

    /**
     * Setter accessor for attribute 'dashed'.
     * @param dashed
     * 		new value for 'dashed '
     */
    public void setDashed(boolean dashed) {
        this.dashed = dashed;
    }
    
    public GraphEdge dashed(boolean dashed) {
        setDashed(dashed);
        return this;
    }

    /**
     * Getter accessor for attribute 'arrows'.
     *
     * @return
     *       current value of 'arrows'
     */
    public String getArrows() {
        return arrows;
    }

    /**
     * Setter accessor for attribute 'arrows'.
     * @param arrows
     * 		new value for 'arrows '
     */
    public void setArrows(String arrows) {
        this.arrows = arrows;
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
    
    
}
