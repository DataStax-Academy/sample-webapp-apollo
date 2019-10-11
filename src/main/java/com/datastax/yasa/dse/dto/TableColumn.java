package com.datastax.yasa.dse.dto;

/**
 * Cell to be displayed.
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class TableColumn implements Comparable < TableColumn > {
    
    /** Position. */
    private String type;
    
    private String name;
    
    private boolean partitionKey = false;
    
    private boolean clusteringColumn = false;
    
    private int position;

    /**
     * Getter accessor for attribute 'type'.
     *
     * @return
     *       current value of 'type'
     */
    public String getType() {
        return type;
    }

    /**
     * Setter accessor for attribute 'type'.
     * @param type
     * 		new value for 'type '
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Getter accessor for attribute 'partitionKey'.
     *
     * @return
     *       current value of 'partitionKey'
     */
    public boolean isPartitionKey() {
        return partitionKey;
    }

    /**
     * Setter accessor for attribute 'partitionKey'.
     * @param partitionKey
     * 		new value for 'partitionKey '
     */
    public void setPartitionKey(boolean partitionKey) {
        this.partitionKey = partitionKey;
    }

    /**
     * Getter accessor for attribute 'clusteringColumn'.
     *
     * @return
     *       current value of 'clusteringColumn'
     */
    public boolean isClusteringColumn() {
        return clusteringColumn;
    }

    /**
     * Setter accessor for attribute 'clusteringColumn'.
     * @param clusteringColumn
     * 		new value for 'clusteringColumn '
     */
    public void setClusteringColumn(boolean clusteringColumn) {
        this.clusteringColumn = clusteringColumn;
    }

    /**
     * Getter accessor for attribute 'name'.
     *
     * @return
     *       current value of 'name'
     */
    public String getName() {
        return name;
    }

    /**
     * Setter accessor for attribute 'name'.
     * @param name
     * 		new value for 'name '
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter accessor for attribute 'position'.
     *
     * @return
     *       current value of 'position'
     */
    public int getPosition() {
        return position;
    }

    /**
     * Setter accessor for attribute 'position'.
     * @param position
     * 		new value for 'position '
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /** {@inheritDoc} */
    @Override
    public int compareTo(TableColumn other) {
        final int BEFORE = -1;
        final int EQUAL  = 0;
        final int AFTER  = 1;
        
        if (other == null) return BEFORE;
        if (this == other) return EQUAL;
        
        // Parition Key always first and ordered
        if (isPartitionKey() && !other.isPartitionKey())  return BEFORE;
        if (!isPartitionKey() && other.isPartitionKey())  return AFTER;
        if (isPartitionKey() && other.isPartitionKey() )  return getPosition() - other.getPosition();
        
        // Clustering column second but and ordered
        if (isClusteringColumn() && !other.isClusteringColumn())  return BEFORE;
        if (!isClusteringColumn() && other.isClusteringColumn())  return AFTER;
        if (isClusteringColumn() && !other.isClusteringColumn())  return getPosition() - other.getPosition();
        
        // Else sort by name
        return getName().compareTo(other.getName());
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "TableColumn [name=" + name + ", partitionKey=" + partitionKey + ", clusteringColumn=" + clusteringColumn
                + ", position=" + position + "]";
    }
    
}
