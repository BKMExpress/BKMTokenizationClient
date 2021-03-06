/**
 * GetTransactionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class GetTransactionList  implements java.io.Serializable {
    private com.bkm.GetTransactionListWSRequest getTransactionListWSRequest;

    public GetTransactionList() {
    }

    public GetTransactionList(
           com.bkm.GetTransactionListWSRequest getTransactionListWSRequest) {
           this.getTransactionListWSRequest = getTransactionListWSRequest;
    }


    /**
     * Gets the getTransactionListWSRequest value for this GetTransactionList.
     * 
     * @return getTransactionListWSRequest
     */
    public com.bkm.GetTransactionListWSRequest getGetTransactionListWSRequest() {
        return getTransactionListWSRequest;
    }


    /**
     * Sets the getTransactionListWSRequest value for this GetTransactionList.
     * 
     * @param getTransactionListWSRequest
     */
    public void setGetTransactionListWSRequest(com.bkm.GetTransactionListWSRequest getTransactionListWSRequest) {
        this.getTransactionListWSRequest = getTransactionListWSRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionList)) return false;
        GetTransactionList other = (GetTransactionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTransactionListWSRequest==null && other.getGetTransactionListWSRequest()==null) || 
             (this.getTransactionListWSRequest!=null &&
              this.getTransactionListWSRequest.equals(other.getGetTransactionListWSRequest())));
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
        if (getGetTransactionListWSRequest() != null) {
            _hashCode += getGetTransactionListWSRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTransactionListWSRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSRequest"));
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
