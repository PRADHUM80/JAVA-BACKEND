package com.BankManagementSystem;

//Customer tries to withdraw ₹0 or a negative amount.
public class InvalidAmountException extends Exception
{
	
	public InvalidAmountException(String msg)
	{
		super(msg);
	}
}
