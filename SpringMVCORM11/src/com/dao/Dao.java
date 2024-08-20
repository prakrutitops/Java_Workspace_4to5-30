package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class Dao extends HibernateDaoSupport
{

	public void insertdata(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	
}
