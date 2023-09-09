package com.springcore.scope;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = 
				new  ClassPathXmlApplicationContext("com/springcore/scope/config1.xml");
Student student = context.getBean("student", Student.class);
Student student1 = context.getBean("student", Student.class); 
System.out.println(student.hashCode()+ ","+ student1.hashCode());
context.registerShutdownHook();

	}
	

}
