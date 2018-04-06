/**
 * DoReversalWithRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class DoReversalWithRef  implements java.io.Serializable {
    private com.bkm.TokenizationReversalWithRefRequest reversalWithRefRequest;

    public DoReversalWithRef() {
    }

    public DoReversalWithRef(
           com.bkm.TokenizationReversalWithRefRequest reversalWithRefRequest) {
           this.reversalWithRefRequest = reversalWithRefRequest;
    }


    /**
     * Gets the reversalWithRefRequest value for this DoReversalWithRef.
     * 
     * @return reversalWithRefRequest
     */
    public com.bkm.TokenizationReversalWithRefRequest getReversalWithRefRequest() {
        return reversalWithRefRequest;
    }


    /**
     * Sets the reversalWithRefRequest value for this DoReversalWithRef.
     * 
     * @param reversalWithRefRequest
     */
    public void setReversalWithRefRequest(com.bkm.TokenizationReversalWithRefRequest reversalWithRefRequest) {
        this.reversalWithRefRequest = reversalWithRefRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReversalWithRef)) return false;
        DoReversalWithRef other = (DoReversalWithRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reversalWithRefRequest==null && other.getReversalWithRefRequest()==null) || 
             (this.reversalWithRefRequest!=null &&
              this.reversalWithRefRequest.equals(other.getReversalWithRefRequest())));
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
        if (getReversalWithRefRequest() != null) {
            _hashCode += getReversalWithRefRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReversalWithRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalWithRefRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithRefRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithRefRequest"));
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
