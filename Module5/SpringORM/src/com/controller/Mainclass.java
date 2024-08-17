package com.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.BO;
import com.model.Person;

public class Mainclass {
public static void main(String[] args) 
{
	ApplicationContext con = new ClassPathXmlApplicationContext("tops.xml");

	Scanner sc = new Scanner(System.in);
	BO bo = (BO) con.getBean("bo");
	Person p  =  (Person) con.getBean("model");
	
////	 Insert OP

// System.out.println("Enter name:");
//	 p.setName(sc.next());
//	 bo.Insert(p);
	
//Update OP

//	System.out.println("Enter Id");
//	int id = sc.nextInt();
//	
//	System.out.println("Enter Name");
//	String name =sc.next();
//	
//	p.setId(id);
//	p.setName(name);
//	
//	bo.Update(p);

	//Delete OP
	
//	System.out.println("Enter Id");
//	int id = sc.nextInt();
//	p.setId(id);
//	bo.Delete(p);
	
	//Fetch OP
	
//	List<Person>list = bo.getall();
//	
//	for(Person person : list)
//	{
//			System.out.println(person.getId()+"\t|\t"+person.getName());
//	}
	
	//Single Fetch 
	
	
//	System.out.println("Enter Your Id");
//	int id = sc.nextInt();
//	p.setId(id);
//	Person p1 = bo.getSingle(p);
//	System.out.println(p1.getName());
//	

}
}
