package com.dz.app.beanLifecycle.annotationAproch;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/dz/app/beanLifecycle/annotationAproch/config.xml");
		Product product=(Product)context.getBean("product1");
		System.out.println(product);
		context.registerShutdownHook();
	}

	
}
