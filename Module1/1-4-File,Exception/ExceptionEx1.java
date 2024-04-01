package com.a14;

public class ExceptionEx1 
{
	public static void main(String[] args) 
	{
		
		try
		{
			int data = 10/5;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("executed");
		}
	}
}
