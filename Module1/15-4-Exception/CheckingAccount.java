package com.a154;

public class CheckingAccount 
{
	private int acn;
	private double balance;
	
	public CheckingAccount(int acn){
		this.acn=acn;
	} 
	
	public void deposite(double amount) 
	{
		this.balance=amount;
	}
	
	public void withdral(double amount) throws InsufficintFundException {
		if(amount<=balance) 
		{
			balance = balance - amount;
		}
		else 
		{
			double needs = amount-balance;
			throw new InsufficintFundException(needs);
		}
	}
	public double getBalance() 
	{
		return balance;
	}
}
