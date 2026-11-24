package com.revised.interface1;

public class Drive {

	public static void main(String[] args) 
	{
//		can't create object of Interface ..
//		so using Object of Child Class..
		
		IDiscount discount = new FlightBooking();
		int res = discount.calculateDiscount(5000, 1000);
		System.out.println(res);
		
		int tax = discount.calculateDiscountTax(500);
		System.out.println(tax);
		
		
//		Bus
		IDiscount discount2 = new BusBooking();
		int res1 = discount.calculateDiscount(10000, 500);
		System.out.println(res1);
		
		int tax1 = discount2.calculateDiscountTax(tax);
		System.out.println(tax1);

	}

}
