package com.a174;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args)
	{
		
		LinkedHashSet set = new LinkedHashSet<>();
		
		set.add("abhay");
		set.add("bhoomik");
		set.add("chandani");
		set.add("eabc");
		set.add("dipak");
		set.add("gaurang");
		set.add("eabc");
		
		Iterator i = set.iterator();//initialization
		
		while(i.hasNext())//condition
		{
			System.out.println(i.next());
		}
		
	}
}
