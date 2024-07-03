package com.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.connect.Util;
import com.model.Person;

public class Dao 
{
	public void insertdata(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.save(p);
		tr.commit();
		sess.close();
	}
	public void updatedata(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.update(p);
		tr.commit();
		sess.close();
	}
	public void deletedata(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(p);
		tr.commit();
		sess.close();
	}
	
	public static List<Person> viewRecords()
	{
		Session sess = new Util().getconnect();
		List<Person> getall = sess.createQuery("from Person").list();
		
		sess.close();
		return getall;
	}
	public static Person getSingle(Person p)
	{
		Session sess = new Util().getconnect();
		Person person = (Person) sess.get(Person.class, p.getId());
		
		sess.close();
		return person;
	}
	
}
