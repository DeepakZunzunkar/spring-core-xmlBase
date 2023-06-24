package com.dz.app.autowire.annotation;

public class Department {

	private String name;

	
	public Department() {
		super();
		System.out.println("deprtmenr no arg constructor called ...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
	
}
