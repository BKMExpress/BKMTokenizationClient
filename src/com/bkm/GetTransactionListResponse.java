/**
 * GetTransactionListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetTransactionListResponse  implements java.io.Serializable {
    private com.bkm.GetTransactionListWSResponse getTransactionListWSResponse;

    public GetTransactionListResponse() {
    }

    public GetTransactionListResponse(
           com.bkm.GetTransactionListWSResponse getTransactionListWSResponse) {
           this.getTransactionListWSResponse = getTransactionListWSResponse;
    }


    /**
     * Gets the getTransactionListWSResponse value for this GetTransactionListResponse.
     * 
     * @return getTransactionListWSResponse
     */
    public com.bkm.GetTransactionListWSResponse getGetTransactionListWSResponse() {
        return getTransactionListWSResponse;
    }


    /**
     * Sets the getTransactionListWSResponse value for this GetTransactionListResponse.
     * 
     * @param getTransactionListWSResponse
     */
    public void setGetTransactionListWSResponse(com.bkm.GetTransactionListWSResponse getTransactionListWSResponse) {
        this.getTransactionListWSResponse = getTransactionListWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionListResponse)) return false;
        GetTransactionListResponse other = (GetTransactionListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTransactionListWSResponse==null && other.getGetTransactionListWSResponse()==null) || 
             (this.getTransactionListWSResponse!=null &&
              this.getTransactionListWSResponse.equals(other.getGetTransactionListWSResponse())));
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
        if (getGetTransactionListWSResponse() != null) {
            _hashCode += getGetTransactionListWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTransactionListWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSResponse"));
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
