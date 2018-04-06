/**
 * QueryReversalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class QueryReversalResponse  implements java.io.Serializable {
    private com.bkm.QueryReversalWSResponse queryReversalWSResponse;

    public QueryReversalResponse() {
    }

    public QueryReversalResponse(
           com.bkm.QueryReversalWSResponse queryReversalWSResponse) {
           this.queryReversalWSResponse = queryReversalWSResponse;
    }


    /**
     * Gets the queryReversalWSResponse value for this QueryReversalResponse.
     * 
     * @return queryReversalWSResponse
     */
    public com.bkm.QueryReversalWSResponse getQueryReversalWSResponse() {
        return queryReversalWSResponse;
    }


    /**
     * Sets the queryReversalWSResponse value for this QueryReversalResponse.
     * 
     * @param queryReversalWSResponse
     */
    public void setQueryReversalWSResponse(com.bkm.QueryReversalWSResponse queryReversalWSResponse) {
        this.queryReversalWSResponse = queryReversalWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryReversalResponse)) return false;
        QueryReversalResponse other = (QueryReversalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryReversalWSResponse==null && other.getQueryReversalWSResponse()==null) || 
             (this.queryReversalWSResponse!=null &&
              this.queryReversalWSResponse.equals(other.getQueryReversalWSResponse())));
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
        if (getQueryReversalWSResponse() != null) {
            _hashCode += getQueryReversalWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryReversalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryReversalWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSResponse"));
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
