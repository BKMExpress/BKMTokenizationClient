/**
 * DoReversalWithNoRefResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class DoReversalWithNoRefResponse  implements java.io.Serializable {
    private com.bkm.TokenizationReversalWithNoRefResponse reversalWithNoRefResponse;

    public DoReversalWithNoRefResponse() {
    }

    public DoReversalWithNoRefResponse(
           com.bkm.TokenizationReversalWithNoRefResponse reversalWithNoRefResponse) {
           this.reversalWithNoRefResponse = reversalWithNoRefResponse;
    }


    /**
     * Gets the reversalWithNoRefResponse value for this DoReversalWithNoRefResponse.
     * 
     * @return reversalWithNoRefResponse
     */
    public com.bkm.TokenizationReversalWithNoRefResponse getReversalWithNoRefResponse() {
        return reversalWithNoRefResponse;
    }


    /**
     * Sets the reversalWithNoRefResponse value for this DoReversalWithNoRefResponse.
     * 
     * @param reversalWithNoRefResponse
     */
    public void setReversalWithNoRefResponse(com.bkm.TokenizationReversalWithNoRefResponse reversalWithNoRefResponse) {
        this.reversalWithNoRefResponse = reversalWithNoRefResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReversalWithNoRefResponse)) return false;
        DoReversalWithNoRefResponse other = (DoReversalWithNoRefResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reversalWithNoRefResponse==null && other.getReversalWithNoRefResponse()==null) || 
             (this.reversalWithNoRefResponse!=null &&
              this.reversalWithNoRefResponse.equals(other.getReversalWithNoRefResponse())));
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
        if (getReversalWithNoRefResponse() != null) {
            _hashCode += getReversalWithNoRefResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReversalWithNoRefResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithNoRefResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalWithNoRefResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithNoRefResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefResponse"));
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
