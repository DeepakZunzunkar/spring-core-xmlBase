package com.dz.app.setterBase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {


	
	public static void main(String[] args) {

		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);

		Employee emp=(Employee)factory.getBean("emp1");
		System.out.println(emp);

//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Employee emp=(Employee)ac.getBean("emp2");
//		emp.show();
	}

}
