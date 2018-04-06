/**
 * QueryTokenPaymentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class QueryTokenPaymentResponse  implements java.io.Serializable {
    private com.bkm.QueryTokenPaymentWSResponse queryTokenPaymentWSResponse;

    public QueryTokenPaymentResponse() {
    }

    public QueryTokenPaymentResponse(
           com.bkm.QueryTokenPaymentWSResponse queryTokenPaymentWSResponse) {
           this.queryTokenPaymentWSResponse = queryTokenPaymentWSResponse;
    }


    /**
     * Gets the queryTokenPaymentWSResponse value for this QueryTokenPaymentResponse.
     * 
     * @return queryTokenPaymentWSResponse
     */
    public com.bkm.QueryTokenPaymentWSResponse getQueryTokenPaymentWSResponse() {
        return queryTokenPaymentWSResponse;
    }


    /**
     * Sets the queryTokenPaymentWSResponse value for this QueryTokenPaymentResponse.
     * 
     * @param queryTokenPaymentWSResponse
     */
    public void setQueryTokenPaymentWSResponse(com.bkm.QueryTokenPaymentWSResponse queryTokenPaymentWSResponse) {
        this.queryTokenPaymentWSResponse = queryTokenPaymentWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTokenPaymentResponse)) return false;
        QueryTokenPaymentResponse other = (QueryTokenPaymentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryTokenPaymentWSResponse==null && other.getQueryTokenPaymentWSResponse()==null) || 
             (this.queryTokenPaymentWSResponse!=null &&
              this.queryTokenPaymentWSResponse.equals(other.getQueryTokenPaymentWSResponse())));
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
        if (getQueryTokenPaymentWSResponse() != null) {
            _hashCode += getQueryTokenPaymentWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryTokenPaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTokenPaymentWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSResponse"));
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
