package com.dz.app.beanLifecycle.annotationAproch;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Annotation are available from JDK 1.5 version
// this @PostConstruct and @PreDestroy annotation is part of J2EE but from java 9 this annotation were removed 
// to use this we have to add dependency of it separately
// to enable annotation we have to use one tag or crate object of some classes in config file 
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
	
	@PostConstruct
	public void init() {
		System.out.println("3. inside init method ...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("4. inside destroy method ...");
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
