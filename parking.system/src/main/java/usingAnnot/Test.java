package usingAnnot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context	= new ClassPathXmlApplicationContext("usingAnnot.config2.xml");
	Emp emp = (Emp)context.getBean("usingannot");
	System.out.println(emp);
	}

}
