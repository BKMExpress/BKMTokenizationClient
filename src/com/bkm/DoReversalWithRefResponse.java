/**
 * DoReversalWithRefResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class DoReversalWithRefResponse  implements java.io.Serializable {
    private com.bkm.TokenizationReversalWithRefResponse reversalWithRefResponse;

    public DoReversalWithRefResponse() {
    }

    public DoReversalWithRefResponse(
           com.bkm.TokenizationReversalWithRefResponse reversalWithRefResponse) {
           this.reversalWithRefResponse = reversalWithRefResponse;
    }


    /**
     * Gets the reversalWithRefResponse value for this DoReversalWithRefResponse.
     * 
     * @return reversalWithRefResponse
     */
    public com.bkm.TokenizationReversalWithRefResponse getReversalWithRefResponse() {
        return reversalWithRefResponse;
    }


    /**
     * Sets the reversalWithRefResponse value for this DoReversalWithRefResponse.
     * 
     * @param reversalWithRefResponse
     */
    public void setReversalWithRefResponse(com.bkm.TokenizationReversalWithRefResponse reversalWithRefResponse) {
        this.reversalWithRefResponse = reversalWithRefResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReversalWithRefResponse)) return false;
        DoReversalWithRefResponse other = (DoReversalWithRefResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reversalWithRefResponse==null && other.getReversalWithRefResponse()==null) || 
             (this.reversalWithRefResponse!=null &&
              this.reversalWithRefResponse.equals(other.getReversalWithRefResponse())));
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
        if (getReversalWithRefResponse() != null) {
            _hashCode += getReversalWithRefResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReversalWithRefResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithRefResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalWithRefResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithRefResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithRefResponse"));
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
