package com.dz.app.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 	
public class Engine {

	@Value("5000cc Hp")
	private String engineName;

	public Engine() {
		System.out.println("Engine no arg constructor...");
	}
	
	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + "]";
	}
	
}