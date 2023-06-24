package com.dz.app.autowire.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	private String name;
	
	//it will inject address object byType
	@Autowired
	@Qualifier("address6")  //here it say to inject object with reference address6 only and ignore other
	private Address address1;
	

//	@Inject  //--> if not available we have to add j2ee spring jar 
	
	@Resource		//Autowiring 
	private Department department;  
	
	public Employee() {
		super();
		System.out.println("emp no arg constructor called..");
	}
	
	//constructor based, DI mode byType
//	@Autowired
//	@Qualifier("address5")  ---> not allowed here , praised compile time error
	public Employee(Address address2) {
		super();
		System.out.println("emp address arg constructor called..");
		this.address1 = address2;
	}
	
	public Employee(String name, Address address2) {
		super();
		System.out.println("emp name and address arg constructor called..");
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

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter called..");
		this.address1 = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address1=" + address1 + ", department=" + department + "]";
	}

	
	
}
