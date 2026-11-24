package com.revised.finallyblock;

public class Main1 {

	public static void main(String[] args) 
	{
		
		Main1 main = new Main1();
		int res = main.calcDiscount(100, 10);
		System.out.println(res);

	}
	
	private int calcDiscount(int amount ,int disc)
	{
		int finalAmt = 0;
		try
		{
			finalAmt = amount - (amount * disc / 100); // Risky .. ?
			return finalAmt; // Return value is Decide.....
		} 
		
		catch (Exception e) {
			System.out.println("Some Exception");
			e.printStackTrace();
		}
		
		finally
		{
			finalAmt = 110;
			return finalAmt; // Print 110 Bcz inside Return Value OVerride.. So Print 110...
		}
		
//		return finalAmt;  // print 90 Retrun value not inside a finallyBlock ...

	}

}

// Final Block Return --> Is Override.. This Interview Question...
