package com.connect;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Util 
{
	public Session getconnect()
	{
		Session sess = null;
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		sess = sf.openSession();
		
		return sess;
	}
}
