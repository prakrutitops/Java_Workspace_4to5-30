package com.model;

public class Person 
{
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void initialization()
	{
		System.out.println("Initialization");
	}
	
	public void destroy()
	{
		System.out.println("Destroy");
	}
	
	
}
