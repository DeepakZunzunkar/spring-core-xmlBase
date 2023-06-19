package com.dz.app.constructorBase;

import java.util.List;

public class Employee {

	
	private int id;
	private String name;
	private Department department;
	
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
	
	
	public Employee(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	
	public Employee(int id, String name, Department department, List<String> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", addresses=" + addresses
				+ "]";
	}

}