package com.a;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;



public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	  
	  public static SignupModel getdata(int id)
		{
			Connection con = Dao.getconnect();
			
			SignupModel m = new SignupModel();
			
			String sql ="select * from usertable where id=?";
			
			try 
			{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1,id);
				
				ResultSet set = ps.executeQuery();
				
				if(set.next())
				{
					
						
					
					 byte[] imgData = set.getBytes("image"); // blob field 
			         String encode = Base64.getEncoder().encodeToString(imgData);
			         
			         int id1 = set.getInt("id");
			         String fnmae = set.getString("fname");
			         String lname = set.getString("lname");
			         String email = set.getString("email");
			         String pass = set.getString("password");
			        
			        m.setId(id);
			        m.setImage(encode);
					m.setFname(fnmae);
					m.setLname(lname);
					m.setEmail(email);
					m.setPassword(pass);
					
					
					
				}
				
				//get all details from model
				
				
				
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return m;
		}
	  
	
}
