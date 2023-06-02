package com.dz.app.objeRefference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/dz/app/objeRefference/ObjRefConfig.xml");
		
		Address a1=(Address)context.getBean("a1");
		System.out.println(a1);
		
		System.out.println("*******************\n");
		
		Customer c1 =(Customer)context.getBean("c1");
		System.out.println(c1);
		
		System.out.println("*******************\n");

		Customer c2 =(Customer)context.getBean("c2");
		System.out.println(c2);
		
		System.out.println("*******************\n");

		Customer c3 =(Customer)context.getBean("c3");
		System.out.println(c3);
	}
	
	
}
