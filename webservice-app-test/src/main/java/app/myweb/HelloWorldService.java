package app.myweb;

import javax.jws.WebService;

@WebService
public class HelloWorldService implements IHelloWorldService {

	@Override
	public String helloWOrldFunc(String name) {
		
		return "Hello World: " + name;
		
	}

	@Override
	public int addNumbers(int a, int b) {
		
		return a + b;
		
	}

}
