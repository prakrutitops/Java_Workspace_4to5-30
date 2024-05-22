package com.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection 
{
	public Connection getconnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor finder","root","");
		return cnn;
	}
}
