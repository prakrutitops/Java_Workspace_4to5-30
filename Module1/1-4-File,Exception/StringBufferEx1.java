package com.a14;

public class StringBufferEx1 
{
	public static void main(String[] args) 
	{
		
		StringBuffer bf = new StringBuffer("Hello");
		
		
		//1. append
		
		//bf.append(" Java");
		//System.out.println(bf.toString());
		
		//2. Insert
		
		//bf.insert(1, "Java");
		//System.out.println(bf.toString());
		
		//3.delete
		//bf.delete(1,3);
		//System.out.println(bf.toString());
		
		//4.Replace
		//bf.replace(1, 3, "Java");
		//System.out.println(bf.toString());
	
		//5. Reverse
		bf.reverse();
		System.out.println(bf.toString());
	
	}
}
