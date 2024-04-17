package com.a174;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx4 
{
	public static void main(String[] args)
	{
		
		ArrayList arraylist = new ArrayList<>();
		
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Python");
		arraylist.add(".net");
		
		
		
		arraylist.add(2,"Xyz");
		arraylist.remove(3);
		
		System.out.println(arraylist);
	}
}
