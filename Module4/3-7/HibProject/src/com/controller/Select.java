package com.controller;

import java.util.List;

import com.dao.Dao;
import com.model.Person;

public class Select 
{
	public static void main(String[] args) 
	{
		List<Person>list = Dao.viewRecords();
		for(Person person:list)
		{
			System.out.println(person.getId()+"\t|\t"+person.getFname()+"\t|\t"+person.getLname());
		}
	}
}
