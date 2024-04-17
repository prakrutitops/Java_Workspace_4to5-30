package com.a174;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 
{
	public static void main(String[] args)
	{
		
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Python");
		arraylist.add(".net");
		arraylist.add("Java");
		arraylist.add("Php");
		//arraylist.add(101);
		
		
		Iterator i = arraylist.iterator();//initialization
		
		while(i.hasNext())//condition
		{
			System.out.println(i.next());
		}
		
		
	}
}
