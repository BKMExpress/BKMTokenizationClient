/**
 * GetTokenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetTokenResponse  implements java.io.Serializable {
    private com.bkm.TokenizationWSResponse tokenizationWSResponse;

    public GetTokenResponse() {
    }

    public GetTokenResponse(
           com.bkm.TokenizationWSResponse tokenizationWSResponse) {
           this.tokenizationWSResponse = tokenizationWSResponse;
    }


    /**
     * Gets the tokenizationWSResponse value for this GetTokenResponse.
     * 
     * @return tokenizationWSResponse
     */
    public com.bkm.TokenizationWSResponse getTokenizationWSResponse() {
        return tokenizationWSResponse;
    }


    /**
     * Sets the tokenizationWSResponse value for this GetTokenResponse.
     * 
     * @param tokenizationWSResponse
     */
    public void setTokenizationWSResponse(com.bkm.TokenizationWSResponse tokenizationWSResponse) {
        this.tokenizationWSResponse = tokenizationWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTokenResponse)) return false;
        GetTokenResponse other = (GetTokenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tokenizationWSResponse==null && other.getTokenizationWSResponse()==null) || 
             (this.tokenizationWSResponse!=null &&
              this.tokenizationWSResponse.equals(other.getTokenizationWSResponse())));
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
        if (getTokenizationWSResponse() != null) {
            _hashCode += getTokenizationWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTokenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTokenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenizationWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSResponse"));
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
