package com.revisied.Interface.v9;

public interface IBooking 
{
//what to do.?
public abstract Booking book();
public abstract void cancelBooking();
public abstract Booking checkStatus();
SearchResult search();

// optional -- 2020
public default void autoUpgrade() // to some of the classes
{
	   // 500 lines(checking status, connecting with database(25 lines),upgrading )
	   connecttoDB();
	   System.out.println("IBooking.autoUpgrade()..............");
}

// optional -- 2020
public default void sendNotification() // to some of the classes
{
	   // 200 lines (connecting with database(25 lines) ,  get user details and send notification)
	   connecttoDB();
	   System.out.println("IBooking.sendNotification()..............");
}

private static void connecttoDB()
{
	   System.out.println("IBooking.connecttoDB()");
}


// common or utility method

public static void printTicket(String path, String contents )
	{
	  connecttoDB();
		// 200 lines --> printing the ticket
	  System.out.println(" Prinitng ticket.. static method...");
	}
}



