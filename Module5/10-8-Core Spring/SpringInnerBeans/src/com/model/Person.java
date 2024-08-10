package com.model;

public class Person 
{
	
		int id;
		String name;
		
		Address addr;
		
		
		public int getId()
		{
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public Address getAddr() {
			return addr;
		}
		public void setAddr(Address addr) {
			this.addr = addr;
		}
		
		public void display()
		{
			System.out.println(name+" lives in "+addr.getAddr());
		}
			
		
	
}
