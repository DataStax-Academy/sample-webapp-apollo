package com.datastax.yasa.ui.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Will be able to display graph in JSON as expected by VizJS.
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class VizJsGraph implements Serializable {
    
    /** Serial. */
    private static final long serialVersionUID = 7241829478693348585L;

    /** Nodes. */
    private List < GraphVertex > nodes = new ArrayList<>();
    
    /** Edges. */
    private List < GraphEdge > edges = new ArrayList<>();
    
    /** Some queries return only object no edges nor
    private List <String > values = new ArrayList<>();
    
    /** Opions. */
    private GraphOption options = new GraphOption();
    
    /**
     * Adding node.
     *
     * @param node
     *      graph node.
     * @return
     *      current bean
     */
    public VizJsGraph addVertex(GraphVertex node) {
        if (node != null) {
            getNodes().add(node);
        }
        return this;
    }
    
    /**
     * Adding node.
     *
     * @param node
     *      graph node.
     * @return
     *      current bean
     */
    public VizJsGraph addEdge(GraphEdge edge) {
        if (edge != null) {
            getEdges().add(edge);
        }
        return this;
    }

    /**
     * Getter accessor for attribute 'options'.
     *
     * @return
     *       current value of 'options'
     */
    public GraphOption getOptions() {
        return options;
    }

    /**
     * Setter accessor for attribute 'options'.
     * @param options
     * 		new value for 'options '
     */
    public void setOptions(GraphOption options) {
        this.options = options;
    }

    /**
     * Getter accessor for attribute 'edges'.
     *
     * @return
     *       current value of 'edges'
     */
    public List<GraphEdge> getEdges() {
        return edges;
    }

    /**
     * Setter accessor for attribute 'edges'.
     * @param edges
     * 		new value for 'edges '
     */
    public void setEdges(List<GraphEdge> edges) {
        this.edges = edges;
    }

    /**
     * Getter accessor for attribute 'nodes'.
     *
     * @return
     *       current value of 'nodes'
     */
    public List<GraphVertex> getNodes() {
        return nodes;
    }

    /**
     * Setter accessor for attribute 'nodes'.
     * @param nodes
     * 		new value for 'nodes '
     */
    public void setNodes(List<GraphVertex> nodes) {
        this.nodes = nodes;
    }

    
}
