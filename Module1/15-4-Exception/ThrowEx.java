package com.a154;

public class ThrowEx 
{
	
	int age = 25;
	
	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("Eligible to vote");
			
		}
		else
		{
			throw new ArithmeticException("Not Valid");
		}
	}
	public static void main(String[] args) 
	{
		validate(15);
		
		
		
	}
}
