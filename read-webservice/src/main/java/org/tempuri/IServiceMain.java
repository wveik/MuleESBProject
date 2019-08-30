package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2019-08-30T09:32:44.409+03:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IServiceMain")
@XmlSeeAlso({com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, org.datacontract.schemas._2004._07.wcfservicetest.ObjectFactory.class, ObjectFactory.class})
public interface IServiceMain {

    @WebMethod(operationName = "GetDataUsingDataContract", action = "http://tempuri.org/IServiceMain/GetDataUsingDataContract")
    @Action(input = "http://tempuri.org/IServiceMain/GetDataUsingDataContract", output = "http://tempuri.org/IServiceMain/GetDataUsingDataContractResponse")
    @RequestWrapper(localName = "GetDataUsingDataContract", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDataUsingDataContract")
    @ResponseWrapper(localName = "GetDataUsingDataContractResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDataUsingDataContractResponse")
    @WebResult(name = "GetDataUsingDataContractResult", targetNamespace = "http://tempuri.org/")
    public org.datacontract.schemas._2004._07.wcfservicetest.CompositeType getDataUsingDataContract(
        @WebParam(name = "composite", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.wcfservicetest.CompositeType composite
    );

    @WebMethod(operationName = "Calc", action = "http://tempuri.org/IServiceMain/Calc")
    @Action(input = "http://tempuri.org/IServiceMain/Calc", output = "http://tempuri.org/IServiceMain/CalcResponse")
    @RequestWrapper(localName = "Calc", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Calc")
    @ResponseWrapper(localName = "CalcResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CalcResponse")
    @WebResult(name = "CalcResult", targetNamespace = "http://tempuri.org/")
    public java.lang.Integer calc(
        @WebParam(name = "value1", targetNamespace = "http://tempuri.org/")
        java.lang.Integer value1,
        @WebParam(name = "value2", targetNamespace = "http://tempuri.org/")
        java.lang.Integer value2
    );

    @WebMethod(operationName = "GetData", action = "http://tempuri.org/IServiceMain/GetData")
    @Action(input = "http://tempuri.org/IServiceMain/GetData", output = "http://tempuri.org/IServiceMain/GetDataResponse")
    @RequestWrapper(localName = "GetData", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetData")
    @ResponseWrapper(localName = "GetDataResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDataResponse")
    @WebResult(name = "GetDataResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String getData(
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        java.lang.Integer value
    );
}