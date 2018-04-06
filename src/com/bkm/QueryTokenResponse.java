/**
 * QueryTokenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class QueryTokenResponse  implements java.io.Serializable {
    private com.bkm.QueryTokenWSResponse queryTokenWSResponse;

    public QueryTokenResponse() {
    }

    public QueryTokenResponse(
           com.bkm.QueryTokenWSResponse queryTokenWSResponse) {
           this.queryTokenWSResponse = queryTokenWSResponse;
    }


    /**
     * Gets the queryTokenWSResponse value for this QueryTokenResponse.
     * 
     * @return queryTokenWSResponse
     */
    public com.bkm.QueryTokenWSResponse getQueryTokenWSResponse() {
        return queryTokenWSResponse;
    }


    /**
     * Sets the queryTokenWSResponse value for this QueryTokenResponse.
     * 
     * @param queryTokenWSResponse
     */
    public void setQueryTokenWSResponse(com.bkm.QueryTokenWSResponse queryTokenWSResponse) {
        this.queryTokenWSResponse = queryTokenWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTokenResponse)) return false;
        QueryTokenResponse other = (QueryTokenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryTokenWSResponse==null && other.getQueryTokenWSResponse()==null) || 
             (this.queryTokenWSResponse!=null &&
              this.queryTokenWSResponse.equals(other.getQueryTokenWSResponse())));
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
        if (getQueryTokenWSResponse() != null) {
            _hashCode += getQueryTokenWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryTokenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTokenWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSResponse"));
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
