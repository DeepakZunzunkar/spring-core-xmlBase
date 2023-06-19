package com.dz.app.beanLifecycle.xml;


/*
 * 
 * first container will create object of bean class
next it will do setter DI then after it will call init method means
container will execute this afterPropertiesSet method

*
*/
public class Product {

	String name;
	Double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("2. setter method called ..");
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public Product() {
		super();
		System.out.println("1. object created...");
	}
	
	//here we can do initialization operation
	void init() {
		System.out.println("3. inside init method ...");
	}
	
	//here we can do cleanup operation or resources closing operation whatever resourcse we open from init method
	void destroy() {
		System.out.println("4. inside destroy method ...");
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
