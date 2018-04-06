/**
 * QueryTokenWSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class QueryTokenWSResponse  extends com.bkm.TokenizationWSBaseResponse  implements java.io.Serializable {
    private java.lang.String uniqueReferans;

    private java.lang.String cardToken;

    private java.lang.String transactionExpireDate;

    private java.lang.String ts;

    private java.lang.String s;

    public QueryTokenWSResponse() {
    }

    public QueryTokenWSResponse(
           com.bkm.TokenizationResult result,
           java.lang.String uniqueReferans,
           java.lang.String cardToken,
           java.lang.String transactionExpireDate,
           java.lang.String ts,
           java.lang.String s) {
        super(
            result);
        this.uniqueReferans = uniqueReferans;
        this.cardToken = cardToken;
        this.transactionExpireDate = transactionExpireDate;
        this.ts = ts;
        this.s = s;
    }


    /**
     * Gets the uniqueReferans value for this QueryTokenWSResponse.
     * 
     * @return uniqueReferans
     */
    public java.lang.String getUniqueReferans() {
        return uniqueReferans;
    }


    /**
     * Sets the uniqueReferans value for this QueryTokenWSResponse.
     * 
     * @param uniqueReferans
     */
    public void setUniqueReferans(java.lang.String uniqueReferans) {
        this.uniqueReferans = uniqueReferans;
    }


    /**
     * Gets the cardToken value for this QueryTokenWSResponse.
     * 
     * @return cardToken
     */
    public java.lang.String getCardToken() {
        return cardToken;
    }


    /**
     * Sets the cardToken value for this QueryTokenWSResponse.
     * 
     * @param cardToken
     */
    public void setCardToken(java.lang.String cardToken) {
        this.cardToken = cardToken;
    }


    /**
     * Gets the transactionExpireDate value for this QueryTokenWSResponse.
     * 
     * @return transactionExpireDate
     */
    public java.lang.String getTransactionExpireDate() {
        return transactionExpireDate;
    }


    /**
     * Sets the transactionExpireDate value for this QueryTokenWSResponse.
     * 
     * @param transactionExpireDate
     */
    public void setTransactionExpireDate(java.lang.String transactionExpireDate) {
        this.transactionExpireDate = transactionExpireDate;
    }


    /**
     * Gets the ts value for this QueryTokenWSResponse.
     * 
     * @return ts
     */
    public java.lang.String getTs() {
        return ts;
    }


    /**
     * Sets the ts value for this QueryTokenWSResponse.
     * 
     * @param ts
     */
    public void setTs(java.lang.String ts) {
        this.ts = ts;
    }


    /**
     * Gets the s value for this QueryTokenWSResponse.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this QueryTokenWSResponse.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryTokenWSResponse)) return false;
        QueryTokenWSResponse other = (QueryTokenWSResponse) obj;
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
            ((this.transactionExpireDate==null && other.getTransactionExpireDate()==null) || 
             (this.transactionExpireDate!=null &&
              this.transactionExpireDate.equals(other.getTransactionExpireDate()))) &&
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
        if (getTransactionExpireDate() != null) {
            _hashCode += getTransactionExpireDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(QueryTokenWSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSResponse"));
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
        elemField.setFieldName("transactionExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionExpireDate"));
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
