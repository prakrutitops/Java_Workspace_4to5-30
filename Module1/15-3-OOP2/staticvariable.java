package com.a153;

public class staticvariable 
{
	int id;
	String name;
	static String college="VVP";
	
	public staticvariable(int id,String name) 
	{
		this.id=id;
		this.name=name;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college = "Atmiya";
	}
	
	public static void main(String[] args) 
	{
		
		staticvariable s1 = new staticvariable(101,"jay");
		staticvariable s2 = new staticvariable(102,"aayush");
		staticvariable s3 = new staticvariable(103,"karan");
		
		change();
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}
}
