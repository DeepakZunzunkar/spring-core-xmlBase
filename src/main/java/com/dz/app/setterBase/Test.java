package com.dz.app.setterBase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {


	
	public static void main(String[] args) {

		
		/*
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
	
		// here at first user request class will get loaded and object are created .
		   Employee emp=(Employee)factory.getBean("emp1");
		
		*/

		// here at xml file loading itself class is loaded and object get created which are declared in xml file . 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee)applicationContext.getBean("emp1");
		
		System.out.println(emp);
	}

}
