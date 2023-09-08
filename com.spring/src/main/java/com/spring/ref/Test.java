package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/ref.xml");
Employee employee = (Employee)context.getBean("employee");
System.out.println(employee.getId());
System.out.println(employee.getName());
System.out.println(employee.getAddress().getH_no());
System.out.println(employee.getAddress().getStreet());
System.out.println(employee.getAddress().getVillage()+", "+ employee.getAddress().getTown());
System.out.println(employee.getAddress().getDistrict());

	}

}
