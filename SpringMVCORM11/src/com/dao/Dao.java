package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class Dao extends HibernateDaoSupport
{

	public void insertdata(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	
	public List<Person>viewdetails()
	{
		return getHibernateTemplate().find("from Person");
	}
	
}
