package com.dz.app.java_base_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("#{ 001 }")
	private Long empCode;
	
	@Value("#{ 'James Bond' }")
	private String name;

	private Address address;
	
	
	public Long getEmpCode() {
		return empCode;
	}

	public void setEmpCode(Long empCode) {
		this.empCode = empCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();
		System.out.println("Employee no arg constructor called..");
	}

	
	public Employee(Long empCode, String name, Address address) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.address = address;
		System.out.println("Employee with three arg constructor called..");
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", name=" + name + ", address=" + address + "]";
	}
}
