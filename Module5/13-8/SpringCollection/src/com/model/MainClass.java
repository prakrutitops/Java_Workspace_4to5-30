package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		
		Person p = (Person) acm.getBean("t1");
		
		System.out.println("-------------LIST--------------");
		System.out.println(p.getList());
		
		System.out.println("-------------SET--------------");
		System.out.println(p.getSet());
		
		System.out.println("-------------MAP--------------");
		System.out.println(p.getMap());//key & value
		
		System.out.println("-------------PROPERTIES--------------");
		System.out.println(p.getProperties());//
		
	}
}
