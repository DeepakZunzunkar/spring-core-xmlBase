package com.dz.app.autowire.xml;

public class Employee {
	
	
	private String name;
	private Address address1;
	
	
	public Employee() {
		super();
	}
	
	public Employee(Address address2) {
		super();
		System.out.println("address arg constructor called..");
		this.address1 = address2;
	}
	
	public Employee(String name, Address address2) {
		super();
		System.out.println("name and address arg constructor called..");
		this.name = name;
		this.address1 = address2;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address1;
	}

	//based on setter method name it will do DI
	public void setAddress(Address address) {
		System.out.println("setter called..");
		this.address1 = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Address=" + address1 + "]";
	}
	
}
