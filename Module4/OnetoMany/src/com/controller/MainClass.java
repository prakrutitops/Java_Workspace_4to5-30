package com.controller;

import java.util.ArrayList;
import java.util.List;
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
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name 1: ");
		String name = sc.next();
		
		System.out.println("Enter Your Name 2: ");
		String name2 = sc.next();
		
		System.out.println("Enter Your Address");
		String addr = sc.next();
		
		Person p1 = new Person();
		p1.setName(name);
		
		Person p2 = new Person();
		p2.setName(name2);
		
		Address add = new Address();
		add.setCity(addr);
		
		
		p1.setAddress(add);
		p2.setAddress(add);
		
		List<Person> list =  new ArrayList<>();
		list.add(p1);
		list.add(p2);
		
		add.setPerson(list);
		
		sess.save(p1);
		sess.save(p2);
		sess.save(add);
		
		
		tr.commit();
		sess.close();
		
	
		
	}
}
