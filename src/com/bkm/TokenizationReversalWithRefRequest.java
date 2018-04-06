/**
 * TokenizationReversalWithRefRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationReversalWithRefRequest  extends com.bkm.TokenizationReversalBaseRequest  implements java.io.Serializable {
    private java.lang.String transactionToken;

    public TokenizationReversalWithRefRequest() {
    }

    public TokenizationReversalWithRefRequest(
           java.lang.String ts,
           java.lang.String s,
           java.lang.String uniqueReferans,
           java.lang.String merchantId,
           java.lang.String requestType,
           java.lang.String amount,
           java.lang.String currency,
           java.lang.String posUid,
           java.lang.String posPwd,
           java.lang.String extra,
           java.lang.String transactionToken) {
        super(
            ts,
            s,
            uniqueReferans,
            merchantId,
            requestType,
            amount,
            currency,
            posUid,
            posPwd,
            extra);
        this.transactionToken = transactionToken;
    }


    /**
     * Gets the transactionToken value for this TokenizationReversalWithRefRequest.
     * 
     * @return transactionToken
     */
    public java.lang.String getTransactionToken() {
        return transactionToken;
    }


    /**
     * Sets the transactionToken value for this TokenizationReversalWithRefRequest.
     * 
     * @param transactionToken
     */
    public void setTransactionToken(java.lang.String transactionToken) {
        this.transactionToken = transactionToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationReversalWithRefRequest)) return false;
        TokenizationReversalWithRefRequest other = (TokenizationReversalWithRefRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionToken==null && other.getTransactionToken()==null) || 
             (this.transactionToken!=null &&
              this.transactionToken.equals(other.getTransactionToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTransactionToken() != null) {
            _hashCode += getTransactionToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenizationReversalWithRefRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithRefRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionToken"));
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
