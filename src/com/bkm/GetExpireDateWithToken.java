/**
 * GetExpireDateWithToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetExpireDateWithToken  implements java.io.Serializable {
    private com.bkm.GetExpireDateWSRequest getExpireDateWSRequest;

    public GetExpireDateWithToken() {
    }

    public GetExpireDateWithToken(
           com.bkm.GetExpireDateWSRequest getExpireDateWSRequest) {
           this.getExpireDateWSRequest = getExpireDateWSRequest;
    }


    /**
     * Gets the getExpireDateWSRequest value for this GetExpireDateWithToken.
     * 
     * @return getExpireDateWSRequest
     */
    public com.bkm.GetExpireDateWSRequest getGetExpireDateWSRequest() {
        return getExpireDateWSRequest;
    }


    /**
     * Sets the getExpireDateWSRequest value for this GetExpireDateWithToken.
     * 
     * @param getExpireDateWSRequest
     */
    public void setGetExpireDateWSRequest(com.bkm.GetExpireDateWSRequest getExpireDateWSRequest) {
        this.getExpireDateWSRequest = getExpireDateWSRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExpireDateWithToken)) return false;
        GetExpireDateWithToken other = (GetExpireDateWithToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getExpireDateWSRequest==null && other.getGetExpireDateWSRequest()==null) || 
             (this.getExpireDateWSRequest!=null &&
              this.getExpireDateWSRequest.equals(other.getGetExpireDateWSRequest())));
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
        if (getGetExpireDateWSRequest() != null) {
            _hashCode += getGetExpireDateWSRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExpireDateWithToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWithToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExpireDateWSRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSRequest"));
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
