package web.service;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.tempuri.Calc;

public class WebService {

	public String CalcToString(Calc calc) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Calc.class);

		Marshaller m = context.createMarshaller();
		
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
		m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		
		StringWriter sw = new StringWriter();
		m.marshal(calc, sw);

		return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Header/><soapenv:Body>"
				+ sw.toString() + "</soapenv:Body></soapenv:Envelope>";
	}

	public String execute(int a, int b) throws JAXBException {
		Calc calc = new Calc();

		calc.setValue1(a);
		calc.setValue2(b);
		
		return CalcToString(calc);
	}
}
