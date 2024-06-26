package com.Imadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.ContactModel;



public class ImageDao {

	public static Connection getconnection()
	{
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
	}
	
	public static List<ImageModel> getAll()
	{
		java.util.List<ImageModel> i = new ArrayList<ImageModel>();
		try {
			
			Connection con = ImageDao.getconnection();
			PreparedStatement ps= con.prepareStatement("select * from products");
			
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				ImageModel d1 = new ImageModel();
				d1 = new ImageModel();
				d1.setId(rs.getInt("id"));
				d1.setP_name(rs.getString("p_name"));
				d1.setP_price(rs.getString("p_price"));
				d1.setP_des(rs.getString("p_des"));
				
				//d1.setP_image(rs.getString("p_image"));
				
				 byte[] imgData = rs.getBytes("p_image"); // blob field 
		         String encode = Base64.getEncoder().encodeToString(imgData);
		         d1.setP_image(encode);
		         //request.setAttribute("imgBase", encode);
				i.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return i;
	}
	
	public static List<ContactModel> contactdetails()
	{
		java.util.List<ContactModel> i = new ArrayList<ContactModel>();
		try {
			
			Connection con = ImageDao.getconnection();
			PreparedStatement ps= con.prepareStatement("select * from contact");
			
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				ContactModel d1 = new ContactModel();
				d1 = new ContactModel();
				d1.setId(rs.getInt("id"));
				d1.setName(rs.getString("name"));
				d1.setEmail(rs.getString("email"));
				d1.setSubject(rs.getString("subject"));
				d1.setMessage(rs.getString("message"));
				d1.setStatus(rs.getString("status"));
				
				//d1.setP_image(rs.getString("p_image"));
				
				
				i.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return i;
	}
	
	public static ImageModel getimageindexwise(int id)
	{
		Connection con = ImageDao.getconnection();
		
		ImageModel m = new ImageModel();
		
		String sql ="select * from products where id=?";
		
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				
					
				
				 byte[] imgData = set.getBytes("p_image"); // blob field 
		         String encode = Base64.getEncoder().encodeToString(imgData);
		         
		         int id1 = set.getInt("id");
		         String pname = set.getString("p_name");
		         String pprice = set.getString("p_price");
		         String pdes = set.getString("p_des");
				
		        
				
		         m.setP_image(encode);
				m.setP_name(pname);
				m.setP_price(pprice);
				m.setP_des(pdes);
				
				
				
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


