package com.a154;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputOutput 
{
	public static void main(String[] args)  {

		System.out.println("Write Your DAta Here = ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("E://tops.txt");
			fos.write(s.getBytes());
			fos.flush();
			fos.close();
		
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	
		//-----------------------------------
		
		try
		{
			FileInputStream fis = new FileInputStream("E://tops.txt");
			int i=0;
			while((i=fis.read())!=-1) 
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
