/**
 * PagingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class PagingInfo  implements java.io.Serializable {
    private java.lang.String pageNumber;

    private java.lang.String rowCount;

    private java.lang.String totalPageCount;

    private java.lang.String totalRowCount;

    public PagingInfo() {
    }

    public PagingInfo(
           java.lang.String pageNumber,
           java.lang.String rowCount,
           java.lang.String totalPageCount,
           java.lang.String totalRowCount) {
           this.pageNumber = pageNumber;
           this.rowCount = rowCount;
           this.totalPageCount = totalPageCount;
           this.totalRowCount = totalRowCount;
    }


    /**
     * Gets the pageNumber value for this PagingInfo.
     * 
     * @return pageNumber
     */
    public java.lang.String getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this PagingInfo.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.String pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the rowCount value for this PagingInfo.
     * 
     * @return rowCount
     */
    public java.lang.String getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this PagingInfo.
     * 
     * @param rowCount
     */
    public void setRowCount(java.lang.String rowCount) {
        this.rowCount = rowCount;
    }


    /**
     * Gets the totalPageCount value for this PagingInfo.
     * 
     * @return totalPageCount
     */
    public java.lang.String getTotalPageCount() {
        return totalPageCount;
    }


    /**
     * Sets the totalPageCount value for this PagingInfo.
     * 
     * @param totalPageCount
     */
    public void setTotalPageCount(java.lang.String totalPageCount) {
        this.totalPageCount = totalPageCount;
    }


    /**
     * Gets the totalRowCount value for this PagingInfo.
     * 
     * @return totalRowCount
     */
    public java.lang.String getTotalRowCount() {
        return totalRowCount;
    }


    /**
     * Sets the totalRowCount value for this PagingInfo.
     * 
     * @param totalRowCount
     */
    public void setTotalRowCount(java.lang.String totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagingInfo)) return false;
        PagingInfo other = (PagingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.rowCount==null && other.getRowCount()==null) || 
             (this.rowCount!=null &&
              this.rowCount.equals(other.getRowCount()))) &&
            ((this.totalPageCount==null && other.getTotalPageCount()==null) || 
             (this.totalPageCount!=null &&
              this.totalPageCount.equals(other.getTotalPageCount()))) &&
            ((this.totalRowCount==null && other.getTotalRowCount()==null) || 
             (this.totalRowCount!=null &&
              this.totalRowCount.equals(other.getTotalRowCount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getRowCount() != null) {
            _hashCode += getRowCount().hashCode();
        }
        if (getTotalPageCount() != null) {
            _hashCode += getTotalPageCount().hashCode();
        }
        if (getTotalRowCount() != null) {
            _hashCode += getTotalRowCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "pagingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
