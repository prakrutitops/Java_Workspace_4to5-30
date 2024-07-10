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
		Session sess =  new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		p.setName(sc.next());
		
		Address ad = new Address();
		Address ad1 = new Address();

		System.out.println("Enter Address:");
		ad.setCity(sc.next());
		ad.setPerson(p);
		
		System.out.println("Enter Residence:");
		ad1.setCity(sc.next());
		ad1.setPerson(p);
		
		List<Address>list = new ArrayList<Address>();
		list.add(ad);
		list.add(ad1);
		
		p.setAddress(list);
		
		sess.save(p);
		sess.save(ad);
		sess.save(ad1);
		tr.commit();
		sess.close();
		
	
		
		
		
		
		
	}
}
