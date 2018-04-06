/**
 * TokenizationReversalWithNoRefRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationReversalWithNoRefRequest  extends com.bkm.TokenizationReversalBaseRequest  implements java.io.Serializable {
    private java.lang.String bankMerchantId;

    private java.lang.String orderId;

    private java.lang.String posTransactionId;

    private java.lang.String retrievalReferenceNumber;

    private java.lang.String terminalId;

    private java.lang.String bankId;

    private java.lang.String posUrl;

    private java.lang.String cardToken;

    public TokenizationReversalWithNoRefRequest() {
    }

    public TokenizationReversalWithNoRefRequest(
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
           java.lang.String bankMerchantId,
           java.lang.String orderId,
           java.lang.String posTransactionId,
           java.lang.String retrievalReferenceNumber,
           java.lang.String terminalId,
           java.lang.String bankId,
           java.lang.String posUrl,
           java.lang.String cardToken) {
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
        this.bankMerchantId = bankMerchantId;
        this.orderId = orderId;
        this.posTransactionId = posTransactionId;
        this.retrievalReferenceNumber = retrievalReferenceNumber;
        this.terminalId = terminalId;
        this.bankId = bankId;
        this.posUrl = posUrl;
        this.cardToken = cardToken;
    }


    /**
     * Gets the bankMerchantId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return bankMerchantId
     */
    public java.lang.String getBankMerchantId() {
        return bankMerchantId;
    }


    /**
     * Sets the bankMerchantId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param bankMerchantId
     */
    public void setBankMerchantId(java.lang.String bankMerchantId) {
        this.bankMerchantId = bankMerchantId;
    }


    /**
     * Gets the orderId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the posTransactionId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return posTransactionId
     */
    public java.lang.String getPosTransactionId() {
        return posTransactionId;
    }


    /**
     * Sets the posTransactionId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param posTransactionId
     */
    public void setPosTransactionId(java.lang.String posTransactionId) {
        this.posTransactionId = posTransactionId;
    }


    /**
     * Gets the retrievalReferenceNumber value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return retrievalReferenceNumber
     */
    public java.lang.String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }


    /**
     * Sets the retrievalReferenceNumber value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param retrievalReferenceNumber
     */
    public void setRetrievalReferenceNumber(java.lang.String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }


    /**
     * Gets the terminalId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the bankId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return bankId
     */
    public java.lang.String getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.String bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the posUrl value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return posUrl
     */
    public java.lang.String getPosUrl() {
        return posUrl;
    }


    /**
     * Sets the posUrl value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param posUrl
     */
    public void setPosUrl(java.lang.String posUrl) {
        this.posUrl = posUrl;
    }


    /**
     * Gets the cardToken value for this TokenizationReversalWithNoRefRequest.
     * 
     * @return cardToken
     */
    public java.lang.String getCardToken() {
        return cardToken;
    }


    /**
     * Sets the cardToken value for this TokenizationReversalWithNoRefRequest.
     * 
     * @param cardToken
     */
    public void setCardToken(java.lang.String cardToken) {
        this.cardToken = cardToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationReversalWithNoRefRequest)) return false;
        TokenizationReversalWithNoRefRequest other = (TokenizationReversalWithNoRefRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bankMerchantId==null && other.getBankMerchantId()==null) || 
             (this.bankMerchantId!=null &&
              this.bankMerchantId.equals(other.getBankMerchantId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.posTransactionId==null && other.getPosTransactionId()==null) || 
             (this.posTransactionId!=null &&
              this.posTransactionId.equals(other.getPosTransactionId()))) &&
            ((this.retrievalReferenceNumber==null && other.getRetrievalReferenceNumber()==null) || 
             (this.retrievalReferenceNumber!=null &&
              this.retrievalReferenceNumber.equals(other.getRetrievalReferenceNumber()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            ((this.posUrl==null && other.getPosUrl()==null) || 
             (this.posUrl!=null &&
              this.posUrl.equals(other.getPosUrl()))) &&
            ((this.cardToken==null && other.getCardToken()==null) || 
             (this.cardToken!=null &&
              this.cardToken.equals(other.getCardToken())));
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
        if (getBankMerchantId() != null) {
            _hashCode += getBankMerchantId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getPosTransactionId() != null) {
            _hashCode += getPosTransactionId().hashCode();
        }
        if (getRetrievalReferenceNumber() != null) {
            _hashCode += getRetrievalReferenceNumber().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        if (getPosUrl() != null) {
            _hashCode += getPosUrl().hashCode();
        }
        if (getCardToken() != null) {
            _hashCode += getCardToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenizationReversalWithNoRefRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankMerchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankMerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrievalReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrievalReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posUrl"));
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
