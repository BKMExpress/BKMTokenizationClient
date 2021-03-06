/**
 * TokenPaymentWSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenPaymentWSRequest  extends com.bkm.TokenPaymentWSBaseRequest  implements java.io.Serializable {
    private java.lang.String uniqueReferans;

    private java.lang.String merchantId;

    private java.lang.String bankMerchantId;

    private java.lang.String totalAmount;

    private java.lang.String currency;

    private java.lang.String numberOfInstallment;

    private java.lang.String orderId;

    private java.lang.String cardToken;

    private java.lang.String acquirerBankId;

    private java.lang.String acquirerPosURL;

    private java.lang.String extra;

    private java.lang.String ts;

    private java.lang.String s;

    public TokenPaymentWSRequest() {
    }

    public TokenPaymentWSRequest(
           java.lang.String uniqueReferans,
           java.lang.String merchantId,
           java.lang.String bankMerchantId,
           java.lang.String totalAmount,
           java.lang.String currency,
           java.lang.String numberOfInstallment,
           java.lang.String orderId,
           java.lang.String cardToken,
           java.lang.String acquirerBankId,
           java.lang.String acquirerPosURL,
           java.lang.String extra,
           java.lang.String ts,
           java.lang.String s) {
        this.uniqueReferans = uniqueReferans;
        this.merchantId = merchantId;
        this.bankMerchantId = bankMerchantId;
        this.totalAmount = totalAmount;
        this.currency = currency;
        this.numberOfInstallment = numberOfInstallment;
        this.orderId = orderId;
        this.cardToken = cardToken;
        this.acquirerBankId = acquirerBankId;
        this.acquirerPosURL = acquirerPosURL;
        this.extra = extra;
        this.ts = ts;
        this.s = s;
    }


    /**
     * Gets the uniqueReferans value for this TokenPaymentWSRequest.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this TokenPaymentWSRequest.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the merchantId value for this TokenPaymentWSRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this TokenPaymentWSRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the bankMerchantId value for this TokenPaymentWSRequest.
     * 
     * @return bankMerchantId
     */
    public java.lang.String getBankMerchantId() {
        return bankMerchantId;
    }


    /**
     * Sets the bankMerchantId value for this TokenPaymentWSRequest.
     * 
     * @param bankMerchantId
     */
    public void setBankMerchantId(java.lang.String bankMerchantId) {
        this.bankMerchantId = bankMerchantId;
    }


    /**
     * Gets the totalAmount value for this TokenPaymentWSRequest.
     * 
     * @return totalAmount
     */
    public java.lang.String getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this TokenPaymentWSRequest.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.String totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the currency value for this TokenPaymentWSRequest.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TokenPaymentWSRequest.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the numberOfInstallment value for this TokenPaymentWSRequest.
     * 
     * @return numberOfInstallment
     */
    public java.lang.String getNumberOfInstallment() {
        return numberOfInstallment;
    }


    /**
     * Sets the numberOfInstallment value for this TokenPaymentWSRequest.
     * 
     * @param numberOfInstallment
     */
    public void setNumberOfInstallment(java.lang.String numberOfInstallment) {
        this.numberOfInstallment = numberOfInstallment;
    }


    /**
     * Gets the orderId value for this TokenPaymentWSRequest.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this TokenPaymentWSRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the cardToken value for this TokenPaymentWSRequest.
     * 
     * @return cardToken
     */
    public java.lang.String getCardToken() {
        return cardToken;
    }


    /**
     * Sets the cardToken value for this TokenPaymentWSRequest.
     * 
     * @param cardToken
     */
    public void setCardToken(java.lang.String cardToken) {
        this.cardToken = cardToken;
    }


    /**
     * Gets the acquirerBankId value for this TokenPaymentWSRequest.
     * 
     * @return acquirerBankId
     */
    public java.lang.String getAcquirerBankId() {
        return acquirerBankId;
    }


    /**
     * Sets the acquirerBankId value for this TokenPaymentWSRequest.
     * 
     * @param acquirerBankId
     */
    public void setAcquirerBankId(java.lang.String acquirerBankId) {
        this.acquirerBankId = acquirerBankId;
    }


    /**
     * Gets the acquirerPosURL value for this TokenPaymentWSRequest.
     * 
     * @return acquirerPosURL
     */
    public java.lang.String getAcquirerPosURL() {
        return acquirerPosURL;
    }


    /**
     * Sets the acquirerPosURL value for this TokenPaymentWSRequest.
     * 
     * @param acquirerPosURL
     */
    public void setAcquirerPosURL(java.lang.String acquirerPosURL) {
        this.acquirerPosURL = acquirerPosURL;
    }


    /**
     * Gets the extra value for this TokenPaymentWSRequest.
     * 
     * @return extra
     */
    public java.lang.String getExtra() {
        return extra;
    }


    /**
     * Sets the extra value for this TokenPaymentWSRequest.
     * 
     * @param extra
     */
    public void setExtra(java.lang.String extra) {
        this.extra = extra;
    }


    /**
     * Gets the ts value for this TokenPaymentWSRequest.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this TokenPaymentWSRequest.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this TokenPaymentWSRequest.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this TokenPaymentWSRequest.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenPaymentWSRequest)) return false;
        TokenPaymentWSRequest other = (TokenPaymentWSRequest) obj;
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
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.bankMerchantId==null && other.getBankMerchantId()==null) || 
             (this.bankMerchantId!=null &&
              this.bankMerchantId.equals(other.getBankMerchantId()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.numberOfInstallment==null && other.getNumberOfInstallment()==null) || 
             (this.numberOfInstallment!=null &&
              this.numberOfInstallment.equals(other.getNumberOfInstallment()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.cardToken==null && other.getCardToken()==null) || 
             (this.cardToken!=null &&
              this.cardToken.equals(other.getCardToken()))) &&
            ((this.acquirerBankId==null && other.getAcquirerBankId()==null) || 
             (this.acquirerBankId!=null &&
              this.acquirerBankId.equals(other.getAcquirerBankId()))) &&
            ((this.acquirerPosURL==null && other.getAcquirerPosURL()==null) || 
             (this.acquirerPosURL!=null &&
              this.acquirerPosURL.equals(other.getAcquirerPosURL()))) &&
            ((this.extra==null && other.getExtra()==null) || 
             (this.extra!=null &&
              this.extra.equals(other.getExtra()))) &&
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
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getBankMerchantId() != null) {
            _hashCode += getBankMerchantId().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getNumberOfInstallment() != null) {
            _hashCode += getNumberOfInstallment().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getCardToken() != null) {
            _hashCode += getCardToken().hashCode();
        }
        if (getAcquirerBankId() != null) {
            _hashCode += getAcquirerBankId().hashCode();
        }
        if (getAcquirerPosURL() != null) {
            _hashCode += getAcquirerPosURL().hashCode();
        }
        if (getExtra() != null) {
            _hashCode += getExtra().hashCode();
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
        new org.apache.axis.description.TypeDesc(TokenPaymentWSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueReferans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueReferans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankMerchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankMerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfInstallment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfInstallment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
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
        elemField.setFieldName("acquirerBankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acquirerBankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acquirerPosURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acquirerPosURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s");
        elemField.setXmlName(new javax.xml.namespace.QName("", "s"));
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
