/**
 * QueryTokenPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class QueryTokenPayment  implements java.io.Serializable {
    private com.bkm.QueryTokenPaymentWSRequest queryTokenPaymentResultWSRequest;

    public QueryTokenPayment() {
    }

    public QueryTokenPayment(
           com.bkm.QueryTokenPaymentWSRequest queryTokenPaymentResultWSRequest) {
           this.queryTokenPaymentResultWSRequest = queryTokenPaymentResultWSRequest;
    }


    /**
     * Gets the queryTokenPaymentResultWSRequest value for this QueryTokenPayment.
     * 
     * @return queryTokenPaymentResultWSRequest
     */
    public com.bkm.QueryTokenPaymentWSRequest getQueryTokenPaymentResultWSRequest() {
        return queryTokenPaymentResultWSRequest;
    }


    /**
     * Sets the queryTokenPaymentResultWSRequest value for this QueryTokenPayment.
     * 
     * @param queryTokenPaymentResultWSRequest
     */
    public void setQueryTokenPaymentResultWSRequest(com.bkm.QueryTokenPaymentWSRequest queryTokenPaymentResultWSRequest) {
        this.queryTokenPaymentResultWSRequest = queryTokenPaymentResultWSRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTokenPayment)) return false;
        QueryTokenPayment other = (QueryTokenPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryTokenPaymentResultWSRequest==null && other.getQueryTokenPaymentResultWSRequest()==null) || 
             (this.queryTokenPaymentResultWSRequest!=null &&
              this.queryTokenPaymentResultWSRequest.equals(other.getQueryTokenPaymentResultWSRequest())));
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
        if (getQueryTokenPaymentResultWSRequest() != null) {
            _hashCode += getQueryTokenPaymentResultWSRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryTokenPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTokenPaymentResultWSRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentResultWSRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSRequest"));
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
