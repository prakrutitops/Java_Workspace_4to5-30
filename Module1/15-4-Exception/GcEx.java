package com.a154;

public class GcEx 
{
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Garbage collection called");
	}
	
	public static void main(String[] args) 
	{
		GcEx g1 = new GcEx();
		GcEx g2 = new GcEx();
		GcEx g3 = new GcEx();
		
		g1 = null;
		g2 = null;
		g3 = null;
		
		System.gc();
	}
}
