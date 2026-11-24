package com.revised.ExceptionHandling;

public class Driver {

	public static void main(String[] args) 
	{
		Account account = new Account();
//		String accNo = "23456789";  // normal code Run.
		
		String accNo = null;
		/**
		 * Account.doActivateAcc()  START
		   Exception in thread "main" validateAccDetails()  START
		   java.lang.NullPointerException: Cannot invoke "String.startsWith(String)" because "accNo" is null
			at com.revised.ExceptionHandling.Account.validateAccDetails(Driver.java:29)
			at com.revised.ExceptionHandling.Account.doActivateAcc(Driver.java:21)
			at com.revised.ExceptionHandling.Driver.main(Driver.java:11)

		 */
		account.doActivateAcc(accNo);
	}
}


class Account
{
	void doActivateAcc(String accNo)
	{
		System.out.println("Account.doActivateAcc()  START");
		validateAccDetails(accNo);
		
		System.out.println("Account.doActivateAcc() END");
	}
	
	private boolean validateAccDetails(String accNo)
	{
		System.out.println("validateAccDetails()  START");
		boolean isValid = accNo.startsWith("SBI"); // not Valid..
		System.out.println("validateAccDetails()  END");
		return isValid;
	}
}
