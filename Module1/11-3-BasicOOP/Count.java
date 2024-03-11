package com.a113;


public class Count 
{
	static int count = 0;
	
	//if static is there it will use same memory allocation everytime
	//if static is not there it will assign new memory allocation everytime
	
	
	Count()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		
		Count t1 = new Count();
		Count t2 = new Count();
		Count t3 = new Count();
		
	}
	
}
