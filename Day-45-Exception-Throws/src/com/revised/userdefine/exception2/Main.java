package com.revised.userdefine.exception2;

public class Main {

	public static void main(String[] args) throws NotEnoughSeatsException 
	{
		CinemaBooking book = new CinemaBooking();
		
//		try
//		try
//		{
//			book.bookTickets(5);
//		}
//		catch(NotEnoughSeatsException e)
//		{
//			System.out.println("Booking failed.. " + e.getMessage());
//		}
//		
		
//		OR..
		
		book.bookTickets(2); // Throw add in Main Methodss 
		

	}

}
