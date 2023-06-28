package com.dz.app.java_base_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.dz.app.java_base_config" )
public class JavaConfig {

	
	//here container create object with reference name as method name . 
	//getAddress is the reference name by using that reference we can get this object. 
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean("countryThi")
	public Country getCountry() {
		return new Country("Thailand","+66");
	}
	
	//-----------------------------------------------------
	
	@Bean
	public Employee employee1() {
		return new Employee(002l,"ketan",address());
	}
	
	@Bean
	public Address address() {
		return new Address("JM road","pune",country());
	}
	
	@Bean
	public Country country() {
		return new Country("India","+91");
	}
	
}
