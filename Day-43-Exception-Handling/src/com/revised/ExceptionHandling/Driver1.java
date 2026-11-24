package com.revised.ExceptionHandling;

public class Driver1 {

	public static void main(String[] args) 
	{

		Account1 account = new Account1();
		String accNo = "SBI_23456734567"; //
		String address[] = {"BTM Bangalore", " JP Nagar Bangalore"};
		account.doActivateAcc(accNo, address);

	}

}


class Account1
{
	void doActivateAcc(String accNo, String address[]) {
		System.out.println("Account.doActivateAcc() START");
		validateAccDetails(accNo, address);

		System.out.println("Account.doActivateAcc() END");
	}
	private boolean validateAccDetails(String accNo, String address[])
	{
		System.out.println("Account.validateAccDetails() START");
		
		System.out.println("Validating account details ");
		System.out.println("Checking Account Status...");
		
		int accountType = 1;
		String bankName = "SBI";
		boolean isActive = true;
		
		System.out.println("Account Type : " + accountType);
		System.out.println("Bank Name : " + bankName);
		System.out.println("Account Active : " + isActive);
		
		boolean isValid = false;
		try
		{
			String homeAddress = address[1];
			System.out.println("HomeAddress : " + homeAddress);
			
			isValid = accNo.startsWith("SBI"); // NPE --> RISKy
			int amount = 100/0; // Airthmetic.
			int accNoInt = Integer.parseInt(accNo);
		}
		
		catch (NullPointerException e) // Child
		{
//			This Block Will Catch Any Of The  Exception.. Object.
			
			System.out.println("Value is null");
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e) // Child
		{
			System.out.println("ypu are trying to get ");
			e.printStackTrace();
		}
		
		catch(Exception e) // Parent.
		{
			System.out.println("All Error Accepted..");
			e.printStackTrace();
		}
		
		System.out.println("Account validation completed");
		System.out.println("Account.validateAccDetails() END"); 
		return isValid;
	}
	
	/**
	 * Account.doActivateAcc() START
Account.validateAccDetails() START
Validating account details 
java.lang.ArithmeticException: / by zero
	at com.revised.ExceptionHandling.Account1.validateAccDetails(Driver1.java:48)
	at com.revised.ExceptionHandling.Account1.doActivateAcc(Driver1.java:22)
	at com.revised.ExceptionHandling.Driver1.main(Driver1.java:11)
Checking Account Status...
Account Type : 1
Bank Name : SBI
Account Active : true
HomeAddress :  JP Nagar Bangalore
All Error Accepted..
Account.doActivateAcc() END

	 */
}