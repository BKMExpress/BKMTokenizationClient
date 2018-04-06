/**
 * PosResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class PosResult  implements java.io.Serializable {
    private java.lang.String orderId;

    private java.lang.String authCode;

    private java.lang.String posResponse;

    private java.lang.String posResultCode;

    private java.lang.String posResultMessage;

    private java.lang.String referansNumber;

    private java.lang.String posTransactionId;

    private java.lang.String groupId;

    private java.lang.String cardBin;

    private java.lang.String cardBank;

    private java.lang.Integer noflnst;

    private java.lang.String posBank;

    public PosResult() {
    }

    public PosResult(
           java.lang.String orderId,
           java.lang.String authCode,
           java.lang.String posResponse,
           java.lang.String posResultCode,
           java.lang.String posResultMessage,
           java.lang.String referansNumber,
           java.lang.String posTransactionId,
           java.lang.String groupId,
           java.lang.String cardBin,
           java.lang.String cardBank,
           java.lang.Integer noflnst,
           java.lang.String posBank) {
           this.orderId = orderId;
           this.authCode = authCode;
           this.posResponse = posResponse;
           this.posResultCode = posResultCode;
           this.posResultMessage = posResultMessage;
           this.referansNumber = referansNumber;
           this.posTransactionId = posTransactionId;
           this.groupId = groupId;
           this.cardBin = cardBin;
           this.cardBank = cardBank;
           this.noflnst = noflnst;
           this.posBank = posBank;
    }


    /**
     * Gets the orderId value for this PosResult.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PosResult.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the authCode value for this PosResult.
     * 
     * @return authCode
     */
    public java.lang.String getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this PosResult.
     * 
     * @param authCode
     */
    public void setAuthCode(java.lang.String authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the posResponse value for this PosResult.
     * 
     * @return posResponse
     */
    public java.lang.String getPosResponse() {
        return posResponse;
    }


    /**
     * Sets the posResponse value for this PosResult.
     * 
     * @param posResponse
     */
    public void setPosResponse(java.lang.String posResponse) {
        this.posResponse = posResponse;
    }


    /**
     * Gets the posResultCode value for this PosResult.
     * 
     * @return posResultCode
     */
    public java.lang.String getPosResultCode() {
        return posResultCode;
    }


    /**
     * Sets the posResultCode value for this PosResult.
     * 
     * @param posResultCode
     */
    public void setPosResultCode(java.lang.String posResultCode) {
        this.posResultCode = posResultCode;
    }


    /**
     * Gets the posResultMessage value for this PosResult.
     * 
     * @return posResultMessage
     */
    public java.lang.String getPosResultMessage() {
        return posResultMessage;
    }


    /**
     * Sets the posResultMessage value for this PosResult.
     * 
     * @param posResultMessage
     */
    public void setPosResultMessage(java.lang.String posResultMessage) {
        this.posResultMessage = posResultMessage;
    }


    /**
     * Gets the referansNumber value for this PosResult.
     * 
     * @return referansNumber
     */
    public java.lang.String getReferansNumber() {
        return referansNumber;
    }


    /**
     * Sets the referansNumber value for this PosResult.
     * 
     * @param referansNumber
     */
    public void setReferansNumber(java.lang.String referansNumber) {
        this.referansNumber = referansNumber;
    }


    /**
     * Gets the posTransactionId value for this PosResult.
     * 
     * @return posTransactionId
     */
    public java.lang.String getPosTransactionId() {
        return posTransactionId;
    }


    /**
     * Sets the posTransactionId value for this PosResult.
     * 
     * @param posTransactionId
     */
    public void setPosTransactionId(java.lang.String posTransactionId) {
        this.posTransactionId = posTransactionId;
    }


    /**
     * Gets the groupId value for this PosResult.
     * 
     * @return groupId
     */
    public java.lang.String getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this PosResult.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the cardBin value for this PosResult.
     * 
     * @return cardBin
     */
    public java.lang.String getCardBin() {
        return cardBin;
    }


    /**
     * Sets the cardBin value for this PosResult.
     * 
     * @param cardBin
     */
    public void setCardBin(java.lang.String cardBin) {
        this.cardBin = cardBin;
    }


    /**
     * Gets the cardBank value for this PosResult.
     * 
     * @return cardBank
     */
    public java.lang.String getCardBank() {
        return cardBank;
    }


    /**
     * Sets the cardBank value for this PosResult.
     * 
     * @param cardBank
     */
    public void setCardBank(java.lang.String cardBank) {
        this.cardBank = cardBank;
    }


    /**
     * Gets the noflnst value for this PosResult.
     * 
     * @return noflnst
     */
    public java.lang.Integer getNoflnst() {
        return noflnst;
    }


    /**
     * Sets the noflnst value for this PosResult.
     * 
     * @param noflnst
     */
    public void setNoflnst(java.lang.Integer noflnst) {
        this.noflnst = noflnst;
    }


    /**
     * Gets the posBank value for this PosResult.
     * 
     * @return posBank
     */
    public java.lang.String getPosBank() {
        return posBank;
    }


    /**
     * Sets the posBank value for this PosResult.
     * 
     * @param posBank
     */
    public void setPosBank(java.lang.String posBank) {
        this.posBank = posBank;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PosResult)) return false;
        PosResult other = (PosResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.posResponse==null && other.getPosResponse()==null) || 
             (this.posResponse!=null &&
              this.posResponse.equals(other.getPosResponse()))) &&
            ((this.posResultCode==null && other.getPosResultCode()==null) || 
             (this.posResultCode!=null &&
              this.posResultCode.equals(other.getPosResultCode()))) &&
            ((this.posResultMessage==null && other.getPosResultMessage()==null) || 
             (this.posResultMessage!=null &&
              this.posResultMessage.equals(other.getPosResultMessage()))) &&
            ((this.referansNumber==null && other.getReferansNumber()==null) || 
             (this.referansNumber!=null &&
              this.referansNumber.equals(other.getReferansNumber()))) &&
            ((this.posTransactionId==null && other.getPosTransactionId()==null) || 
             (this.posTransactionId!=null &&
              this.posTransactionId.equals(other.getPosTransactionId()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.cardBin==null && other.getCardBin()==null) || 
             (this.cardBin!=null &&
              this.cardBin.equals(other.getCardBin()))) &&
            ((this.cardBank==null && other.getCardBank()==null) || 
             (this.cardBank!=null &&
              this.cardBank.equals(other.getCardBank()))) &&
            ((this.noflnst==null && other.getNoflnst()==null) || 
             (this.noflnst!=null &&
              this.noflnst.equals(other.getNoflnst()))) &&
            ((this.posBank==null && other.getPosBank()==null) || 
             (this.posBank!=null &&
              this.posBank.equals(other.getPosBank())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getPosResponse() != null) {
            _hashCode += getPosResponse().hashCode();
        }
        if (getPosResultCode() != null) {
            _hashCode += getPosResultCode().hashCode();
        }
        if (getPosResultMessage() != null) {
            _hashCode += getPosResultMessage().hashCode();
        }
        if (getReferansNumber() != null) {
            _hashCode += getReferansNumber().hashCode();
        }
        if (getPosTransactionId() != null) {
            _hashCode += getPosTransactionId().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getCardBin() != null) {
            _hashCode += getCardBin().hashCode();
        }
        if (getCardBank() != null) {
            _hashCode += getCardBank().hashCode();
        }
        if (getNoflnst() != null) {
            _hashCode += getNoflnst().hashCode();
        }
        if (getPosBank() != null) {
            _hashCode += getPosBank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PosResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "posResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posResultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posResultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posResultMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referansNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referansNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardBank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noflnst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noflnst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posBank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posBank"));
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
