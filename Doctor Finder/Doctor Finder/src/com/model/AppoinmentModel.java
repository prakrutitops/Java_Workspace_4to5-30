package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.DBconnection.DBconnection;
import com.bin.Appoinmentbean;
import com.bin.Feedbackbean;

public class AppoinmentModel 
{

	public void addappoinment(Appoinmentbean s) 
	{
		try 
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "insert into appoinment(DrName,DrSpeciality,AppoinmentDate,AppoinmentTime) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getDrName());
			pst.setString(2, s.getDrSpeciality());
			pst.setString(3, s.getAppoinmentDate());
			pst.setString(4, s.getAppoinmentTime());
			int i = pst.executeUpdate();
			if(i>0)
				System.out.println("success");
			else
				System.out.println("fail");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}	
	public Appoinmentbean cancelappoinment()
	{
		Appoinmentbean s =null;
		try 
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select * from appoinment";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				s=new Appoinmentbean();
				s.setId(Integer.parseInt(rs.getString("id")));
				s.setDrName(rs.getString("drname"));
				s.setDrSpeciality(rs.getString("DrSpeciality"));
				s.setAppoinmentDate(rs.getString("AppoinmentDate"));
				s.setAppoinmentTime(rs.getString("AppoinmentTime"));
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return s;
	}
	public int deleteappoinment(Appoinmentbean s) 
	{
		int i = 0;
		try 
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "delete from appoinment where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, s.getId());
			i = pst.executeUpdate();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public ArrayList<Appoinmentbean> showappointment()
	{
		ArrayList<Appoinmentbean> app = new ArrayList<Appoinmentbean>();
		
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "select * from appoinment";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				Appoinmentbean app1 = new Appoinmentbean();
				app1.setId(rs.getInt("id"));
				app1.setDrName(rs.getString("DrName"));
				app1.setDrSpeciality(rs.getString("DrSpeciality"));
				app1.setAppoinmentDate(rs.getString("AppoinmentDate"));
				app1.setAppoinmentTime(rs.getString("AppoinmentTime"));
				app.add(app1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return app;
	}
	
	public void admindelappt(int id) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "delete from appoinment where id=?";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setInt(1, id);
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Admin Side Appt Deleted");
			}
			else
			{
				System.out.println("Admin Side Appt Not Deleted");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
