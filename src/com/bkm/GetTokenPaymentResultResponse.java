/**
 * GetTokenPaymentResultResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetTokenPaymentResultResponse  implements java.io.Serializable {
    private com.bkm.TokenPaymentWSResponse tokenPaymentWSResponse;

    public GetTokenPaymentResultResponse() {
    }

    public GetTokenPaymentResultResponse(
           com.bkm.TokenPaymentWSResponse tokenPaymentWSResponse) {
           this.tokenPaymentWSResponse = tokenPaymentWSResponse;
    }


    /**
     * Gets the tokenPaymentWSResponse value for this GetTokenPaymentResultResponse.
     * 
     * @return tokenPaymentWSResponse
     */
    public com.bkm.TokenPaymentWSResponse getTokenPaymentWSResponse() {
        return tokenPaymentWSResponse;
    }


    /**
     * Sets the tokenPaymentWSResponse value for this GetTokenPaymentResultResponse.
     * 
     * @param tokenPaymentWSResponse
     */
    public void setTokenPaymentWSResponse(com.bkm.TokenPaymentWSResponse tokenPaymentWSResponse) {
        this.tokenPaymentWSResponse = tokenPaymentWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTokenPaymentResultResponse)) return false;
        GetTokenPaymentResultResponse other = (GetTokenPaymentResultResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tokenPaymentWSResponse==null && other.getTokenPaymentWSResponse()==null) || 
             (this.tokenPaymentWSResponse!=null &&
              this.tokenPaymentWSResponse.equals(other.getTokenPaymentWSResponse())));
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
        if (getTokenPaymentWSResponse() != null) {
            _hashCode += getTokenPaymentWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTokenPaymentResultResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTokenPaymentResultResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenPaymentWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSResponse"));
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
