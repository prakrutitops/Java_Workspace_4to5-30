package com.a133;

public class ParaEx 
{
	int id;
	String name;
	
	public ParaEx(int i,String n) 
	{
		// TODO Auto-generated constructor stub
		
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		
		ParaEx p1 = new ParaEx(101,"abcd");
		ParaEx p2 = new ParaEx(102,"pqrs");
		
		//System.out.println(p1.id+" "+p1.name);
		//System.out.println(p2.id+" "+p2.name);
		
		p1.display();
		p2.display();
	}
	
}
