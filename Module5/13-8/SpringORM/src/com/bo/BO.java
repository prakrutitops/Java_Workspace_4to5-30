package com.bo;

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
	
}
