package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass 
{
public static void main(String[] args)
{
	ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
	Person per = (Person) con.getBean("t1");

	per.display();
}
}
