package com.dz.app.constructorBase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
		
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Employee emp1=(Employee)factory.getBean("cemp1"); 
		System.out.println(emp1);
		System.out.println("-------------------------\n");
		Employee emp2=(Employee)factory.getBean("cemp2");
		System.out.println(emp2);
		System.out.println("-------------------------\n");
		
		System.out.println("Ambiguity Examples.....\n");
		
		Calculate calsi1=(Calculate)factory.getBean("calsi1");
		calsi1.add();
		
		
	}	

}