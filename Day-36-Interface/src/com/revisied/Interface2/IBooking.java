package com.revisied.Interface2;

// ---> 2010
public interface IBooking 
{
//	What to do ....?
	public abstract Booking bbok();
	public abstract void cancleBooking();
	public abstract Booking checkStatus();
	
	SearchResult search();
	
//	Optional --> 2020
	public default void autoUpgrade() // default KeyWord is MethodBody...
	{
//		To Some Of The Classes.
//		%500 Lines (CheckingStatus, Connecting With DataBase(25 Lines). Upgrading)
		connecttoDB();
		System.out.println("Booking.autoUpgrade()....");
	}
	
//	Optional --> 2020
	public default void sendNotification() // To Same...
	{
		connecttoDB(); // 200 Line Connecting DB (25 Line) get User details & Sending Notificaton..
		System.out.println("Booking.sendNotificaton...");
	}
	
	private static void connecttoDB() 
	{
		System.out.println("IBooking.connecttoDB()");
	}

	// common or utility method

	public static void printTicket(String path, String contents) 
	{
		connecttoDB();
		// 200 lines --> printing the ticket
		System.out.println(" Prinitng ticket.. static method...");
	}
	Booking book();
	void cancelBooking();
}
