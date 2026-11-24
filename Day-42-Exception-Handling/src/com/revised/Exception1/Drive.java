package com.revised.Exception1;

class Account
{
//	Default Constructor...
}


public class Drive {

	public static void main(String[] args) 
	{
		System.out.println("Deive main() ... Start.");
		
		String name = args[0];
		
		int marks =  Integer.parseInt(args[1]);
		
		System.out.println(name); // without putting value in argumnets Showing Error --> ArrayIndexOutOfBoundary..
		
		System.out.println(marks);
		
//		int amount =  100;
//		int part = 0;
//		int total = amount / part;  // Exception in thread "main" java.lang.ArithmeticException
//		System.out.println(total);
		
		/**
		 * if Exception Showing First then cannot Print nextLine..
		 * 1. NullPointer--> 
		 * 2. ArithmeticException --> 
		 * 
		 */
	
		Account acc = null;
		System.out.println(acc.hashCode()); // Print null...
		
		
		System.out.println("Deive main() ... End.");
	}

}
