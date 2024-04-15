package com.a154;

public class BankDemo 
{
	public static void main(String[] args) 
	{
		
		BankDemo d = new BankDemo();
		CheckingAccount ca = new CheckingAccount(101);
		
		ca.deposite(10000);
		
		try 
		{
			ca.withdral(70000);
			System.out.println("Your balance is = "+ca.getBalance());
		} 
		catch (InsufficintFundException e) 
		{
			System.out.println("You have no sufficient balance, You need more  "+e.getAmount());
			System.out.println("Your balance is = "+ca.getBalance());
		}
	}
}
