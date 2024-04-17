package com.a174;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("a","101");
		map.put("b","102");
		map.put("c","101");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
