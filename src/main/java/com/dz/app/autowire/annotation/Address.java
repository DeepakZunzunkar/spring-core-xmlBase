package com.dz.app.autowire.annotation;

public class Address {

	private String street;
	private String city;
	
	
	public Address() {
		super();
		System.out.println("address no arg constructor called..");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
