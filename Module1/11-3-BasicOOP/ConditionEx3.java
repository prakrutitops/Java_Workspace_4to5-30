package com.a113;

import java.util.Scanner;

public class ConditionEx3 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass= sc.next();
		
		if(!email.equals("a@gmail.com"))
		{
			System.out.println("Your Email id is Wrong");
			
			if(!pass.equals("1234"))
			{
				System.out.println("Your Password is Wrong");
			}
		}

		else if(!pass.equals("1234"))
		{
			System.out.println("Your Password is Wrong");
		}
	
		else
		{
			System.out.println("Login Success");
		}
		
		
		
		
		
	}
}
