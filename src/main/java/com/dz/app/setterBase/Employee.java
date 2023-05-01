package com.dz.app.setterBase;

import java.util.List;

public class Employee {

	static {
		System.out.println("Employee class is loaded...");
	}

	public Employee() {
		System.out.println("Employee default constructor called ..");
	}

	private int id;
	private String name;
	
/*	private List<String> addresses;
	
	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
*/

/*	private Address addresses;
	
	public Address getAddress() {
		return addresses;
	}

	public void setAddress(Address address) {
		this.addresses = address;
	}
*/	
	
	private List<Address> addresses;


	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
}
