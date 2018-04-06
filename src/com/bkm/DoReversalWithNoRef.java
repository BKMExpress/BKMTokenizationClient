/**
 * DoReversalWithNoRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class DoReversalWithNoRef  implements java.io.Serializable {
    private com.bkm.TokenizationReversalWithNoRefRequest reversalWithNoRefRequest;

    public DoReversalWithNoRef() {
    }

    public DoReversalWithNoRef(
           com.bkm.TokenizationReversalWithNoRefRequest reversalWithNoRefRequest) {
           this.reversalWithNoRefRequest = reversalWithNoRefRequest;
    }


    /**
     * Gets the reversalWithNoRefRequest value for this DoReversalWithNoRef.
     * 
     * @return reversalWithNoRefRequest
     */
    public com.bkm.TokenizationReversalWithNoRefRequest getReversalWithNoRefRequest() {
        return reversalWithNoRefRequest;
    }


    /**
     * Sets the reversalWithNoRefRequest value for this DoReversalWithNoRef.
     * 
     * @param reversalWithNoRefRequest
     */
    public void setReversalWithNoRefRequest(com.bkm.TokenizationReversalWithNoRefRequest reversalWithNoRefRequest) {
        this.reversalWithNoRefRequest = reversalWithNoRefRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReversalWithNoRef)) return false;
        DoReversalWithNoRef other = (DoReversalWithNoRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reversalWithNoRefRequest==null && other.getReversalWithNoRefRequest()==null) || 
             (this.reversalWithNoRefRequest!=null &&
              this.reversalWithNoRefRequest.equals(other.getReversalWithNoRefRequest())));
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
        if (getReversalWithNoRefRequest() != null) {
            _hashCode += getReversalWithNoRefRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReversalWithNoRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithNoRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalWithNoRefRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithNoRefRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefRequest"));
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
