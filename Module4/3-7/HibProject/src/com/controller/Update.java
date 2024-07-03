package com.controller;

import java.util.Scanner;

import org.hibernate.classic.Session;

import com.connect.Util;
import com.dao.Dao;
import com.model.Person;

public class Update 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id= sc.nextInt();
		
		System.out.println("Enter Your Firstname");
		String fname= sc.next();
		
		System.out.println("Enter Your Lastname");
		String lname= sc.next();
	
		
		Person p = new Person();
		p.setId(id);
		p.setFname(fname);
		p.setLname(lname);
		
		new Dao().updatedata(p);
		
		
	}
}
