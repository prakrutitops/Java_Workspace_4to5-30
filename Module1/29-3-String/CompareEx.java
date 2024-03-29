package com.a;

public class CompareEx 
{
	public static void main(String[] args)
	{
		
		String s1 = "sachin";//literal String
		
		String s2 = new String("sachin");//new Keyword String
		
		char ch[]= {'s','a','c','h','i','n'};//character Array String
		String s3 = new String(s2);
		
		String s4 ="sachin";
		String s5 ="ratan";
		
		String s6="SACHIN";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//equals
		System.out.println("----------------");
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s5));
		System.out.println("----------------");
		
		//equalsignorecase
		
		System.out.println(s1.equalsIgnoreCase(s6));
		
		//compareTo
		System.out.println("----------------");
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5));
		System.out.println("----------------");
	
		//==
		System.out.println("----------------");
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println(s1==s5);
		System.out.println("----------------");
		
		String s7=" tops tech  ";
		System.out.println(s7.trim());
		
		String s8="lenovo";
		String s9 ="DELL";
		
		System.out.println(s8.toUpperCase());
		System.out.println(s9.toLowerCase());
		System.out.println(s8.indexOf('e'));
		
		String s10 ="Java is a Programming Language. Java is a Platform";
		
		System.out.println(s10.replace("Java","Advance Java"));
		
	}
}
