package usinginterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("usinginterface/config1.xml");
	Books books = (Books)context.getBean("rootmap");
	System.out.println(books);
	context.registerShutdownHook();
	}

}
