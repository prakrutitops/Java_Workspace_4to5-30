package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static int signupdata(Model m)
	{
		Connection con =Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert  into info (name,email,address,phone) values (?,?,?,?)");
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getAddress());
			ps.setString(4,m.getPhone());
			
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<Model>viewdata()
	{
		List<Model>list = new ArrayList<>();
		Connection con =Dao.getconnect();
		try 
		{
			
			
			PreparedStatement ps = con.prepareStatement("select * from info");
			
			ResultSet set = ps.executeQuery();
			
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String address = set.getString(4);
				String phone = set.getString(5);
				
				Model p = new Model();
				p.setId(id);
				p.setName(name);
				p.setEmail(email);
				p.setAddress(address);
				p.setPhone(phone);
				list.add(p);
			}
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return list;
	}
	
}
