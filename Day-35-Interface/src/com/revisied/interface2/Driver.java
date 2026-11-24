package com.revisied.interface2;

public class Driver {

	public static void main(String[] args) 
	{
		IBooking booking  = new TrainBooking();
		booking.book();
		booking.cancleBooking();
		booking.autoUpgrade();
		
		IBooking booking2 = new BusBooking();
		booking2.book();
		

	}

}
