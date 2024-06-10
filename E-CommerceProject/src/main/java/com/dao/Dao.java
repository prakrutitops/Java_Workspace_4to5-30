package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.AdminModel;
import com.model.SignupModel;


public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static int signup(SignupModel m)
	{
		Connection con =Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert  into users (name,email,phone,password) values (?,?,?,?)");
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static SignupModel login(SignupModel m)
	{
		SignupModel m2=null;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from users where email=? and password=?");
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String phone = set.getString(4);
				String password = set.getString(5);
				
				m2 = new SignupModel();
				
				m2.setId(id);
				m2.setName(name);
				m2.setEmail(email);
				m2.setPhone(phone);
				m2.setPassword(password);
				
			}
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
		
	}
	
	  public static AdminModel adminlogin(AdminModel m) { AdminModel m2=null;
	  
	  Connection con = Dao.getconnect(); try { PreparedStatement ps = con.
	  prepareStatement("select * from adminlogin where username=? and password=?");
	  ps.setString(1,m.getUsername()); ps.setString(2,m.getPassword());
	  
	  ResultSet set = ps.executeQuery();
	  
	  while(set.next()) { int id = set.getInt(1); String username =
	  set.getString(2); String firsrname = set.getString(3); String email =
	  set.getString(4); String password = set.getString(5);
	  
	  m2 = new AdminModel();
	  
	  m2.setId(id); m2.setUsername(username); m2.setFirstname(firsrname);
	  m2.setEmail(email); m2.setPassword(password);
	  
	  } } catch (Exception e) { // TODO Auto-generated catch block
	  e.printStackTrace(); }
	  
	  return m2;
	  
	  }
	 
	
}
