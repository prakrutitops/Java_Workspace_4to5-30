package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		
		Person p = (Person) acm.getBean("t2");
		
		System.out.println(p.getName()+" "+p.getCity());
		
	}
}
