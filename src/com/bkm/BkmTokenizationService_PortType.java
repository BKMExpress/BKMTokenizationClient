/**
 * BkmTokenizationService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public interface BkmTokenizationService_PortType extends java.rmi.Remote {
    public com.bkm.TokenizationWSResponse getToken(com.bkm.TokenizationWSRequest tokenizationWSRequest) throws java.rmi.RemoteException;
    public com.bkm.TokenizationReversalWithNoRefResponse doReversalWithNoRef(com.bkm.TokenizationReversalWithNoRefRequest reversalWithNoRefRequest) throws java.rmi.RemoteException;
    public com.bkm.TokenizationReversalWithRefResponse doReversalWithRef(com.bkm.TokenizationReversalWithRefRequest reversalWithRefRequest) throws java.rmi.RemoteException;
    public java.lang.Object getPaymentList(java.lang.Object getPaymentListWSRequest) throws java.rmi.RemoteException;
    public com.bkm.QueryReversalWSResponse queryReversal(com.bkm.QueryReversalWSRequest queryReversalWSRequest) throws java.rmi.RemoteException;
    public com.bkm.QueryTokenWSResponse queryToken(com.bkm.QueryTokenWSRequest queryTokenWSRequest) throws java.rmi.RemoteException;
    public com.bkm.UpdateExpireDateWSResponse updateExpireDate(java.lang.Object updateExpireDateWSRequest) throws java.rmi.RemoteException;
    public com.bkm.TokenPaymentWSResponse getTokenPaymentResult(com.bkm.TokenPaymentWSRequest tokenPaymentWSRequest) throws java.rmi.RemoteException;
    public com.bkm.GetTransactionListWSResponse getTransactionList(com.bkm.GetTransactionListWSRequest getTransactionListWSRequest) throws java.rmi.RemoteException;
    public com.bkm.QueryTokenPaymentWSResponse queryTokenPayment(com.bkm.QueryTokenPaymentWSRequest queryTokenPaymentResultWSRequest) throws java.rmi.RemoteException;
    public com.bkm.GetExpireDateWSResponse getExpireDateWithToken(com.bkm.GetExpireDateWSRequest getExpireDateWSRequest) throws java.rmi.RemoteException;
}
