package com.revised.Exception1;

public class AirthmeticExcep {

	public static void main(String[] args)
	{
	
		double amount = 100.0;
		double part = 0.0;
		double total = amount / part;
		
		System.out.println(total); // Infinity

		int amount1 = 100;
		int part1 = 0;
		int total1 = amount1/part1;
		System.out.println(total1); //ArithmeticException: / by zero
		
	}

}
