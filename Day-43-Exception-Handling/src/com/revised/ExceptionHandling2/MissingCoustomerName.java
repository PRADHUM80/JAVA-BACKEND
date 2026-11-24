package com.revised.ExceptionHandling2;

public class MissingCoustomerName {

	public static void main(String[] args) 
	{
//		String customerName = null;
//		if coustomer name is Not Null then...
		String customerName = "Pradhum";
		
		
		try
		{
			System.out.println("Customer Name Length is : " + customerName.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Customer name is Missing...");
			e.printStackTrace();
		}

	}

}
