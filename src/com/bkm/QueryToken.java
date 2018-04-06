/**
 * QueryToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class QueryToken  implements java.io.Serializable {
    private com.bkm.QueryTokenWSRequest queryTokenWSRequest;

    public QueryToken() {
    }

    public QueryToken(
           com.bkm.QueryTokenWSRequest queryTokenWSRequest) {
           this.queryTokenWSRequest = queryTokenWSRequest;
    }


    /**
     * Gets the queryTokenWSRequest value for this QueryToken.
     * 
     * @return queryTokenWSRequest
     */
    public com.bkm.QueryTokenWSRequest getQueryTokenWSRequest() {
        return queryTokenWSRequest;
    }


    /**
     * Sets the queryTokenWSRequest value for this QueryToken.
     * 
     * @param queryTokenWSRequest
     */
    public void setQueryTokenWSRequest(com.bkm.QueryTokenWSRequest queryTokenWSRequest) {
        this.queryTokenWSRequest = queryTokenWSRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryToken)) return false;
        QueryToken other = (QueryToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryTokenWSRequest==null && other.getQueryTokenWSRequest()==null) || 
             (this.queryTokenWSRequest!=null &&
              this.queryTokenWSRequest.equals(other.getQueryTokenWSRequest())));
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
        if (getQueryTokenWSRequest() != null) {
            _hashCode += getQueryTokenWSRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTokenWSRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSRequest"));
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
