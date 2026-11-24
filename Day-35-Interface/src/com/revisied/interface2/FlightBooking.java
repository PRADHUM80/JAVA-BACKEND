package com.revisied.interface2;

public class FlightBooking implements IBooking
{

	@Override
	public Booking book() {
		
		return null;
	}

	@Override
	public void cancleBooking() {
	
		
	}

	@Override
	public Booking checkStatus() {
		
		return null;
	}

	@Override
	public SearchResult search() {
		
		return null;
	}

	@Override
	public void autoUpgrade() {
	
//		Empty..
		
	}

	
	void printTicket(String path, String contents)
	{
		IBooking.printTicket(" ", " ");
	}
	
	

	
}
