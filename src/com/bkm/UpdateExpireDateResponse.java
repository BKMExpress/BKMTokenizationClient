/**
 * UpdateExpireDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class UpdateExpireDateResponse  implements java.io.Serializable {
    private com.bkm.UpdateExpireDateWSResponse updateExpireDateWSResponse;

    public UpdateExpireDateResponse() {
    }

    public UpdateExpireDateResponse(
           com.bkm.UpdateExpireDateWSResponse updateExpireDateWSResponse) {
           this.updateExpireDateWSResponse = updateExpireDateWSResponse;
    }


    /**
     * Gets the updateExpireDateWSResponse value for this UpdateExpireDateResponse.
     * 
     * @return updateExpireDateWSResponse
     */
    public com.bkm.UpdateExpireDateWSResponse getUpdateExpireDateWSResponse() {
        return updateExpireDateWSResponse;
    }


    /**
     * Sets the updateExpireDateWSResponse value for this UpdateExpireDateResponse.
     * 
     * @param updateExpireDateWSResponse
     */
    public void setUpdateExpireDateWSResponse(com.bkm.UpdateExpireDateWSResponse updateExpireDateWSResponse) {
        this.updateExpireDateWSResponse = updateExpireDateWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateExpireDateResponse)) return false;
        UpdateExpireDateResponse other = (UpdateExpireDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateExpireDateWSResponse==null && other.getUpdateExpireDateWSResponse()==null) || 
             (this.updateExpireDateWSResponse!=null &&
              this.updateExpireDateWSResponse.equals(other.getUpdateExpireDateWSResponse())));
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
        if (getUpdateExpireDateWSResponse() != null) {
            _hashCode += getUpdateExpireDateWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateExpireDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateExpireDateWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSResponse"));
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
