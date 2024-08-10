package com.a;

public class Model 
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void destroy()
	{
		System.out.println("Destroy");
	}
	
	void initialize()
	{
		System.out.println("Initialized");
	}
	
	
	
}
