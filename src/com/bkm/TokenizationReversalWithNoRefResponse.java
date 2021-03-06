/**
 * TokenizationReversalWithNoRefResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class TokenizationReversalWithNoRefResponse  extends com.bkm.TokenizationReversalBaseResponse  implements java.io.Serializable {
    private com.bkm.PosResult posResult;

    public TokenizationReversalWithNoRefResponse() {
    }

    public TokenizationReversalWithNoRefResponse(
           com.bkm.ReversalResult result,
           java.lang.String uniqueReferans,
           java.lang.String ts,
           java.lang.String s,
           com.bkm.PosResult posResult) {
        super(
            result,
            uniqueReferans,
            ts,
            s);
        this.posResult = posResult;
    }


    /**
     * Gets the posResult value for this TokenizationReversalWithNoRefResponse.
     * 
     * @return posResult
     */
    public com.bkm.PosResult getPosResult() {
        return posResult;
    }


    /**
     * Sets the posResult value for this TokenizationReversalWithNoRefResponse.
     * 
     * @param posResult
     */
    public void setPosResult(com.bkm.PosResult posResult) {
        this.posResult = posResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenizationReversalWithNoRefResponse)) return false;
        TokenizationReversalWithNoRefResponse other = (TokenizationReversalWithNoRefResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.posResult==null && other.getPosResult()==null) || 
             (this.posResult!=null &&
              this.posResult.equals(other.getPosResult())));
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
        if (getPosResult() != null) {
            _hashCode += getPosResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenizationReversalWithNoRefResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "posResult"));
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
