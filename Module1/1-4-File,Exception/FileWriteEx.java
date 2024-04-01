package com.a14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteEx 
{
	public static void main(String[] args) 
	{
		try 
		{
			String s ="Welcome to tops";
			FileOutputStream fout = new FileOutputStream("H://acer.txt");
			fout.write(s.getBytes());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		finally
		{
			System.out.println("executed");
		}
	}
}
