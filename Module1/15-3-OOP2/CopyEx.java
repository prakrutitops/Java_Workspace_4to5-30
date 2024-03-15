package com.a153;

public class CopyEx 
{
	int id;
	String name;
	
	CopyEx(int i,String n) 
	{
		// TODO Auto-generated constructor stub
		
		id = i;
		name = n;
	}
	
	CopyEx(CopyEx c1)
	{
		System.out.println(c1.id+" "+c1.name);
	}
	
	
	public static void main(String[] args)
	{
		
		CopyEx c1 = new CopyEx(101,"abcd");
		CopyEx c2 = new CopyEx(c1);
		
		
		
	}
	
}
