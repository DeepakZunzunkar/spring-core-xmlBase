package com.dz.app.beanLifecycle.programaticAproch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.google.gson.Gson;


//here spring making this bean as spring dependent
//it forcing to implement interfaces 
public class DbConfig implements InitializingBean,DisposableBean{

	private String driver;
	private String url;
	private String userName;
	private String password;
	private Connection con;
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		System.out.println("setter methods called..");
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public DbConfig() {
		super();
		System.out.println("DbConfig Object created..");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("DbConfig init called...");
		Class.forName(driver);	
		con=DriverManager.getConnection(url,userName,password);
		System.out.println("connection opened..");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DbConfig destroy method called ..");
		con.close();
		System.out.println("connection close");
	}
	
	public String getData(){
		
		PreparedStatement ps;
		ResultSet resultSet;
		List<Object[]> records=new ArrayList<Object[]>();

		try {
			ps = con.prepareStatement("select * from adpemployee where firstname like '%p%'");
			resultSet = ps.executeQuery();
		
			while(resultSet.next()){
				int cols = resultSet.getMetaData().getColumnCount();
				Object[] arr = new Object[cols];
				for(int i=0; i<cols; i++){
					arr[i] = resultSet.getObject(i+1);
				}
				records.add(arr);
			}
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return new Gson().toJson(records);
	}
}
