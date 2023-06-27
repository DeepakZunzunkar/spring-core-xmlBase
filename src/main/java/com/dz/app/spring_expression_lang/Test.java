package com.dz.app.spring_expression_lang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dz/app/spring_expression_lang/config.xml");
		
		Expressions bean = context.getBean("spEl",Expressions.class);
		
		System.out.println(bean);
	}
}
