package com.bo;

import java.util.List;

import com.dao.DAO;
import com.model.Person;

public class BO 
{
	DAO dao;

	public DAO getDao() 
	{
		return dao;
	}

	public void setDao(DAO dao) 
	{
		this.dao = dao;
	}
	
	public void Insert(Person p)
	{
		dao.Insert(p);
	}
	public void Update(Person p)
	{
		dao.Update(p);
	}
	public void Delete(Person p)
	{
		dao.Delete(p);
	}
	public List<Person> getall()
	{
		List<Person> getlist = dao.getall();
		return getlist;
	}
	public Person getSingle(Person p)
	{
		Person p1 =dao.getSingle(p);
		return p1;
	}
	
}
