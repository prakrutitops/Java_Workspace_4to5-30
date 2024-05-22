package com.bin;

public class Appoinmentbean 
{
	private int id;
	private String DrName,DrSpeciality,AppoinmentDate,AppoinmentTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDrName() {
		return DrName;
	}
	public void setDrName(String drName) {
		DrName = drName;
	}
	public String getDrSpeciality() {
		return DrSpeciality;
	}
	public void setDrSpeciality(String drSpeciality) {
		DrSpeciality = drSpeciality;
	}
	public String getAppoinmentDate() {
		return AppoinmentDate;
	}
	public void setAppoinmentDate(String appoinmentDate) {
		AppoinmentDate = appoinmentDate;
	}
	public String getAppoinmentTime() {
		return AppoinmentTime;
	}
	public void setAppoinmentTime(String appoinmentTime) {
		AppoinmentTime = appoinmentTime;
	}
	
}
