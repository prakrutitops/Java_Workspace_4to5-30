package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
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
	
	public void updatedata(Person p)
	{
		this.getHibernateTemplate().update(p);
	}
	
	public void deletedata(Person p)
	{
		this.getHibernateTemplate().delete(p);
	}
	
	public Person getPersonById(int id)
	{
			HibernateTemplate template=getHibernateTemplate();
			Person p=template.get(Person.class,id);
			return p;
	}
	
}
