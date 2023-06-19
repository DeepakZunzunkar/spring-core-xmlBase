package com.dz.app.beanLifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/dz/app/beanLifecycle/xml/config.xml");
		Product product1=(Product)applicationContext.getBean("p1");
		
		applicationContext.registerShutdownHook();
		System.out.println(product1);
		
	}
}
