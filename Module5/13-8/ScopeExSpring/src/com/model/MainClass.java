package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{	
	public static void main(String[] args)
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person) acm.getBean("t1");
		
		
		System.out.println(p.getId()+" "+p.getName());
	
		Person p2 = (Person) acm.getBean("t1");
		
		p2.setId(102);
		p2.setName("pqrs");
		
		System.out.println(p2.getId()+" "+p2.getName());
		
	}
}
