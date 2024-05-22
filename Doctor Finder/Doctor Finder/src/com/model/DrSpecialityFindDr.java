package com.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.DBconnection.DBconnection;
import com.bin.DrSpecialityFdbean;
import com.mysql.jdbc.PreparedStatement;

public class DrSpecialityFindDr 
{
	public ArrayList<DrSpecialityFdbean> showspeciality()
	{
		ArrayList<DrSpecialityFdbean> m = new ArrayList<DrSpecialityFdbean>();
		
			try
			{
				DBconnection db = new DBconnection();
				Connection conn = db.getconnection();
				String sql = "select * from doctorspeciality";
				PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				
				while(rs.next())
				{
					DrSpecialityFdbean b1 = new DrSpecialityFdbean();
					b1.setDrSpeciality(rs.getString("DrSpeciality"));
					b1.setAboutSpeciality(rs.getString("AboutSpeciality"));
					m.add(b1);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		return m;
	}
}
