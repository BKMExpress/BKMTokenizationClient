/**
 * TokenizationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationResult  implements java.io.Serializable {
    private int resultCode;

    private int subResultCode;

    private java.lang.String resultMsg;

    public TokenizationResult() {
    }

    public TokenizationResult(
           int resultCode,
           int subResultCode,
           java.lang.String resultMsg) {
           this.resultCode = resultCode;
           this.subResultCode = subResultCode;
           this.resultMsg = resultMsg;
    }


    /**
     * Gets the resultCode value for this TokenizationResult.
     * 
     * @return resultCode
     */
    public int getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this TokenizationResult.
     * 
     * @param resultCode
     */
    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the subResultCode value for this TokenizationResult.
     * 
     * @return subResultCode
     */
    public int getSubResultCode() {
        return subResultCode;
    }


    /**
     * Sets the subResultCode value for this TokenizationResult.
     * 
     * @param subResultCode
     */
    public void setSubResultCode(int subResultCode) {
        this.subResultCode = subResultCode;
    }


    /**
     * Gets the resultMsg value for this TokenizationResult.
     * 
     * @return resultMsg
     */
    public java.lang.String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this TokenizationResult.
     * 
     * @param resultMsg
     */
    public void setResultMsg(java.lang.String resultMsg) {
        this.resultMsg = resultMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationResult)) return false;
        TokenizationResult other = (TokenizationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultCode == other.getResultCode() &&
            this.subResultCode == other.getSubResultCode() &&
            ((this.resultMsg==null && other.getResultMsg()==null) || 
             (this.resultMsg!=null &&
              this.resultMsg.equals(other.getResultMsg())));
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
        _hashCode += getResultCode();
        _hashCode += getSubResultCode();
        if (getResultMsg() != null) {
            _hashCode += getResultMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenizationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
