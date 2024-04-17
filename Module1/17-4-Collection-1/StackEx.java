package com.a174;

import java.util.Stack;

public class StackEx 
{
	
	static void push(Stack st, Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	}
	static void pop(Stack st)
	{
		Integer i = (Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
		
	}
	
	public static void main(String[] args)
	{
		Stack st = new Stack();
		
		push(st, 101);
		push(st, 102);
		push(st, 103);
		push(st, 104);
		
		try
		{
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
		}
		catch(Exception e)
		{
			System.out.println("No Data");
		}
		
	}
	
}
