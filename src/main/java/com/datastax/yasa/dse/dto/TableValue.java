package com.datastax.yasa.dse.dto;

/**
 * Value in the table.
 *
 * @author Cedrick LUNVEN (@clunven)
 */
public class TableValue {

    /** value in the UI. */
    private String columnName;
    
    /** value in the UI. */
    private String uiValue;
    
    /** value from response. */
    private Object rawValue;

    /**
     * Getter accessor for attribute 'uiValue'.
     *
     * @return
     *       current value of 'uiValue'
     */
    public String getUiValue() {
        return uiValue;
    }

    /**
     * Setter accessor for attribute 'uiValue'.
     * @param uiValue
     * 		new value for 'uiValue '
     */
    public void setUiValue(String uiValue) {
        this.uiValue = uiValue;
    }

    /**
     * Getter accessor for attribute 'rawValue'.
     *
     * @return
     *       current value of 'rawValue'
     */
    public Object getRawValue() {
        return rawValue;
    }

    /**
     * Setter accessor for attribute 'rawValue'.
     * @param rawValue
     * 		new value for 'rawValue '
     */
    public void setRawValue(Object rawValue) {
        this.rawValue = rawValue;
        if (rawValue != null) {
            this.uiValue = rawValue.toString();
        }
    }

    /**
     * Getter accessor for attribute 'columnName'.
     *
     * @return
     *       current value of 'columnName'
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Setter accessor for attribute 'columnName'.
     * @param columnName
     * 		new value for 'columnName '
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

}
