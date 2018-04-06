/**
 * UpdateExpireDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class UpdateExpireDate  implements java.io.Serializable {
    private java.lang.Object updateExpireDateWSRequest;

    public UpdateExpireDate() {
    }

    public UpdateExpireDate(
           java.lang.Object updateExpireDateWSRequest) {
           this.updateExpireDateWSRequest = updateExpireDateWSRequest;
    }


    /**
     * Gets the updateExpireDateWSRequest value for this UpdateExpireDate.
     * 
     * @return updateExpireDateWSRequest
     */
    public java.lang.Object getUpdateExpireDateWSRequest() {
        return updateExpireDateWSRequest;
    }


    /**
     * Sets the updateExpireDateWSRequest value for this UpdateExpireDate.
     * 
     * @param updateExpireDateWSRequest
     */
    public void setUpdateExpireDateWSRequest(java.lang.Object updateExpireDateWSRequest) {
        this.updateExpireDateWSRequest = updateExpireDateWSRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateExpireDate)) return false;
        UpdateExpireDate other = (UpdateExpireDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateExpireDateWSRequest==null && other.getUpdateExpireDateWSRequest()==null) || 
             (this.updateExpireDateWSRequest!=null &&
              this.updateExpireDateWSRequest.equals(other.getUpdateExpireDateWSRequest())));
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
        if (getUpdateExpireDateWSRequest() != null) {
            _hashCode += getUpdateExpireDateWSRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateExpireDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateExpireDateWSRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
