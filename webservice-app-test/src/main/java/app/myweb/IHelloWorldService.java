package app.myweb;

import javax.jws.WebService;

@WebService
public interface IHelloWorldService {
	
	String helloWOrldFunc(String name);
	
	int addNumbers(int a, int b);

}
