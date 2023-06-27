package com.dz.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/dz/app/config.xml");
        Employee employee1=(Employee)context.getBean("e1");
        System.out.println(employee1);
        
        Employee employee2=(Employee)context.getBean("e2");
        System.out.println(employee2);
        
        Employee employee3=(Employee)context.getBean("e3");
        System.out.println(employee3);
        Employee employee3_1=(Employee)context.getBean("e3");
        System.out.println(employee3_1);
        
        // if we remove scope then hash code same means container return same object as it create singleton object. 
        System.out.println(employee3.hashCode());
        System.out.println(employee3_1.hashCode());
    }
}
