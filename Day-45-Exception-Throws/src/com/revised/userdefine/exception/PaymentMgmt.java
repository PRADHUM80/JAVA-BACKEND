package com.revised.userdefine.exception;

public class PaymentMgmt 
{
	public void doPayment(String account, int amount)
	{
//		Check the Balance..
		try
		{
			checkBalance(account, amount);
		}
		catch (InsufficentBalanceException e) 
		{
			throw new FundTransferException("You do not have enough balance OR " + "In case you have opend the account recently + pls wait for 24hours doing fundtransfer");
		}
	}
	
	private boolean checkBalance(String account, int amount) throws InsufficentBalanceException
	{
		boolean checkBalanceStatus = false;
		int balance = 1000;
		if(amount > balance )
		{
//			balance is not enough
			throw new InsufficentBalanceException(account + " does not have  enough balance and current balaance is  " + balance);
			
		}
		else
		{
//			allow to trabsfer fund..
			checkBalanceStatus = true;
		}
		return checkBalanceStatus;
	}
}
