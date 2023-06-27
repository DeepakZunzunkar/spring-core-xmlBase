package com.dz.app.spring_expression_lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spEl")
public class Expressions {

	@Value("#{ 1+2 }")
	private int x;
	
	@Value(" #{ 5+6 } ")
	private int y;

	//static method
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private int z;	
	

	//static variable 
	@Value("#{ T(java.lang.Math).PI }")
	private double p;	
	
	// object as value  
	@Value(" #{ new java.lang.String('deepak') } ")
	private String name;
	
	//boolean
	@Value(" #{ 10-2>5 }")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Expressions [x=" + x + ", y=" + y + ", z=" + z + ", p=" + p + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	
}
