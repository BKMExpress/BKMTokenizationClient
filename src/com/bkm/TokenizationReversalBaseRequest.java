/**
 * TokenizationReversalBaseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationReversalBaseRequest  implements java.io.Serializable {
    private java.lang.String ts;

    private java.lang.String s;

    private java.lang.String uniqueReferans;

    private java.lang.String merchantId;

    private java.lang.String requestType;

    private java.lang.String amount;

    private java.lang.String currency;

    private java.lang.String posUid;

    private java.lang.String posPwd;

    private java.lang.String extra;

    public TokenizationReversalBaseRequest() {
    }

    public TokenizationReversalBaseRequest(
           java.lang.String ts,
           java.lang.String s,
           java.lang.String uniqueReferans,
           java.lang.String merchantId,
           java.lang.String requestType,
           java.lang.String amount,
           java.lang.String currency,
           java.lang.String posUid,
           java.lang.String posPwd,
           java.lang.String extra) {
           this.ts = ts;
           this.s = s;
           this.uniqueReferans = uniqueReferans;
           this.merchantId = merchantId;
           this.requestType = requestType;
           this.amount = amount;
           this.currency = currency;
           this.posUid = posUid;
           this.posPwd = posPwd;
           this.extra = extra;
    }


    /**
     * Gets the ts value for this TokenizationReversalBaseRequest.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this TokenizationReversalBaseRequest.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this TokenizationReversalBaseRequest.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this TokenizationReversalBaseRequest.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }


    /**
     * Gets the uniqueReferans value for this TokenizationReversalBaseRequest.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this TokenizationReversalBaseRequest.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the merchantId value for this TokenizationReversalBaseRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this TokenizationReversalBaseRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the requestType value for this TokenizationReversalBaseRequest.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this TokenizationReversalBaseRequest.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the amount value for this TokenizationReversalBaseRequest.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TokenizationReversalBaseRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this TokenizationReversalBaseRequest.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TokenizationReversalBaseRequest.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the posUid value for this TokenizationReversalBaseRequest.
     * 
     * @return posUid
     */
    public java.lang.String getPosUid() {
        return posUid;
    }


    /**
     * Sets the posUid value for this TokenizationReversalBaseRequest.
     * 
     * @param posUid
     */
    public void setPosUid(java.lang.String posUid) {
        this.posUid = posUid;
    }


    /**
     * Gets the posPwd value for this TokenizationReversalBaseRequest.
     * 
     * @return posPwd
     */
    public java.lang.String getPosPwd() {
        return posPwd;
    }


    /**
     * Sets the posPwd value for this TokenizationReversalBaseRequest.
     * 
     * @param posPwd
     */
    public void setPosPwd(java.lang.String posPwd) {
        this.posPwd = posPwd;
    }


    /**
     * Gets the extra value for this TokenizationReversalBaseRequest.
     * 
     * @return extra
     */
    public java.lang.String getExtra() {
        return extra;
    }


    /**
     * Sets the extra value for this TokenizationReversalBaseRequest.
     * 
     * @param extra
     */
    public void setExtra(java.lang.String extra) {
        this.extra = extra;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationReversalBaseRequest)) return false;
        TokenizationReversalBaseRequest other = (TokenizationReversalBaseRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ts==null && other.getTs()==null) || 
             (this.ts!=null &&
              this.ts.equals(other.getTs()))) &&
            ((this.s==null && other.getS()==null) || 
             (this.s!=null &&
              this.s.equals(other.getS()))) &&
            ((this.uniqueReferans==null && other.getUniqueReferans()==null) || 
             (this.uniqueReferans!=null &&
              this.uniqueReferans.equals(other.getUniqueReferans()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.posUid==null && other.getPosUid()==null) || 
             (this.posUid!=null &&
              this.posUid.equals(other.getPosUid()))) &&
            ((this.posPwd==null && other.getPosPwd()==null) || 
             (this.posPwd!=null &&
              this.posPwd.equals(other.getPosPwd()))) &&
            ((this.extra==null && other.getExtra()==null) || 
             (this.extra!=null &&
              this.extra.equals(other.getExtra())));
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
        if (getTs() != null) {
            _hashCode += getTs().hashCode();
        }
        if (getS() != null) {
            _hashCode += getS().hashCode();
        }
        if (getUniqueReferans() != null) {
            _hashCode += getUniqueReferans().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPosUid() != null) {
            _hashCode += getPosUid().hashCode();
        }
        if (getPosPwd() != null) {
            _hashCode += getPosPwd().hashCode();
        }
        if (getExtra() != null) {
            _hashCode += getExtra().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenizationReversalBaseRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalBaseRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
        elemField.setFieldName("posUid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extra"));
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
