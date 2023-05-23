package com.dz.app.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employer {

	private Long id;
	private String name;
	private List<String> projects;
	private Set<String> clients;
	private Map<Long, String> clientCode;
	private Properties dbProperties;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Set<String> getClients() {
		return clients;
	}

	public void setClients(Set<String> clients) {
		this.clients = clients;
	}

	public Map<Long, String> getClientCode() {
		return clientCode;
	}

	public void setClientCode(Map<Long, String> clientCode) {
		this.clientCode = clientCode;
	}
	
	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	public void display() {

		System.out.println("Employer id=" + id + ", name=" + name + "\n");

		System.out.println("Projects ==>");
		this.projects.stream().forEach(pr -> System.out.println("\t\t" + pr));
		System.out.println("\nClients ==>");
		this.clients.stream().forEach(clnt -> System.out.println("\t\t" + clnt));
		
		System.out.println("\nClients and their Code ==>");
		this.clientCode.entrySet().forEach(ss-> System.out.println("\t\t code "+ss.getKey()+" ---> "+ss.getValue()));
	}

	@Override
	public String toString() {
		return "Employer [id=" + id + ", name=" + name + ", projects=" + projects + ", clients=" + clients + "]";
	}
}
