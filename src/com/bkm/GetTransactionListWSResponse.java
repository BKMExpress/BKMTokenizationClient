/**
 * GetTransactionListWSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetTransactionListWSResponse  extends com.bkm.TokenPaymentWSBaseResponse  implements java.io.Serializable {
    private java.lang.String uniqueReferans;

    private java.lang.String merchantId;

    private java.lang.String bankMerchantId;

    private java.lang.String settlementDate;

    private com.bkm.PagingInfo pagingInfo;

    private com.bkm.TokenTransactionInfo[] transactions;

    private java.lang.String extra;

    private java.lang.String ts;

    private java.lang.String s;

    public GetTransactionListWSResponse() {
    }

    public GetTransactionListWSResponse(
           com.bkm.TokenPaymentResult result,
           java.lang.String uniqueReferans,
           java.lang.String merchantId,
           java.lang.String bankMerchantId,
           java.lang.String settlementDate,
           com.bkm.PagingInfo pagingInfo,
           com.bkm.TokenTransactionInfo[] transactions,
           java.lang.String extra,
           java.lang.String ts,
           java.lang.String s) {
        super(
            result);
        this.uniqueReferans = uniqueReferans;
        this.merchantId = merchantId;
        this.bankMerchantId = bankMerchantId;
        this.settlementDate = settlementDate;
        this.pagingInfo = pagingInfo;
        this.transactions = transactions;
        this.extra = extra;
        this.ts = ts;
        this.s = s;
    }


    /**
     * Gets the uniqueReferans value for this GetTransactionListWSResponse.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this GetTransactionListWSResponse.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the merchantId value for this GetTransactionListWSResponse.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this GetTransactionListWSResponse.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the bankMerchantId value for this GetTransactionListWSResponse.
     * 
     * @return bankMerchantId
     */
    public java.lang.String getBankMerchantId() {
        return bankMerchantId;
    }


    /**
     * Sets the bankMerchantId value for this GetTransactionListWSResponse.
     * 
     * @param bankMerchantId
     */
    public void setBankMerchantId(java.lang.String bankMerchantId) {
        this.bankMerchantId = bankMerchantId;
    }


    /**
     * Gets the settlementDate value for this GetTransactionListWSResponse.
     * 
     * @return settlementDate
     */
    public java.lang.String getSettlementDate() {
        return settlementDate;
    }


    /**
     * Sets the settlementDate value for this GetTransactionListWSResponse.
     * 
     * @param settlementDate
     */
    public void setSettlementDate(java.lang.String settlementDate) {
        this.settlementDate = settlementDate;
    }


    /**
     * Gets the pagingInfo value for this GetTransactionListWSResponse.
     * 
     * @return pagingInfo
     */
    public com.bkm.PagingInfo getPagingInfo() {
        return pagingInfo;
    }


    /**
     * Sets the pagingInfo value for this GetTransactionListWSResponse.
     * 
     * @param pagingInfo
     */
    public void setPagingInfo(com.bkm.PagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
    }


    /**
     * Gets the transactions value for this GetTransactionListWSResponse.
     * 
     * @return transactions
     */
    public com.bkm.TokenTransactionInfo[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this GetTransactionListWSResponse.
     * 
     * @param transactions
     */
    public void setTransactions(com.bkm.TokenTransactionInfo[] transactions) {
        this.transactions = transactions;
    }

    public com.bkm.TokenTransactionInfo getTransactions(int i) {
        return this.transactions[i];
    }

    public void setTransactions(int i, com.bkm.TokenTransactionInfo _value) {
        this.transactions[i] = _value;
    }


    /**
     * Gets the extra value for this GetTransactionListWSResponse.
     * 
     * @return extra
     */
    public java.lang.String getExtra() {
        return extra;
    }


    /**
     * Sets the extra value for this GetTransactionListWSResponse.
     * 
     * @param extra
     */
    public void setExtra(java.lang.String extra) {
        this.extra = extra;
    }


    /**
     * Gets the ts value for this GetTransactionListWSResponse.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this GetTransactionListWSResponse.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this GetTransactionListWSResponse.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this GetTransactionListWSResponse.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionListWSResponse)) return false;
        GetTransactionListWSResponse other = (GetTransactionListWSResponse) obj;
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
            ((this.settlementDate==null && other.getSettlementDate()==null) || 
             (this.settlementDate!=null &&
              this.settlementDate.equals(other.getSettlementDate()))) &&
            ((this.pagingInfo==null && other.getPagingInfo()==null) || 
             (this.pagingInfo!=null &&
              this.pagingInfo.equals(other.getPagingInfo()))) &&
            ((this.transactions==null && other.getTransactions()==null) || 
             (this.transactions!=null &&
              java.util.Arrays.equals(this.transactions, other.getTransactions()))) &&
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
        if (getSettlementDate() != null) {
            _hashCode += getSettlementDate().hashCode();
        }
        if (getPagingInfo() != null) {
            _hashCode += getPagingInfo().hashCode();
        }
        if (getTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetTransactionListWSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSResponse"));
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
        elemField.setFieldName("settlementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settlementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pagingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "pagingInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenTransactionInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
