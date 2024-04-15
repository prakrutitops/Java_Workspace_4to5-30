package com.a154;

enum Student 
{
	John(11), Bella(10), Sam(18), Viraaj(20);
	
	private int age;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	private Student(int age) 
	{
		this.age=age;
		
	}
}

public class Ex1
{
	public static void main(String[] args) 
	{
		System.out.println("Age of Viraaj Sis " +Student.Viraaj.getAge()+ " years");
	}
}