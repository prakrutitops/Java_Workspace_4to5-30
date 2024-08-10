package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person) acm.getBean("t1");
		System.out.println("Hello From "+p.getName());
		
		Thread.sleep(2000);
		
		((AbstractApplicationContext) acm).registerShutdownHook();
	}
}
