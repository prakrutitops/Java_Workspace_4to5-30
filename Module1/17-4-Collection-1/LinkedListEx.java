package com.a174;

import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList<>();
		
		list.add("Java");
		list.add("Php");
		list.add("Python");
		list.add(".net");
		list.addFirst("Flutter");
		list.addLast("React");
		
		System.out.println(list);
	}
}
