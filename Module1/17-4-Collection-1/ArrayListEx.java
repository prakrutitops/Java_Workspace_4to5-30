package com.a174;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		
		ArrayList arraylist = new ArrayList<>();
		
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Python");
		arraylist.add(".net");
		arraylist.add("Java");
		arraylist.add("Php");
		
		
		//System.out.println(arraylist);
		//System.out.println(arraylist.indexOf("Java"));
//		System.out.println(arraylist.get(0));
//		System.out.println(arraylist.get(1));
//		System.out.println(arraylist.get(2));
//		System.out.println(arraylist.get(3));
		
		Iterator i = arraylist.iterator();//initialization
		
		while(i.hasNext())//condition
		{
			System.out.println(i.next());
		}
		
		
	}
}
