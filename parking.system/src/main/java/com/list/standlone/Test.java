package com.list.standlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/list/standlone/autoconfig.xml");
	Emp emp = (Emp)context.getBean("emp1");
	System.out.println(emp);
	context.registerShutdownHook();
	}

}
