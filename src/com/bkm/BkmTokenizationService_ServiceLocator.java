/**
 * BkmTokenizationService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class BkmTokenizationService_ServiceLocator extends org.apache.axis.client.Service implements com.bkm.BkmTokenizationService_Service {

    public BkmTokenizationService_ServiceLocator() {
    }


    public BkmTokenizationService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BkmTokenizationService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BkmTokenizationServicePort
    private java.lang.String BkmTokenizationServicePort_address = "http://localhost:8080/BKMExpress/BkmTokenizationService.ws";

    public java.lang.String getBkmTokenizationServicePortAddress() {
        return BkmTokenizationServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BkmTokenizationServicePortWSDDServiceName = "BkmTokenizationServicePort";

    public java.lang.String getBkmTokenizationServicePortWSDDServiceName() {
        return BkmTokenizationServicePortWSDDServiceName;
    }

    public void setBkmTokenizationServicePortWSDDServiceName(java.lang.String name) {
        BkmTokenizationServicePortWSDDServiceName = name;
    }

    public com.bkm.BkmTokenizationService_PortType getBkmTokenizationServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BkmTokenizationServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBkmTokenizationServicePort(endpoint);
    }

    public com.bkm.BkmTokenizationService_PortType getBkmTokenizationServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bkm.BkmTokenizationServicePortBindingStub _stub = new com.bkm.BkmTokenizationServicePortBindingStub(portAddress, this);
            _stub.setPortName(getBkmTokenizationServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBkmTokenizationServicePortEndpointAddress(java.lang.String address) {
        BkmTokenizationServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bkm.BkmTokenizationService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bkm.BkmTokenizationServicePortBindingStub _stub = new com.bkm.BkmTokenizationServicePortBindingStub(new java.net.URL(BkmTokenizationServicePort_address), this);
                _stub.setPortName(getBkmTokenizationServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BkmTokenizationServicePort".equals(inputPortName)) {
            return getBkmTokenizationServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "BkmTokenizationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "BkmTokenizationServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BkmTokenizationServicePort".equals(portName)) {
            setBkmTokenizationServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
