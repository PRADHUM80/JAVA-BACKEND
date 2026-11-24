package com.revised.exception.throwss;

public class AccountMgmt
{
	void openAccount(String name, String Address)
	{
		System.out.println("AccountMgmt.openAccount()--> Start");
		
		activateAccount("2345678567");
		
		System.out.println("AccountMgmt.openAccount()--> END");
		
	}
	
	private void activateAccount(String accNo)
	{
		System.out.println("AccountMgmt. activateAccount() --> START");
		try
		{
			checkAccountStatus(null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("AccountMgmt. activateAccount() --> END");
	}
	
	private boolean checkAccountStatus(String accNo) throws Exception // Throws The Exception..
	{
		try
		{
			accNo.startsWith("SBI"); // NPE---> Risky Code..
		}
		catch(NullPointerException e)
		{
//			throw --> create new exception object and throw it to the caller
			throw new Exception("Account number is not starting with SBI");
		}
		return false;
	}
}
