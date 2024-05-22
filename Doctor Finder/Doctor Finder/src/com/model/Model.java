package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.DBconnection.DBconnection;
import com.bin.Feedbackbean;

public class Model {

	public String getSP(String val) throws Exception
	{
		String result="";
		ResultSet rs=null;
		Statement st=null;
		
		DBconnection db=new DBconnection();
		Connection conn=db.getconnection();
		
		String sql="select * from doctors where Dr_Name='"+val+"'";
		st=conn.createStatement();
		rs=st.executeQuery(sql);
		
		if(rs.next())
		{
			result=rs.getString("Speciality");
		}
		else
		{
			result="Lukhesh";
		}
		return result;
	}
	public void addfeedback(Feedbackbean fdb) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			
			String sql = "insert into feedback(f_drname,f_drspeciality,f_message,f_username) values(?,?,?,?) ";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, fdb.getFdrname());
			pst.setString(2, fdb.getFdrspeciality());
			pst.setString(3, fdb.getFmsg());
			pst.setString(4, fdb.getFuser());
			
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Feedback Submitted");
			}
			else
			{
				System.out.println("Feedback Not Submitted");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public ArrayList<Feedbackbean> showfeedback()
	{
		ArrayList<Feedbackbean> b = new ArrayList<Feedbackbean>();
		
		try
		{
			DBconnection db = new DBconnection();
			Connection conn = db.getconnection();
			
			String sql = "select * from feedback";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				Feedbackbean fdb = new Feedbackbean();
				fdb.setFid(rs.getInt("f_id"));
				fdb.setFdrname(rs.getString("f_drname"));
				fdb.setFdrspeciality(rs.getString("f_drspeciality"));
				fdb.setFuser(rs.getString("f_username"));
				fdb.setFmsg(rs.getString("f_message"));
				b.add(fdb);
			}
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return b;
	}
	public void deletefeedback(int id) 
	{
		try
		{
			DBconnection db = new DBconnection();
			Connection cnn = db.getconnection();
			
			String sql = "delete from feedback where f_id=?";
			
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setInt(1, id);
			int i = pst.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Feedback deleted");
			}
			else
			{
				System.out.println("Feedback not deleted");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
