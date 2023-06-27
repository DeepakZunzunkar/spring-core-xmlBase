package com.dz.app.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("com/dz/app/stereotype/config.xml");

		// if we don't know class reference use .class as argument
		// usually it use package.classname as id

		//no issue , here it will search bean byType in application context
		/*Car c1= ap.getBean(Car.class);
		System.out.println(c1);*/
		
		// here it search bean byName and byDefault name is class with camel case start with smaller letter
//		Car c1= ap.getBean("car",Car.class);
		
		Car c1= ap.getBean("c",Car.class);
		System.out.println(c1);
		System.err.println("__________bean scop______________________");
		
		Car c2= ap.getBean("c",Car.class);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.err.println("________________________________");
		
		c1.getBodyParts().stream().forEach(part->{
			System.out.println(part);
		});
		
	} 
}
