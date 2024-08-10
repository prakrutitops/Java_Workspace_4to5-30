package com.model;

public class Person 
{

	private int id;
	private String name;
	private Address add;


	public Person(Address add) {
		this.add = add;
	}
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
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
	
	
	public void display()
	{
		System.out.println(name+" lives in "+add.getAdd());
	}
}
