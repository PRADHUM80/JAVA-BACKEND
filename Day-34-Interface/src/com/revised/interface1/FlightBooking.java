package com.revised.interface1;

public class FlightBooking implements IDiscount
{
	/**
	 * here forcly creating a Body..
	 * all method Write Here otherwise Error..
	 * concrete Methods...
	 * 
	 * here Extends Class flight Objects.
	 */
	@Override
	public int calculateDiscount(int amount, int rate)
	{
		int finalFare = amount - (amount * rate) / 100;
		return finalFare;
	}

	@Override
	public int calculateDiscountTax(int tax) 
	{
		
		System.out.println("FlightBooking.calculateDiscountTax()");
		return tax;
	}
}
