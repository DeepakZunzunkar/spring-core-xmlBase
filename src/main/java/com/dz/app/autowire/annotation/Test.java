package com.dz.app.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/dz/app/autowire/annotation/config.xml");
		Employee employee1=context.getBean("emp1",Employee.class);
		System.out.println(employee1);
	
		
	}
	
}
