package com.dz.app.dependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/dz/app/dependsOn/spring.xml");
		
	}
}
