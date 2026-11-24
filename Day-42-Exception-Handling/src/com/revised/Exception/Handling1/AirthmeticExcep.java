package com.revised.Exception.Handling1;

public class AirthmeticExcep {

	public static void main(String[] args)
	{
	
		double amount = 100.0;
		double part = 0.0;
		double total = amount / part;
		
		System.out.println(total); // Infinity
	
	try
	{
		int amount1 = 100;
		int part1 = 0;
		int total1 = amount1/part1;
		System.out.println(total1); //ArithmeticException: / by zero
	
	}
	catch (ArithmeticException e) 
	{
		System.out.println("amount1 cannot divide by zero..");
		e.printStackTrace(); // Showing --java.lang.ArithmeticException: / by zero
//	    at com.revised.Exception.Handling1.AirthmeticExcep.main(AirthmeticExcep.java:18)
	}
	}

}
