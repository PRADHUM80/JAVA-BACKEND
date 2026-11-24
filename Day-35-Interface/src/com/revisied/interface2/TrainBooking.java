package com.revisied.interface2;

public class TrainBooking implements IBooking
{

	@Override
	public Booking book() 
	{
		System.out.println("TrainBooking.book()..");
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
	public void cancleBooking() 
	{
		
		System.out.println("If u not Goging Then Cancle Your Tickets..");
	}

	@Override
	public Booking checkStatus() 
	{
		System.out.println("Enter Pnr No &Check Status");
		return checkStatus();
	}

	@Override
	public SearchResult search() {
		
		return null;
	}

	@Override
	public void autoUpgrade() 
	{
		
		System.out.println("THis Is Use Only TrainBooking... autoUpgrade()..");
	}
	
//	Static Methods...
	public static void printTicket(String path , String contents)
	{
//		200 Line Code...
		
		IBooking.printTicket(" ", " ");
	}
	
	
}
