package com.dz.app.beanLifecycle.programaticAproch;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	
	private static String data;

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/dz/app/beanLifecycle/programaticAproch/config.xml");
		DbConfig config=(DbConfig)context.getBean("dbconfig");

		data = config.getData();
		System.out.println(data);
		
		context.registerShutdownHook();
	}

	
}
