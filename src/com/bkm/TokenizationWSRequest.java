/**
 * TokenizationWSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationWSRequest  extends com.bkm.TokenizationWSBaseRequest  implements java.io.Serializable {
    private java.lang.String uniqueReferans;

    private java.lang.String merchantId;

    private java.lang.String registrationType;

    private java.lang.String ccFirst6Digits;

    private java.lang.String ccLast4Digits;

    private java.lang.String tckn;

    private java.lang.String customerNo;

    private java.lang.String cardData;

    private java.lang.String returnURL;

    private java.lang.String failURL;

    private java.lang.String ts;

    private java.lang.String s;

    public TokenizationWSRequest() {
    }

    public TokenizationWSRequest(
           java.lang.String uniqueReferans,
           java.lang.String merchantId,
           java.lang.String registrationType,
           java.lang.String ccFirst6Digits,
           java.lang.String ccLast4Digits,
           java.lang.String tckn,
           java.lang.String customerNo,
           java.lang.String cardData,
           java.lang.String returnURL,
           java.lang.String failURL,
           java.lang.String ts,
           java.lang.String s) {
        this.uniqueReferans = uniqueReferans;
        this.merchantId = merchantId;
        this.registrationType = registrationType;
        this.ccFirst6Digits = ccFirst6Digits;
        this.ccLast4Digits = ccLast4Digits;
        this.tckn = tckn;
        this.customerNo = customerNo;
        this.cardData = cardData;
        this.returnURL = returnURL;
        this.failURL = failURL;
        this.ts = ts;
        this.s = s;
    }


    /**
     * Gets the uniqueReferans value for this TokenizationWSRequest.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this TokenizationWSRequest.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the merchantId value for this TokenizationWSRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this TokenizationWSRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the registrationType value for this TokenizationWSRequest.
     * 
     * @return registrationType
     */
    public java.lang.String getRegistrationType() {
        return registrationType;
    }


    /**
     * Sets the registrationType value for this TokenizationWSRequest.
     * 
     * @param registrationType
     */
    public void setRegistrationType(java.lang.String registrationType) {
        this.registrationType = registrationType;
    }


    /**
     * Gets the ccFirst6Digits value for this TokenizationWSRequest.
     * 
     * @return ccFirst6Digits
     */
    public java.lang.String getCcFirst6Digits() {
        return ccFirst6Digits;
    }


    /**
     * Sets the ccFirst6Digits value for this TokenizationWSRequest.
     * 
     * @param ccFirst6Digits
     */
    public void setCcFirst6Digits(java.lang.String ccFirst6Digits) {
        this.ccFirst6Digits = ccFirst6Digits;
    }


    /**
     * Gets the ccLast4Digits value for this TokenizationWSRequest.
     * 
     * @return ccLast4Digits
     */
    public java.lang.String getCcLast4Digits() {
        return ccLast4Digits;
    }


    /**
     * Sets the ccLast4Digits value for this TokenizationWSRequest.
     * 
     * @param ccLast4Digits
     */
    public void setCcLast4Digits(java.lang.String ccLast4Digits) {
        this.ccLast4Digits = ccLast4Digits;
    }


    /**
     * Gets the tckn value for this TokenizationWSRequest.
     * 
     * @return tckn
     */
    public java.lang.String getTckn() {
        return tckn;
    }


    /**
     * Sets the tckn value for this TokenizationWSRequest.
     * 
     * @param tckn
     */
    public void setTckn(java.lang.String tckn) {
        this.tckn = tckn;
    }


    /**
     * Gets the customerNo value for this TokenizationWSRequest.
     * 
     * @return customerNo
     */
    public java.lang.String getCustomerNo() {
        return customerNo;
    }


    /**
     * Sets the customerNo value for this TokenizationWSRequest.
     * 
     * @param customerNo
     */
    public void setCustomerNo(java.lang.String customerNo) {
        this.customerNo = customerNo;
    }


    /**
     * Gets the cardData value for this TokenizationWSRequest.
     * 
     * @return cardData
     */
    public java.lang.String getCardData() {
        return cardData;
    }


    /**
     * Sets the cardData value for this TokenizationWSRequest.
     * 
     * @param cardData
     */
    public void setCardData(java.lang.String cardData) {
        this.cardData = cardData;
    }


    /**
     * Gets the returnURL value for this TokenizationWSRequest.
     * 
     * @return returnURL
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this TokenizationWSRequest.
     * 
     * @param returnURL
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the failURL value for this TokenizationWSRequest.
     * 
     * @return failURL
     */
    public java.lang.String getFailURL() {
        return failURL;
    }


    /**
     * Sets the failURL value for this TokenizationWSRequest.
     * 
     * @param failURL
     */
    public void setFailURL(java.lang.String failURL) {
        this.failURL = failURL;
    }


    /**
     * Gets the ts value for this TokenizationWSRequest.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this TokenizationWSRequest.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this TokenizationWSRequest.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this TokenizationWSRequest.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationWSRequest)) return false;
        TokenizationWSRequest other = (TokenizationWSRequest) obj;
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
            ((this.registrationType==null && other.getRegistrationType()==null) || 
             (this.registrationType!=null &&
              this.registrationType.equals(other.getRegistrationType()))) &&
            ((this.ccFirst6Digits==null && other.getCcFirst6Digits()==null) || 
             (this.ccFirst6Digits!=null &&
              this.ccFirst6Digits.equals(other.getCcFirst6Digits()))) &&
            ((this.ccLast4Digits==null && other.getCcLast4Digits()==null) || 
             (this.ccLast4Digits!=null &&
              this.ccLast4Digits.equals(other.getCcLast4Digits()))) &&
            ((this.tckn==null && other.getTckn()==null) || 
             (this.tckn!=null &&
              this.tckn.equals(other.getTckn()))) &&
            ((this.customerNo==null && other.getCustomerNo()==null) || 
             (this.customerNo!=null &&
              this.customerNo.equals(other.getCustomerNo()))) &&
            ((this.cardData==null && other.getCardData()==null) || 
             (this.cardData!=null &&
              this.cardData.equals(other.getCardData()))) &&
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.failURL==null && other.getFailURL()==null) || 
             (this.failURL!=null &&
              this.failURL.equals(other.getFailURL()))) &&
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
        if (getRegistrationType() != null) {
            _hashCode += getRegistrationType().hashCode();
        }
        if (getCcFirst6Digits() != null) {
            _hashCode += getCcFirst6Digits().hashCode();
        }
        if (getCcLast4Digits() != null) {
            _hashCode += getCcLast4Digits().hashCode();
        }
        if (getTckn() != null) {
            _hashCode += getTckn().hashCode();
        }
        if (getCustomerNo() != null) {
            _hashCode += getCustomerNo().hashCode();
        }
        if (getCardData() != null) {
            _hashCode += getCardData().hashCode();
        }
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getFailURL() != null) {
            _hashCode += getFailURL().hashCode();
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
        new org.apache.axis.description.TypeDesc(TokenizationWSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSRequest"));
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
        elemField.setFieldName("registrationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccFirst6Digits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccFirst6Digits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccLast4Digits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccLast4Digits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tckn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tckn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failURL"));
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
