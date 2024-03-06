package com.a63;

public class ConditionEx3 
{
	public static void main(String[] args) 
	{
		//userinput
		String email = "a@gmail.com";
		String pass=  "1234";
		
		
		if(!email.equals("a@gmail.com"))
		{
			System.out.println("Your Email id is Wrong");
			
			if(!pass.equals("1234"))
			{
				System.out.println("Your Password is Wrong");
			}
		}
	
		else
		{
			System.out.println("Login Success");
		}
		
		
		
		
		
	}
}
