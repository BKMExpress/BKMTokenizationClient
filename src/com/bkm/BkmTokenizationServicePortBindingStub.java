/**
 * BkmTokenizationServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkm;

public class BkmTokenizationServicePortBindingStub extends org.apache.axis.client.Stub implements com.bkm.BkmTokenizationService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSRequest"), com.bkm.TokenizationWSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSResponse"));
        oper.setReturnClass(com.bkm.TokenizationWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doReversalWithNoRef");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithNoRefRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefRequest"), com.bkm.TokenizationReversalWithNoRefRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefResponse"));
        oper.setReturnClass(com.bkm.TokenizationReversalWithNoRefResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithNoRefResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doReversalWithRef");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithRefRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithRefRequest"), com.bkm.TokenizationReversalWithRefRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithRefResponse"));
        oper.setReturnClass(com.bkm.TokenizationReversalWithRefResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalWithRefResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPaymentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getPaymentListWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        oper.setReturnClass(java.lang.Object.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getPaymentListWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryReversal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSRequest"), com.bkm.QueryReversalWSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSResponse"));
        oper.setReturnClass(com.bkm.QueryReversalWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSRequest"), com.bkm.QueryTokenWSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSResponse"));
        oper.setReturnClass(com.bkm.QueryTokenWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateExpireDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSResponse"));
        oper.setReturnClass(com.bkm.UpdateExpireDateWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTokenPaymentResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSRequest"), com.bkm.TokenPaymentWSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSResponse"));
        oper.setReturnClass(com.bkm.TokenPaymentWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransactionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSRequest"), com.bkm.GetTransactionListWSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSResponse"));
        oper.setReturnClass(com.bkm.GetTransactionListWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryTokenPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentResultWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSRequest"), com.bkm.QueryTokenPaymentWSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSResponse"));
        oper.setReturnClass(com.bkm.QueryTokenPaymentWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExpireDateWithToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSRequest"), com.bkm.GetExpireDateWSRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSResponse"));
        oper.setReturnClass(com.bkm.GetExpireDateWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public BkmTokenizationServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BkmTokenizationServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BkmTokenizationServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithNoRef");
            cachedSerQNames.add(qName);
            cls = com.bkm.DoReversalWithNoRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithNoRefResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.DoReversalWithNoRefResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithRef");
            cachedSerQNames.add(qName);
            cls = com.bkm.DoReversalWithRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithRefResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.DoReversalWithRefResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWithToken");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetExpireDateWithToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWithTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetExpireDateWithTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetExpireDateWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetExpireDateWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getPaymentList");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetPaymentList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getPaymentListResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetPaymentListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getPaymentListWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetPaymentListWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getPaymentListWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetPaymentListWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getToken");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTokenPaymentResult");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetTokenPaymentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTokenPaymentResultResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetTokenPaymentResultResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionList");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetTransactionList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetTransactionListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetTransactionListWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionListWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.GetTransactionListWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "pagingInfo");
            cachedSerQNames.add(qName);
            cls = com.bkm.PagingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "posResult");
            cachedSerQNames.add(qName);
            cls = com.bkm.PosResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversal");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryReversal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryReversalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryReversalWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversalWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryReversalWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryToken");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPayment");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryTokenPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryTokenPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryTokenPaymentWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPaymentWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryTokenPaymentWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryTokenWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.QueryTokenWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "reversalResult");
            cachedSerQNames.add(qName);
            cls = com.bkm.ReversalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationResult");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalBaseRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationReversalBaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationReversalBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationReversalWithNoRefRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithNoRefResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationReversalWithNoRefResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithRefRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationReversalWithRefRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationReversalWithRefResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationReversalWithRefResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSBaseRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationWSBaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationWSBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenizationWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenizationWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentResult");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenPaymentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentTransaction");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenPaymentTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSBaseRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenPaymentWSBaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenPaymentWSBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenPaymentWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenPaymentWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenPaymentWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "tokenTransactionInfo");
            cachedSerQNames.add(qName);
            cls = com.bkm.TokenTransactionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDate");
            cachedSerQNames.add(qName);
            cls = com.bkm.UpdateExpireDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.UpdateExpireDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSRequest");
            cachedSerQNames.add(qName);
            cls = com.bkm.UpdateExpireDateWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDateWSResponse");
            cachedSerQNames.add(qName);
            cls = com.bkm.UpdateExpireDateWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.bkm.TokenizationWSResponse getToken(com.bkm.TokenizationWSRequest tokenizationWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tokenizationWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.TokenizationWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.TokenizationWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.TokenizationWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.TokenizationReversalWithNoRefResponse doReversalWithNoRef(com.bkm.TokenizationReversalWithNoRefRequest reversalWithNoRefRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithNoRef"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reversalWithNoRefRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.TokenizationReversalWithNoRefResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.TokenizationReversalWithNoRefResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.TokenizationReversalWithNoRefResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.TokenizationReversalWithRefResponse doReversalWithRef(com.bkm.TokenizationReversalWithRefRequest reversalWithRefRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "doReversalWithRef"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reversalWithRefRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.TokenizationReversalWithRefResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.TokenizationReversalWithRefResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.TokenizationReversalWithRefResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.Object getPaymentList(java.lang.Object getPaymentListWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getPaymentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPaymentListWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Object) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Object) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Object.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.QueryReversalWSResponse queryReversal(com.bkm.QueryReversalWSRequest queryReversalWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryReversal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryReversalWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.QueryReversalWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.QueryReversalWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.QueryReversalWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.QueryTokenWSResponse queryToken(com.bkm.QueryTokenWSRequest queryTokenWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryTokenWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.QueryTokenWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.QueryTokenWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.QueryTokenWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.UpdateExpireDateWSResponse updateExpireDate(java.lang.Object updateExpireDateWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "updateExpireDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateExpireDateWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.UpdateExpireDateWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.UpdateExpireDateWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.UpdateExpireDateWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.TokenPaymentWSResponse getTokenPaymentResult(com.bkm.TokenPaymentWSRequest tokenPaymentWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTokenPaymentResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tokenPaymentWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.TokenPaymentWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.TokenPaymentWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.TokenPaymentWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.GetTransactionListWSResponse getTransactionList(com.bkm.GetTransactionListWSRequest getTransactionListWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getTransactionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTransactionListWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.GetTransactionListWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.GetTransactionListWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.GetTransactionListWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.QueryTokenPaymentWSResponse queryTokenPayment(com.bkm.QueryTokenPaymentWSRequest queryTokenPaymentResultWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "queryTokenPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryTokenPaymentResultWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.QueryTokenPaymentWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.QueryTokenPaymentWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.QueryTokenPaymentWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bkm.GetExpireDateWSResponse getExpireDateWithToken(com.bkm.GetExpireDateWSRequest getExpireDateWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bkmexpress.com.tr", "getExpireDateWithToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getExpireDateWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bkm.GetExpireDateWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bkm.GetExpireDateWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.bkm.GetExpireDateWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
