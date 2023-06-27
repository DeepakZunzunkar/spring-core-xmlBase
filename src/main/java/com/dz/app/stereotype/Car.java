package com.dz.app.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("c")							 				//--->container will automatically create Object 
@Scope("prototype")
public class Car {
	
	
	@Value("Audi")
	private String name;
	
	//from 1.5 we have Autowired support 
	@Autowired										//Automatically container will inject this Object
	private Engine engine;

	//spring expression , to set collection
	@Value("#{parts}")
	private List<String> bodyParts;
	
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car() {
		super();
		System.out.println("car no arg constructor...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBodyParts() {
		return bodyParts;
	}

	public void setBodyParts(List<String> bodyParts) {
		this.bodyParts = bodyParts;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + ", bodyParts=" + bodyParts + "]";
	}
}
