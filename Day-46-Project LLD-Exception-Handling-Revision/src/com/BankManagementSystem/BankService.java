package com.BankManagementSystem;

public class BankService 
{
//	throws Error --> Methods..
//	Mutliple Throws..
	
//	throw → Actually throws an exception.
//  throws → Declares that a method may throw an exception.
	public void withdraw(Account account, double amount) throws BankException, InvalidAmountException, InsufficientBalanceException
	{
		if(account == null)
		{
//			throw the Error here throws..
			throw new BankException("Account not Found !!");
		}
		
		if(!account.isActive())
		{
			throw new BankException("Account is Blocked !!");
		}
		
		if(amount <= 0)
		{
			throw new InvalidAmountException("Invailed Amount Withdraw");
		}
		
		if(amount > account.getBalance())
		{
			throw new InsufficientBalanceException("InsufficientBalance !!");
		}
		
		account.deductBalance(amount);
		
		System.out.println("Withdrawal successful!");
        System.out.println("Withdraw Amount: " + amount);
        System.out.println("Remaining Balance: " + account.getBalance());
	}
}
