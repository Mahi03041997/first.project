package com.streotype.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("com/streotype/annotation/config1.xml");
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
		context.registerShutdownHook();
		System.out.println(emp.hashCode());
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1.hashCode());
	}

}
