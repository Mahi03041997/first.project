package com.newgroup.spring.com.spring;

import java.beans.JavaBean;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee)context.getBean("employee");
        System.out.println(emp.getId());  
        System.out.println(emp.getName());
        System.out.println(emp.getAdress());
        System.out.println(emp.getCourse());
        System.out.println(emp.getPhoneNumber());
    }
}
