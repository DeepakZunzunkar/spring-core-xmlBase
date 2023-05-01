package com.dz.app.constructorBase;

import java.util.List;

public class Employee {

	
	private int id;
	private String name;
	private List<String> addresses;

	static {
		System.out.println("Employee class is loaded...");
	}
	
	public Employee() {
		System.out.println("Employee default constructor called ..");
	}
	
	public Employee(int id,String name,List<String> addresses) {
		
		System.out.println("Employee parameterised constructer called ..");
		this.id=id;
		this.name=name;
		this.addresses=addresses;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+id+"\t name :"+name+"\t address :"+addresses;
	}

}