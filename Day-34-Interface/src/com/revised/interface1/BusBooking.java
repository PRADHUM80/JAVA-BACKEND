package com.revised.interface1;

public class BusBooking  implements IDiscount
{

	@Override
	public int calculateDiscount(int amount, int rate) 
	{
		int finalFare = amount - (amount * rate) /100;
		return finalFare;
	}

	@Override
	public int calculateDiscountTax(int tax) 
	{
		System.out.println("BusBooking.CalculateDiscountTax()");
		return tax;
		
	}

}
