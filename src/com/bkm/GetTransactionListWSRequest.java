/**
 * GetTransactionListWSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetTransactionListWSRequest  extends com.bkm.TokenPaymentWSBaseRequest  implements java.io.Serializable {
    private java.lang.String uniqueReferans;

    private java.lang.String merchantId;

    private java.lang.String bankMerchantId;

    private java.lang.String acquirerBankId;

    private java.lang.String settlementDate;

    private java.lang.String pageId;

    private java.lang.String trnxType;

    private java.lang.String transactionToken;

    private java.lang.String extra;

    private java.lang.String ts;

    private java.lang.String s;

    public GetTransactionListWSRequest() {
    }

    public GetTransactionListWSRequest(
           java.lang.String uniqueReferans,
           java.lang.String merchantId,
           java.lang.String bankMerchantId,
           java.lang.String acquirerBankId,
           java.lang.String settlementDate,
           java.lang.String pageId,
           java.lang.String trnxType,
           java.lang.String transactionToken,
           java.lang.String extra,
           java.lang.String ts,
           java.lang.String s) {
        this.uniqueReferans = uniqueReferans;
        this.merchantId = merchantId;
        this.bankMerchantId = bankMerchantId;
        this.acquirerBankId = acquirerBankId;
        this.settlementDate = settlementDate;
        this.pageId = pageId;
        this.trnxType = trnxType;
        this.transactionToken = transactionToken;
        this.extra = extra;
        this.ts = ts;
        this.s = s;
    }


    /**
     * Gets the uniqueReferans value for this GetTransactionListWSRequest.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this GetTransactionListWSRequest.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the merchantId value for this GetTransactionListWSRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this GetTransactionListWSRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the bankMerchantId value for this GetTransactionListWSRequest.
     * 
     * @return bankMerchantId
     */
    public java.lang.String getBankMerchantId() {
        return bankMerchantId;
    }


    /**
     * Sets the bankMerchantId value for this GetTransactionListWSRequest.
     * 
     * @param bankMerchantId
     */
    public void setBankMerchantId(java.lang.String bankMerchantId) {
        this.bankMerchantId = bankMerchantId;
    }


    /**
     * Gets the acquirerBankId value for this GetTransactionListWSRequest.
     * 
     * @return acquirerBankId
     */
    public java.lang.String getAcquirerBankId() {
        return acquirerBankId;
    }


    /**
     * Sets the acquirerBankId value for this GetTransactionListWSRequest.
     * 
     * @param acquirerBankId
     */
    public void setAcquirerBankId(java.lang.String acquirerBankId) {
        this.acquirerBankId = acquirerBankId;
    }


    /**
     * Gets the settlementDate value for this GetTransactionListWSRequest.
     * 
     * @return settlementDate
     */
    public java.lang.String getSettlementDate() {
        return settlementDate;
    }


    /**
     * Sets the settlementDate value for this GetTransactionListWSRequest.
     * 
     * @param settlementDate
     */
    public void setSettlementDate(java.lang.String settlementDate) {
        this.settlementDate = settlementDate;
    }


    /**
     * Gets the pageId value for this GetTransactionListWSRequest.
     * 
     * @return pageId
     */
    public java.lang.String getPageId() {
        return pageId;
    }


    /**
     * Sets the pageId value for this GetTransactionListWSRequest.
     * 
     * @param pageId
     */
    public void setPageId(java.lang.String pageId) {
        this.pageId = pageId;
    }


    /**
     * Gets the trnxType value for this GetTransactionListWSRequest.
     * 
     * @return trnxType
     */
    public java.lang.String getTrnxType() {
        return trnxType;
    }


    /**
     * Sets the trnxType value for this GetTransactionListWSRequest.
     * 
     * @param trnxType
     */
    public void setTrnxType(java.lang.String trnxType) {
        this.trnxType = trnxType;
    }


    /**
     * Gets the transactionToken value for this GetTransactionListWSRequest.
     * 
     * @return transactionToken
     */
    public java.lang.String getTransactionToken() {
        return transactionToken;
    }


    /**
     * Sets the transactionToken value for this GetTransactionListWSRequest.
     * 
     * @param transactionToken
     */
    public void setTransactionToken(java.lang.String transactionToken) {
        this.transactionToken = transactionToken;
    }


    /**
     * Gets the extra value for this GetTransactionListWSRequest.
     * 
     * @return extra
     */
    public java.lang.String getExtra() {
        return extra;
    }


    /**
     * Sets the extra value for this GetTransactionListWSRequest.
     * 
     * @param extra
     */
    public void setExtra(java.lang.String extra) {
        this.extra = extra;
    }


    /**
     * Gets the ts value for this GetTransactionListWSRequest.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this GetTransactionListWSRequest.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this GetTransactionListWSRequest.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this GetTransactionListWSRequest.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionListWSRequest)) return false;
        GetTransactionListWSRequest other = (GetTransactionListWSRequest) obj;
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
            ((this.acquirerBankId==null && other.getAcquirerBankId()==null) || 
             (this.acquirerBankId!=null &&
              this.acquirerBankId.equals(other.getAcquirerBankId()))) &&
            ((this.settlementDate==null && other.getSettlementDate()==null) || 
             (this.settlementDate!=null &&
              this.settlementDate.equals(other.getSettlementDate()))) &&
            ((this.pageId==null && other.getPageId()==null) || 
             (this.pageId!=null &&
              this.pageId.equals(other.getPageId()))) &&
            ((this.trnxType==null && other.getTrnxType()==null) || 
             (this.trnxType!=null &&
              this.trnxType.equals(other.getTrnxType()))) &&
            ((this.transactionToken==null && other.getTransactionToken()==null) || 
             (this.transactionToken!=null &&
              this.transactionToken.equals(other.getTransactionToken()))) &&
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
        if (getAcquirerBankId() != null) {
            _hashCode += getAcquirerBankId().hashCode();
        }
        if (getSettlementDate() != null) {
            _hashCode += getSettlementDate().hashCode();
        }
        if (getPageId() != null) {
            _hashCode += getPageId().hashCode();
        }
        if (getTrnxType() != null) {
            _hashCode += getTrnxType().hashCode();
        }
        if (getTransactionToken() != null) {
            _hashCode += getTransactionToken().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetTransactionListWSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSRequest"));
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
        elemField.setFieldName("acquirerBankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acquirerBankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnxType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trnxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
