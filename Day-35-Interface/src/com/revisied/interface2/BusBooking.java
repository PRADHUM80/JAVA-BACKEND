package com.revisied.interface2;

public class BusBooking implements IBooking
{

	@Override
	public Booking book() {
		System.out.println("BusBooking.book()..");
		Booking booking =  new Booking();
		booking.setBookingId("678965433");
		booking.setStatus("confirmed");
		booking.setPassengerName("Pradhum Kumar");
		booking.setSource("SMVB");
		booking.setDestination("BBS");
		booking.setBookingDate("10/01/26");
		booking.setDateofJourney("01/12/26");
		booking.setTicketPrice(1765.90);
		booking.setSeatNumber("B2 46");
		return booking;
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

}
