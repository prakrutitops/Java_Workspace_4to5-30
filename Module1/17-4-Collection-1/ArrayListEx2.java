package com.a174;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 
{
	public static void main(String[] args)
	{
		
		ArrayList arraylist = new ArrayList<>();
		
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Python");
		arraylist.add(".net");
		
		ArrayList arraylist2 = new ArrayList<>();
		
		arraylist2.add("Android");
		arraylist2.add("Ios");
		arraylist2.add("Flutter");
		arraylist2.add("ReactNative");
		arraylist2.add("Java");
		//arraylist.a
		//arraylist.addAll(arraylist2);
		//arraylist.remove(1);
		//arraylist.removeAll(arraylist2);
		
		arraylist.retainAll(arraylist2);
		Iterator i = arraylist.iterator();//initialization
		
		while(i.hasNext())//condition
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
