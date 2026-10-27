package Src.Encapsulation1;

public class Account 
{
    
    	/** 				Encapsulation
	 * 1. Encapsulation is hiding the Data / or Binding a Data Into a Single Unit.
	 * 2. how to Hide The Data --> using private Access Modifiers..
	 * 3. why Hide the Data --> Because  its cannot be change in another Class..
	 * 4. Security. 
	 *		Data Protection..
	 *		Control Access..
	 * 5. we can modify the Data Using Setter Methods u can Modify The data..
	 * 6. get Data Using Getter / get Or Read The Data.
	 * 7. Without Setter Methods Data can be Achieve..
	 * 8. real life Example :--> 
	 * 	your BANK BAlance is Protected..
	 * you cannot be directly Change the Balance..
	 * you can Deposit OR Withdraw money Through Authorized MEthods..
	 * 
	 * the MEthods Validates the Transaction Before Updating the BAlance...
	 */

    
     public  String nameAcc; // Not Well Encapsulation. --> change anyone the data..
     private  int balance; // Well Encapsulation  Cannot be changed..

    public Account(String nameAcc, int balance) 
    {
        super();
        this.nameAcc = nameAcc;
        this.balance = balance;
    }

    //	setters..
	public void credit(int amount)
	{
		balance = balance + amount;
		System.out.println("Transaction Sucessful");
	}
	
//	Getters..
	public int getBalance()
	{
		return balance;
	}


}
