package com.dz.app.java_base_config;

public class Country {

	private String countryName;
	private String countryCode;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Country() {
		super();
		System.out.println("Country no arg constructor called..");
	}
	public Country(String countryName, String countryCode) {
		super();
		this.countryName = countryName;
		this.countryCode = countryCode;
		System.out.println("Country with two arg constructor called..");
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCode=" + countryCode + "]";
	}
}
