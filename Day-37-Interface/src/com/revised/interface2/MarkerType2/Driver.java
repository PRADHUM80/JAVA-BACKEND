package com.revised.interface2.MarkerType2;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Account acc = new Account("Pradhum ", " BTM ", " SBI00988765456789");
		
		Account cloneObjectAccount = (Account) acc.clone(); // Trying To Cone/Xerox/Copy..
		
		System.out.println(cloneObjectAccount.accNo);
		

		if(acc instanceof Cloneable)
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println(" False");
		}
	}

}
