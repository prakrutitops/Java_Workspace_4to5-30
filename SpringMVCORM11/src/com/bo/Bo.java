package com.bo;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.Dao;
import com.model.Person;

public class Bo 
{
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void insertdata(Person p)
	{
		dao.insertdata(p);
	}
	
	public List<Person>viewdetails()
	{
		return dao.viewdetails();
	}
	
	public void updatedata(Person p)
	{
		 dao.updatedata(p);
	}
	
	public void deletedata(Person p)
	{
		dao.deletedata(p);
	}
	public Person getPersonById(int id)
	{
		return dao.getPersonById(id);
	}
}
