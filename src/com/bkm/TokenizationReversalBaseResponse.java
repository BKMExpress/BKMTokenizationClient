/**
 * TokenizationReversalBaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationReversalBaseResponse  implements java.io.Serializable {
    private com.bkm.ReversalResult result;

    private java.lang.String uniqueReferans;

    private java.lang.String ts;

    private java.lang.String s;

    public TokenizationReversalBaseResponse() {
    }

    public TokenizationReversalBaseResponse(
           com.bkm.ReversalResult result,
           java.lang.String uniqueReferans,
           java.lang.String ts,
           java.lang.String s) {
           this.result = result;
           this.uniqueReferans = uniqueReferans;
           this.ts = ts;
           this.s = s;
    }


    /**
     * Gets the result value for this TokenizationReversalBaseResponse.
     * 
     * @return result
     */
    public com.bkm.ReversalResult getResult() {
        return result;
    }


    /**
     * Sets the result value for this TokenizationReversalBaseResponse.
     * 
     * @param result
     */
    public void setResult(com.bkm.ReversalResult result) {
        this.result = result;
    }


    /**
     * Gets the uniqueReferans value for this TokenizationReversalBaseResponse.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this TokenizationReversalBaseResponse.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the ts value for this TokenizationReversalBaseResponse.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this TokenizationReversalBaseResponse.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this TokenizationReversalBaseResponse.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this TokenizationReversalBaseResponse.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationReversalBaseResponse)) return false;
        TokenizationReversalBaseResponse other = (TokenizationReversalBaseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.uniqueReferans==null && other.getUniqueReferans()==null) || 
             (this.uniqueReferans!=null &&
              this.uniqueReferans.equals(other.getUniqueReferans()))) &&
            ((this.ts==null && other.getTs()==null) || 
             (this.ts!=null &&
              this.ts.equals(other.getTs()))) &&
            ((this.s==null && other.getS()==null) || 
             (this.s!=null &&
              this.s.equals(other.getS())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getUniqueReferans() != null) {
            _hashCode += getUniqueReferans().hashCode();
        }
        if (getTs() != null) {
            _hashCode += getTs().hashCode();
        }
        if (getS() != null) {
            _hashCode += getS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenizationReversalBaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalBaseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueReferans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueReferans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s");
        elemField.setXmlName(new javax.xml.namespace.QName("", "s"));
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
