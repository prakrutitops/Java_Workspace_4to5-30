package com.a113;

import java.util.Scanner;

public class Student 
{
	//data memebers or variables
	//int id;
	static String name[] = new String[3];
	//String surname;
	
	
	public static void main(String[] args) 
	{
	
		//object
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//assign value to object
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Enter name for "+i+"st Student");
			name[i]= sc.next();
			
		}
		
		
		System.out.println("Your Names Are: ");
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Your Name is "+name[i]);
			
		}
		
//		System.out.println(s1.id+" "+s1.name);
//		System.out.println(s2.id+" "+s2.name);
//		System.out.println(s3.id+" "+s3.name);
		
		
		
//		System.out.println("Enter id for 2nd Student");
//		int id2 = sc.nextInt();
//		
//		System.out.println("Enter name for 2nd Student");
//		String  name2= sc.next();
//		
//		System.out.println("Enter id for 3rd Student");
//		int id3 = sc.nextInt();
//		
//		System.out.println("Enter name for 3rd Student");
//		String  name3= sc.next();
//		
//		
//		s1.id=id;
//		s1.name=name;
//		
//		s2.id=id2;
//		s2.name=name2;
//		
//		s3.id=id3;
//		s3.name=name3;
//		
//		//print all values
//		System.out.println(s1.id+" "+s1.name);
//		System.out.println(s2.id+" "+s2.name);
//		System.out.println(s3.id+" "+s3.name);
//		
		
		
		
	}
}
