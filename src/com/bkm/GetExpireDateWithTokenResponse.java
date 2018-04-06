/**
 * GetExpireDateWithTokenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetExpireDateWithTokenResponse  implements java.io.Serializable {
    private com.bkm.GetExpireDateWSResponse getExpireDateWSResponse;

    public GetExpireDateWithTokenResponse() {
    }

    public GetExpireDateWithTokenResponse(
           com.bkm.GetExpireDateWSResponse getExpireDateWSResponse) {
           this.getExpireDateWSResponse = getExpireDateWSResponse;
    }


    /**
     * Gets the getExpireDateWSResponse value for this GetExpireDateWithTokenResponse.
     * 
     * @return getExpireDateWSResponse
     */
    public com.bkm.GetExpireDateWSResponse getGetExpireDateWSResponse() {
        return getExpireDateWSResponse;
    }


    /**
     * Sets the getExpireDateWSResponse value for this GetExpireDateWithTokenResponse.
     * 
     * @param getExpireDateWSResponse
     */
    public void setGetExpireDateWSResponse(com.bkm.GetExpireDateWSResponse getExpireDateWSResponse) {
        this.getExpireDateWSResponse = getExpireDateWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExpireDateWithTokenResponse)) return false;
        GetExpireDateWithTokenResponse other = (GetExpireDateWithTokenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getExpireDateWSResponse==null && other.getGetExpireDateWSResponse()==null) || 
             (this.getExpireDateWSResponse!=null &&
              this.getExpireDateWSResponse.equals(other.getGetExpireDateWSResponse())));
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
        if (getGetExpireDateWSResponse() != null) {
            _hashCode += getGetExpireDateWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExpireDateWithTokenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWithTokenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExpireDateWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSResponse"));
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
