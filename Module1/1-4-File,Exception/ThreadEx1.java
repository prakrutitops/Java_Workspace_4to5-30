package com.a14;

class A extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A: "+i);
		}
	}
}
class B extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread B: "+i);
		}
	}
}

public class ThreadEx1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		
		a1.start();
		b1.start();
	}
}
