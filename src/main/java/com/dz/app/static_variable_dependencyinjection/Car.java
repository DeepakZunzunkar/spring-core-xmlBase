package com.dz.app.static_variable_dependencyinjection;

import java.util.List;

public class Car {

	private static String carName;
	
	public static List<String> toolList;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	
	public static void setCarTools(List<String> tools) {
		Car.toolList=tools;
	}
	
	public void pritCarName() {
		System.out.println("Car Name :"+carName);
	}
}
