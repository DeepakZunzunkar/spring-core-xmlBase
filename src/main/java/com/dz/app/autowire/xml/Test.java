package com.dz.app.autowire.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/dz/app/autowire/xml/config.xml");
		Employee employee1=context.getBean("emp1",Employee.class);
		System.out.println(employee1);
	
		Employee employee2=context.getBean("emp2",Employee.class);
		System.out.println(employee2);
	}
	
}
