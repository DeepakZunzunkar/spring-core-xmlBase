package com.dz.app.collections.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {

	private List<String> bestFriends;
	
	//year schoolName
	private Map<Integer,String> academics;
	
	private Properties dbConfig;
	
//	private 
	private Student() {
		super();
		System.out.println("Student no arg constructor called..");
	}


	public List<String> getBestFriends() {
		return bestFriends;
	}


	public void setBestFriends(List<String> bestFriends) {
		this.bestFriends = bestFriends;
	}


	public Map<Integer, String> getAcademics() {
		return academics;
	}


	public void setAcademics(Map<Integer, String> academics) {
		this.academics = academics;
	}


	public Properties getDbConfig() {
		return dbConfig;
	}


	public void setDbConfig(Properties dbConfig) {
		this.dbConfig = dbConfig;
	}
	
	
}
