package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2019-08-30T09:32:44.439+03:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "ServiceMain",
                  wsdlLocation = "http://localhost:48249/Service1.svc?wsdl",
                  targetNamespace = "http://tempuri.org/")
public class ServiceMain extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "ServiceMain");
    public final static QName BasicHttpBindingIServiceMain = new QName("http://tempuri.org/", "BasicHttpBinding_IServiceMain");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:48249/Service1.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceMain.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:48249/Service1.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceMain(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceMain(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceMain() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ServiceMain(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ServiceMain(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ServiceMain(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IServiceMain
     */
    @WebEndpoint(name = "BasicHttpBinding_IServiceMain")
    public IServiceMain getBasicHttpBindingIServiceMain() {
        return super.getPort(BasicHttpBindingIServiceMain, IServiceMain.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServiceMain
     */
    @WebEndpoint(name = "BasicHttpBinding_IServiceMain")
    public IServiceMain getBasicHttpBindingIServiceMain(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIServiceMain, IServiceMain.class, features);
    }

}
