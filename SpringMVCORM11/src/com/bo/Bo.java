package com.bo;

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
}
