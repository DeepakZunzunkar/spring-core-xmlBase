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
		
		
		// by default bean scope is singleton
		Employee employee3=context.getBean("emp3",Employee.class);
		System.out.println(employee3);
		
		Employee employee4=context.getBean("emp3",Employee.class);
		System.out.println(employee4);
		
		System.out.println(employee3.hashCode());
		System.out.println(employee4.hashCode());
	}
	
}
