package com.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	
	public static void main(String[] args) {
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Model m = (Model) acm.getBean("t1");
		
		System.out.println(m.getName());
		((AbstractApplicationContext) acm).registerShutdownHook();//destroy
	}
	
}
