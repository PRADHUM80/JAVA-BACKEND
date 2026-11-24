package com.BankManagementSystem;

public class InsufficientBalanceException extends Exception
{

	/**
	 * Customer has ₹5,000 but wants to withdraw ₹8,000.
	 */
	private static final long serialVersionUID = 1L;
	
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
	
}
