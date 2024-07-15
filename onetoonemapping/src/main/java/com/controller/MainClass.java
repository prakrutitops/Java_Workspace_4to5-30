package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Address");
		String city = sc.next();
		
		Person p = new Person();
		p.setName(name);
		
		Address a = new Address();
		a.setCity(city);
		a.setPerson(p);
		
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.save(a);
		sess.save(p);
		tr.commit();
		sess.close();
		
	
		
	}
}
