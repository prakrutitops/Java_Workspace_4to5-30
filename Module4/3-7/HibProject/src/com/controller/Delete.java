package com.controller;

import java.util.Scanner;

import org.hibernate.classic.Session;

import com.connect.Util;
import com.dao.Dao;
import com.model.Person;

public class Delete 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id= sc.nextInt();
		
		
		
		Person p = new Person();
		p.setId(id);
		
		
		new Dao().deletedata(p);
		
		
	}
}
