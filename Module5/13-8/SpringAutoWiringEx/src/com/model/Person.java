package com.model;

public class Person 
{
	int id;
	String name;
	Address add;
	
	public Person(Address add)
	{
		// TODO Auto-generated constructor stub
		
		this.add=add;
	}
	
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
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public void display()
	{
		System.out.println(name+" lives in "+add.getAddress());
	}
	
}
