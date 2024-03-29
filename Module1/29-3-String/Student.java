package com.a;


abstract class P
{
	void p()
	{
		System.out.println("p called");
	}
	
	abstract void p1();
}
class Q extends P
{
	void q()
	{
		System.out.println("q called");
	}

	@Override
	void p1() 
	{
		// TODO Auto-generated method stub
		System.out.println("p1 called");
	}
}

public class Student 
{
	public static void main(String[] args) {
		
		Q q = new Q();
		
		q.p();
		q.p1();
		q.q();
		
	}
}
