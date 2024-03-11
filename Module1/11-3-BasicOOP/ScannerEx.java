package com.a113;

import java.util.Scanner;

public class ScannerEx 
{
	public static void main(String[] args) 
	{
		
		//classname objname = new classname();
		
		Scanner sc = new Scanner(System.in); //user input get
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		System.out.println(id+" "+name+" "+salary);
		
		
		
		
	}
}
