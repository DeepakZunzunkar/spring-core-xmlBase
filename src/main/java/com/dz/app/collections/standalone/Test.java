package com.dz.app.collections.standalone;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/dz/app/collections/standalone/config.xml");
		Student s1=context.getBean(Student.class);
		System.err.println("_______________Best Breends_________________________________");
		System.out.println(s1.getBestFriends().getClass().getName());
		s1.getBestFriends().forEach(ss->{
			System.out.println(ss);
		});
		System.err.println("_______________Academic_________________________________");
		
		System.out.println(s1.getAcademics().getClass().getName());
		
		s1.getAcademics().entrySet().stream().forEach(entry->{
			System.out.println(entry.getKey()+" ---- "+entry.getValue());
		});
		
		System.err.println("__________________Db Config ______________________________");
		
		s1.getDbConfig().entrySet().stream().forEach(entry->{
			System.out.println(entry.getKey()+" --- "+entry.getValue());
		});
		
		
	}
}
