/**
 * TokenizationWSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationWSResponse  extends com.bkm.TokenizationWSBaseResponse  implements java.io.Serializable {
    private java.lang.String uniqueReferans;

    private java.lang.String cardToken;

    private java.lang.String directURL;

    private java.lang.String transactionId;

    private java.lang.String bankResponseCode;

    private java.lang.String ts;

    private java.lang.String s;

    public TokenizationWSResponse() {
    }

    public TokenizationWSResponse(
           com.bkm.TokenizationResult result,
           java.lang.String uniqueReferans,
           java.lang.String cardToken,
           java.lang.String directURL,
           java.lang.String transactionId,
           java.lang.String bankResponseCode,
           java.lang.String ts,
           java.lang.String s) {
        super(
            result);
        this.uniqueReferans = uniqueReferans;
        this.cardToken = cardToken;
        this.directURL = directURL;
        this.transactionId = transactionId;
        this.bankResponseCode = bankResponseCode;
        this.ts = ts;
        this.s = s;
    }


    /**
     * Gets the uniqueReferans value for this TokenizationWSResponse.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this TokenizationWSResponse.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the cardToken value for this TokenizationWSResponse.
     * 
     * @return cardToken
     */
    public java.lang.String getCardToken() {
        return cardToken;
    }


    /**
     * Sets the cardToken value for this TokenizationWSResponse.
     * 
     * @param cardToken
     */
    public void setCardToken(java.lang.String cardToken) {
        this.cardToken = cardToken;
    }


    /**
     * Gets the directURL value for this TokenizationWSResponse.
     * 
     * @return directURL
     */
    public java.lang.String getDirectURL() {
        return directURL;
    }


    /**
     * Sets the directURL value for this TokenizationWSResponse.
     * 
     * @param directURL
     */
    public void setDirectURL(java.lang.String directURL) {
        this.directURL = directURL;
    }


    /**
     * Gets the transactionId value for this TokenizationWSResponse.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TokenizationWSResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the bankResponseCode value for this TokenizationWSResponse.
     * 
     * @return bankResponseCode
     */
    public java.lang.String getBankResponseCode() {
        return bankResponseCode;
    }


    /**
     * Sets the bankResponseCode value for this TokenizationWSResponse.
     * 
     * @param bankResponseCode
     */
    public void setBankResponseCode(java.lang.String bankResponseCode) {
        this.bankResponseCode = bankResponseCode;
    }


    /**
     * Gets the ts value for this TokenizationWSResponse.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this TokenizationWSResponse.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this TokenizationWSResponse.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this TokenizationWSResponse.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationWSResponse)) return false;
        TokenizationWSResponse other = (TokenizationWSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uniqueReferans==null && other.getUniqueReferans()==null) || 
             (this.uniqueReferans!=null &&
              this.uniqueReferans.equals(other.getUniqueReferans()))) &&
            ((this.cardToken==null && other.getCardToken()==null) || 
             (this.cardToken!=null &&
              this.cardToken.equals(other.getCardToken()))) &&
            ((this.directURL==null && other.getDirectURL()==null) || 
             (this.directURL!=null &&
              this.directURL.equals(other.getDirectURL()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.bankResponseCode==null && other.getBankResponseCode()==null) || 
             (this.bankResponseCode!=null &&
              this.bankResponseCode.equals(other.getBankResponseCode()))) &&
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
        int _hashCode = super.hashCode();
        if (getUniqueReferans() != null) {
            _hashCode += getUniqueReferans().hashCode();
        }
        if (getCardToken() != null) {
            _hashCode += getCardToken().hashCode();
        }
        if (getDirectURL() != null) {
            _hashCode += getDirectURL().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getBankResponseCode() != null) {
            _hashCode += getBankResponseCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(TokenizationWSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueReferans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueReferans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankResponseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
