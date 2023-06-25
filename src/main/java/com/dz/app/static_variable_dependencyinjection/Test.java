package com.dz.app.static_variable_dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/dz/app/static_variable_dependencyinjection/spring.xml");
		Car car=(Car)ap.getBean("c");
		car.pritCarName();
		
		System.out.println(Car.toolList);
		
	}
}
