package com.revised.exception.throwss1;

public class Main {

	public static void main(String[] args) 
	{
		MobileRecharge recharge = new MobileRecharge();
		
//		recharge.recharge(0);
		/**
		 * Without Try Block ...
		 * Exception in thread "main" java.lang.IllegalArgumentException: Recharge amount should must be greater than 0.
	at com.revised.exception.throwss1.MobileRecharge.recharge(MobileRecharge.java:9)
	at com.revised.exception.throwss1.Main.main(Main.java:9)

		 */
		
		try
		{
			recharge.recharge(0);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
