
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicetest.CompositeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");
    private final static QName _GetDataUsingDataContractComposite_QNAME = new QName("http://tempuri.org/", "composite");
    private final static QName _GetDataUsingDataContractResponseGetDataUsingDataContractResult_QNAME = new QName("http://tempuri.org/", "GetDataUsingDataContractResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link Calc }
     * 
     */
    public Calc createCalc() {
        return new Calc();
    }

    /**
     * Create an instance of {@link CalcResponse }
     * 
     */
    public CalcResponse createCalcResponse() {
        return new CalcResponse();
    }

    /**
     * Create an instance of {@link GetDataUsingDataContract }
     * 
     */
    public GetDataUsingDataContract createGetDataUsingDataContract() {
        return new GetDataUsingDataContract();
    }

    /**
     * Create an instance of {@link GetDataUsingDataContractResponse }
     * 
     */
    public GetDataUsingDataContractResponse createGetDataUsingDataContractResponse() {
        return new GetDataUsingDataContractResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<String> createGetDataResponseGetDataResult(String value) {
        return new JAXBElement<String>(_GetDataResponseGetDataResult_QNAME, String.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "composite", scope = GetDataUsingDataContract.class)
    public JAXBElement<CompositeType> createGetDataUsingDataContractComposite(CompositeType value) {
        return new JAXBElement<CompositeType>(_GetDataUsingDataContractComposite_QNAME, CompositeType.class, GetDataUsingDataContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataUsingDataContractResult", scope = GetDataUsingDataContractResponse.class)
    public JAXBElement<CompositeType> createGetDataUsingDataContractResponseGetDataUsingDataContractResult(CompositeType value) {
        return new JAXBElement<CompositeType>(_GetDataUsingDataContractResponseGetDataUsingDataContractResult_QNAME, CompositeType.class, GetDataUsingDataContractResponse.class, value);
    }

}
