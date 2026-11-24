package com.revised.userdefine.exception2;

public class CinemaBooking 
{
	private int avilableSeat = 3;
	
	
	public void bookTickets(int requestedSeats) throws NotEnoughSeatsException
	{
		if(requestedSeats > avilableSeat)
		{
			throw new NotEnoughSeatsException("only " + avilableSeat + " seats are avilable");
		}
		avilableSeat -= requestedSeats;
		
		System.out.println("Tickets Booking SuccessFully..");
	}
}
