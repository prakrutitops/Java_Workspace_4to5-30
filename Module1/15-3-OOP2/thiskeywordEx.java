package com.a153;

public class thiskeywordEx 
{
	int id;
	String name;
	
	public thiskeywordEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args) 
	{
		
		thiskeywordEx t1 = new thiskeywordEx(101,"abcd");
		thiskeywordEx t2 = new thiskeywordEx(102,"pqrs");
		
		t1.display();
		t2.display();
		
	}
}
