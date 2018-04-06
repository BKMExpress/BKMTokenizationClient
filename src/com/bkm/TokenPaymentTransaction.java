/**
 * TokenPaymentTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenPaymentTransaction  implements java.io.Serializable {
    private java.lang.String acquirerBankId;

    private java.lang.String amount;

    private java.lang.String cardNumber;

    private java.lang.String currency;

    private java.lang.String issuerBankId;

    private java.lang.String numberOfInstallment;

    private java.lang.String orderId;

    private java.lang.String status;

    private java.lang.String trnxType;

    private java.lang.String uniqueReference;

    public TokenPaymentTransaction() {
    }

    public TokenPaymentTransaction(
           java.lang.String acquirerBankId,
           java.lang.String amount,
           java.lang.String cardNumber,
           java.lang.String currency,
           java.lang.String issuerBankId,
           java.lang.String numberOfInstallment,
           java.lang.String orderId,
           java.lang.String status,
           java.lang.String trnxType,
           java.lang.String uniqueReference) {
           this.acquirerBankId = acquirerBankId;
           this.amount = amount;
           this.cardNumber = cardNumber;
           this.currency = currency;
           this.issuerBankId = issuerBankId;
           this.numberOfInstallment = numberOfInstallment;
           this.orderId = orderId;
           this.status = status;
           this.trnxType = trnxType;
           this.uniqueReference = uniqueReference;
    }


    /**
     * Gets the acquirerBankId value for this TokenPaymentTransaction.
     * 
     * @return acquirerBankId
     */
    public java.lang.String getAcquirerBankId() {
        return acquirerBankId;
    }


    /**
     * Sets the acquirerBankId value for this TokenPaymentTransaction.
     * 
     * @param acquirerBankId
     */
    public void setAcquirerBankId(java.lang.String acquirerBankId) {
        this.acquirerBankId = acquirerBankId;
    }


    /**
     * Gets the amount value for this TokenPaymentTransaction.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TokenPaymentTransaction.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardNumber value for this TokenPaymentTransaction.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this TokenPaymentTransaction.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the currency value for this TokenPaymentTransaction.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TokenPaymentTransaction.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the issuerBankId value for this TokenPaymentTransaction.
     * 
     * @return issuerBankId
     */
    public java.lang.String getIssuerBankId() {
        return issuerBankId;
    }


    /**
     * Sets the issuerBankId value for this TokenPaymentTransaction.
     * 
     * @param issuerBankId
     */
    public void setIssuerBankId(java.lang.String issuerBankId) {
        this.issuerBankId = issuerBankId;
    }


    /**
     * Gets the numberOfInstallment value for this TokenPaymentTransaction.
     * 
     * @return numberOfInstallment
     */
    public java.lang.String getNumberOfInstallment() {
        return numberOfInstallment;
    }


    /**
     * Sets the numberOfInstallment value for this TokenPaymentTransaction.
     * 
     * @param numberOfInstallment
     */
    public void setNumberOfInstallment(java.lang.String numberOfInstallment) {
        this.numberOfInstallment = numberOfInstallment;
    }


    /**
     * Gets the orderId value for this TokenPaymentTransaction.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this TokenPaymentTransaction.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the status value for this TokenPaymentTransaction.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TokenPaymentTransaction.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the trnxType value for this TokenPaymentTransaction.
     * 
     * @return trnxType
     */
    public java.lang.String getTrnxType() {
        return trnxType;
    }


    /**
     * Sets the trnxType value for this TokenPaymentTransaction.
     * 
     * @param trnxType
     */
    public void setTrnxType(java.lang.String trnxType) {
        this.trnxType = trnxType;
    }


    /**
     * Gets the uniqueReference value for this TokenPaymentTransaction.
     * 
     * @return uniqueReference
     */
    public java.lang.String getUniqueReference() {
        return uniqueReference;
    }


    /**
     * Sets the uniqueReference value for this TokenPaymentTransaction.
     * 
     * @param uniqueReference
     */
    public void setUniqueReference(java.lang.String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenPaymentTransaction)) return false;
        TokenPaymentTransaction other = (TokenPaymentTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acquirerBankId==null && other.getAcquirerBankId()==null) || 
             (this.acquirerBankId!=null &&
              this.acquirerBankId.equals(other.getAcquirerBankId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.issuerBankId==null && other.getIssuerBankId()==null) || 
             (this.issuerBankId!=null &&
              this.issuerBankId.equals(other.getIssuerBankId()))) &&
            ((this.numberOfInstallment==null && other.getNumberOfInstallment()==null) || 
             (this.numberOfInstallment!=null &&
              this.numberOfInstallment.equals(other.getNumberOfInstallment()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.trnxType==null && other.getTrnxType()==null) || 
             (this.trnxType!=null &&
              this.trnxType.equals(other.getTrnxType()))) &&
            ((this.uniqueReference==null && other.getUniqueReference()==null) || 
             (this.uniqueReference!=null &&
              this.uniqueReference.equals(other.getUniqueReference())));
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
        if (getAcquirerBankId() != null) {
            _hashCode += getAcquirerBankId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getIssuerBankId() != null) {
            _hashCode += getIssuerBankId().hashCode();
        }
        if (getNumberOfInstallment() != null) {
            _hashCode += getNumberOfInstallment().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTrnxType() != null) {
            _hashCode += getTrnxType().hashCode();
        }
        if (getUniqueReference() != null) {
            _hashCode += getUniqueReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenPaymentTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquirerBankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acquirerBankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerBankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerBankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfInstallment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfInstallment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnxType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trnxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
