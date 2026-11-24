package com.BankManagementSystem;

public class Account 
{
	private final String accountNumber;
	private String coustomerName;
	private double balance;
	private boolean active;
	
	public Account(String accountNumber, String coustomerName, double balance, boolean active) 
	{
		super();
		this.accountNumber = accountNumber;
		this.coustomerName = coustomerName;
		this.balance = balance;
		this.active = active;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public boolean isActive()
	{
		return active;
	}
	

	public void deductBalance(double amount)
	{
		balance -= amount;
	}
	
}
