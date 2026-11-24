package com.revised.exception.throwss1;

public class MobileRecharge 
{
	public void recharge(int amount)
	{
		if(amount <= 0)
		{
			throw new IllegalArgumentException("Recharge amount should must be greater than 0.");
		}
		else
		{
			System.out.println("Recharge Succesfully!! " + amount);
		}
	}
}
 