package com.dz.app.java_base_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

//	ways to create bean in spring container using java base configuration 
//	1.using @component  and @componentScan 
//	2.using @Bean 
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee emp1 = context.getBean("employee",Employee.class);
		System.out.println(emp1);
		System.err.println("______________________________________________");
		Address address = context.getBean("getAddress",Address.class);
		System.out.println(address);
		System.err.println("______________________________________________");
		Country country = context.getBean("country",Country.class);
		System.out.println(country);
		System.err.println("______________________________________________");
		Country country1 = context.getBean("countryThi",Country.class);
		System.out.println(country1);
		System.err.println("______________________________________________");
		Employee emp2 = context.getBean("employee1",Employee.class);
		System.out.println(emp2);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}
	
}
