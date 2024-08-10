package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		
		Person p2 = (Person) acm.getBean("t2");
		
		System.out.println(p2.getPid()+" "+p2.getPname());
	}
}
