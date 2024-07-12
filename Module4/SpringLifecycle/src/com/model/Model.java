package com.model;

public class Model 
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init()
	{
		System.out.println("initialization");
	}
	public void destroy()
	{
		System.out.println("destroyed");
	}
	
}
