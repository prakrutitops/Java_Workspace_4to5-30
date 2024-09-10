package com.dao;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.SignupModel;
import com.model.SmsModel;



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
	
	//signup
		public static int smsinsert(SmsModel m)
		{
			Connection con = Dao.getconnect();//connection call
			
			int status = 0;
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into msg(sender_id,receiver_id,message) values (?,?,?)");
				ps.setString(1, m.getSender_id());
				ps.setString(2, m.getReceiver_id());
				ps.setString(3, m.getMessage());
				
				
				status = ps.executeUpdate();//run
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return status;
		}
		
		 public static List<SmsModel> smsview(String email)
			{
				List<SmsModel> i = new ArrayList<SmsModel>();
				try {
					
					Connection con = Dao.getconnect();
					PreparedStatement ps= con.prepareStatement("select * from msg where receiver_id=?");
					ps.setString(1, email);
					ResultSet rs = (ResultSet) ps.executeQuery();
					
					while(rs.next())
					{
						SmsModel d1 = new SmsModel();
						d1 = new SmsModel();
						d1.setId(rs.getInt("id"));
						d1.setSender_id(rs.getString("sender_id"));
						d1.setReceiver_id(rs.getString("receiver_id"));
						d1.setMessage(rs.getString("message"));
						//d1.setP_image(rs.getString("p_image"));
						
					
				         //request.setAttribute("imgBase", encode);
						i.add(d1);
						
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				return i;
			}
		
	
	
}
