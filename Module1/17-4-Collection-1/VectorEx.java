package com.a174;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args)
	{
		Vector v = new Vector<>(5);
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("d");
		v.add("d");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("d");
		v.add("d");
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		System.out.println(v.contains("a"));
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}
}
