package com.BankManagementSystem;

public class BankMain {

	public static void main(String[] args) 
	{
		Account account = new Account("5657583688", "Pradhum Kumar", 8000.00, true);
		
		BankService service = new BankService();
		
		try
		{
			service.withdraw(account, 2500.00);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(InvalidAmountException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(BankException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Bank Transaction Completed !!");
		}

	}

}
