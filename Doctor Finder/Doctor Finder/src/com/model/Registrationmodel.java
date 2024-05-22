package com.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.DBconnection.DBconnection;
import com.bin.Doctorsbean;
import com.bin.Registrationbean;


public class Registrationmodel 
{
	
	public ArrayList<Registrationbean> allusers() 
	{
		ArrayList<Registrationbean> rg1 = new ArrayList<Registrationbean>();
		
		
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			String sql = "select * from user_regi";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) 
			{
				
				Registrationbean rg2 = new Registrationbean();
				
				rg2.setId(rs.getInt("u_id"));
				rg2.setFname(rs.getString("u_fname"));
				rg2.setLname(rs.getString("u_lname"));
				rg2.setEmail(rs.getString("u_email"));
				rg2.setPh_no(rs.getString("u_phno"));
				rg2.setPass(rs.getString("u_pwd"));
				rg2.setGen(rs.getString("u_gen"));
				rg2.setDob(rs.getString("u_date"));
				rg1.add(rg2);
				
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rg1;
	}
	
	public void add_user(Registrationbean b) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "insert into user_regi(u_fname,u_lname,u_email,u_phno,u_pwd,u_cpwd,u_gen,u_date) values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			
			pst.setString(1, b.getFname());
			pst.setString(2, b.getLname());
			pst.setString(3, b.getEmail());
			pst.setString(4, b.getPh_no());
			pst.setString(5, b.getPass());
			pst.setString(6, b.getCpass());
			pst.setString(7, b.getGen());
			pst.setString(8, b.getDob());
			
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Registration complete..!!");
			}
			else
			{
				System.out.println("Registration incomplete..!!");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Good bye Model");
	}

	public Registrationbean checklogin(Registrationbean r) {
		// TODO Auto-generated method stub

		boolean flag=false;
		Registrationbean obj=null;
		try 
		{
			DBconnection db=new DBconnection();
			Connection conn=db.getconnection();
			String sql="select * from user_regi where u_email=? and u_pwd=?";
			
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, r.getEmail());
			pst.setString(2, r.getPass());
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next())
			{
				obj=new Registrationbean();
				obj.setFname(rs.getString("u_fname"));
				obj.setLname(rs.getString("u_lname"));
				obj.setEmail(rs.getString("u_email"));
				obj.setPh_no(rs.getString("u_phno"));
				obj.setPass(rs.getString("u_pwd"));
				obj.setCpass(rs.getString("u_cpwd"));
				obj.setGen(rs.getString("u_gen"));
				obj.setDob(rs.getString("u_date"));
				
			}
			
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return obj;
	
		
	}
	public void updateuser(Registrationbean rb) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			
			String sql = "update user_regi set u_fname=?, u_lname=?, u_email=?, u_phno=?, u_pwd=?, u_cpwd=?, u_date=? where u_id=?";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, rb.getFname());
			pst.setString(2, rb.getLname());
			pst.setString(3, rb.getEmail());
			pst.setString(4, rb.getPh_no());
			pst.setString(5, rb.getPass());
			pst.setString(6, rb.getCpass());
			pst.setString(7, rb.getDob());
			pst.setInt(8, rb.getId());
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Updation Success");
			}
			else
			{
				System.out.println("Updation Failure");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void deleteuser(int id) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "delete from user_regi where u_id=?";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			
			pst.setInt(1, id);
			
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("User Deleted");
			}
			else
			{
				System.out.println("User not deleted");
			}
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
