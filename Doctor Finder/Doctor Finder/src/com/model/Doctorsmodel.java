package com.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.DBconnection.DBconnection;
import com.bin.Doctorsbean;


public class Doctorsmodel {
	
	public ArrayList<Doctorsbean> searchdr(String areavise, String speciality) 
	{
		ArrayList<Doctorsbean> dob = new ArrayList<Doctorsbean>();
		
		System.out.println(areavise);
		System.out.println(speciality);
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select * from doctors where Location=? and Speciality=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, areavise);
			pst.setString(2, speciality);
			System.out.println("Hello");
			ResultSet rs = pst.executeQuery();
			System.out.println("Hello");
			if (rs.next()) 
			{
				System.out.println("Hello");
				Doctorsbean dob1 = new Doctorsbean();
				dob1.setSpeciality(rs.getString("Speciality"));
				dob1.setLocation(rs.getString("Location"));
				dob1.setName(rs.getString("Dr_Name"));
				System.out.println("raj");
				dob1.setContact_no(rs.getString("ContactNo"));
				dob1.setEmail(rs.getString("Email"));
				dob1.setAddress(rs.getString("Address"));
				dob.add(dob1);
				
			}
			
			else
			{
				System.out.println("No match found..");
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return dob;
	}
	public ArrayList<Doctorsbean> alldoctors() 
	{
		ArrayList<Doctorsbean> d = new ArrayList<Doctorsbean>();
		
		
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select * from doctors";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) 
			{
				
				Doctorsbean d1 = new Doctorsbean();
				d1.setId(rs.getInt("id"));
				d1.setSpeciality(rs.getString("Speciality"));
				d1.setLocation(rs.getString("Location"));
				d1.setName(rs.getString("Dr_Name"));
				d1.setImage(rs.getString("Image"));
				d1.setContact_no(rs.getString("ContactNo"));
				d1.setEmail(rs.getString("Email"));
				d1.setAddress(rs.getString("Address"));
				d.add(d1);
				
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return d;
	}
	public ArrayList<Doctorsbean> allspeciality(String speciality) 
	{
		ArrayList<Doctorsbean> d = new ArrayList<Doctorsbean>();
		
		
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select * from doctors where Speciality='"+speciality+"'";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) 
			{
				
				Doctorsbean d1 = new Doctorsbean();
				d1.setSpeciality(rs.getString("Speciality"));
				d1.setLocation(rs.getString("Location"));
				d1.setName(rs.getString("Dr_Name"));
				
				d1.setContact_no(rs.getString("ContactNo"));
				d1.setEmail(rs.getString("Email"));
				d1.setAddress(rs.getString("Address"));
				d.add(d1);
				
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return d;
	}
	
	public ArrayList<Doctorsbean> automatic(String drname) 
	{
		ArrayList<Doctorsbean> d2 = new ArrayList<Doctorsbean>();
		
		System.out.println(drname);
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select Speciality from doctors where Dr_Name=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, drname);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) 
			{
				Doctorsbean d3 = new Doctorsbean();
				d3.setSpeciality(rs.getString("Speciality"));
				d2.add(d3);
				
			}
			
			else
			{
				System.out.println("No match found..");
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return d2;
	}
	public ArrayList<Doctorsbean> area() 
	{
		ArrayList<Doctorsbean> s = new ArrayList<Doctorsbean>();
		
		
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select Location from doctors";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) 
			{
				Doctorsbean d = new Doctorsbean();
				d.setLocation(rs.getString("Location"));
				s.add(d);
				
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return s;
	}
	public ArrayList<Doctorsbean> areavicedr(String areavise1) 
	{
		ArrayList<Doctorsbean> d = new ArrayList<Doctorsbean>();
		
		System.out.println(areavise1);
		
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select * from doctors where Location=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, areavise1);
			
			
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) 
			{
				
				Doctorsbean d1 = new Doctorsbean();
				d1.setSpeciality(rs.getString("Speciality"));
				d1.setLocation(rs.getString("Location"));
				d1.setName(rs.getString("Dr_Name"));
				System.out.println("raj");
				d1.setContact_no(rs.getString("ContactNo"));
				d1.setEmail(rs.getString("Email"));
				d1.setAddress(rs.getString("Address"));
				d.add(d1);
				
			}
			
			else
			{
				System.out.println("No match found..");
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return d;
	}
	public ArrayList<Doctorsbean> getdoctorbyname(String str)
	{
		ArrayList<Doctorsbean> m = new ArrayList<Doctorsbean>();
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "SELECT * FROM doctors WHERE Dr_Name LIKE '%"+str+"%'";
			System.out.println("Query :- "+sql);
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println("Got The Record In Model Class");
				Doctorsbean s = new Doctorsbean();
				s.setSpeciality(rs.getString("Speciality"));
				s.setLocation(rs.getString("Location"));
				s.setName(rs.getString("Dr_Name"));
				s.setContact_no(rs.getString("ContactNo"));
				s.setEmail(rs.getString("Email"));
				s.setAddress(rs.getString("Address"));
				m.add(s);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return m;
		
	}
	public static String getDoctorEmail(String drname) {
		// TODO Auto-generated method stub
		String drn="";
		try
		{
			
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql="select Email from doctors where Dr_Name=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, drname);
			
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				drn=rs.getString("Email");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return drn;
	}
	
	
	public void adddoctor(Doctorsbean drb) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			
			String sql = "insert into doctors(Speciality,Location,Dr_Name,ContactNo,Email,Address,Image) values(?,?,?,?,?,?,?)";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, drb.getSpeciality());
			pst.setString(2, drb.getLocation());
			pst.setString(3, drb.getName());
			pst.setString(4, drb.getContact_no());
			pst.setString(5, drb.getEmail());
			pst.setString(6, drb.getAddress());
			pst.setString(7, drb.getImage());
			
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Doctor Added..!!");
			}
			else
			{
				System.out.println("Doctor Rejected..!!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public Doctorsbean admindr(int id) {
		Doctorsbean drb1 = new Doctorsbean();
		
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "select * from doctors where id=?";
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				drb1.setId(rs.getInt("id"));
				drb1.setName(rs.getString("Dr_Name"));
				drb1.setEmail(rs.getString("Email"));
				drb1.setSpeciality(rs.getString("Speciality"));
				drb1.setContact_no(rs.getString("ContactNo"));
				drb1.setLocation(rs.getString("Location"));
				drb1.setAddress(rs.getString("Address"));
				drb1.setImage(rs.getString("Image"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return drb1;
	}
	
	public void deletedr(int id)
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "delete from doctors where id=?";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			

			pst.setInt(1, id);
			
			int i = pst.executeUpdate();
			System.out.println(i);
			if(i>0)
			{
				System.out.println("Doctor delete..!!");
			}
			else
			{
				System.out.println("Doctor Not delete..!!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	
	
	
	public void updatedr(Doctorsbean drb) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "update doctors set Dr_Name=?, Email=?, Speciality=?, ContactNo=?, Location=?, Address=? where id=?";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			
			
			pst.setString(1, drb.getName());
			pst.setString(2, drb.getEmail());
			pst.setString(3, drb.getSpeciality());
			pst.setString(4, drb.getContact_no());
			pst.setString(5, drb.getLocation());
			pst.setString(6, drb.getAddress());
//			pst.setString(7, drb.getImage());
			pst.setInt(7, drb.getId());
			
			int i=pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Doctor Updated..!!");
			}
			else
			{
				System.out.println("Doctor Not Updated..!!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int savedrimg(Doctorsbean drb) 
	{
		int rs=0;
		
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			final String sql = "update doctors set Image=? where id=?";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, drb.getImage());
			pst.setInt(2, drb.getId());
			rs=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rs;
	}

}
