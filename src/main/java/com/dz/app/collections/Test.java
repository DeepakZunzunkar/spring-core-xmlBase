package com.dz.app.collections;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/dz/app/collections/collectionConfig.xml");
		Employer employer1 =(Employer)context.getBean("empr1");
		employer1.display();
		
		System.out.println("\n********************************\n");
		/*Properties dbProperties =employer1.getDbProperties();
		System.out.println(dbProperties.getProperty("url"));
		System.out.println(dbProperties.getProperty("driverClass"));
		System.out.println(dbProperties.getProperty("userName"));
		System.out.println(dbProperties.getProperty("password"));*/
		
		employer1.getDbProperties().entrySet().stream().forEach(entry->{
			System.out.println(entry.getKey()+" --- "+entry.getValue());
		});
		
	}
}
