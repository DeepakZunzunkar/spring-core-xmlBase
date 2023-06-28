package com.dz.app.java_base_config;

public class Address {

	private String street;
	private String city;
	private Country country;
	
	public Address() {
		super();
		System.out.println("Address no arg constructor called..");
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
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Address(String street, String city, Country country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		System.out.println("Address with three arg constructor called..");
	}

}
