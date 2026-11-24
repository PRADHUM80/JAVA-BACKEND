package com.revisied.interface2;

public interface IBooking 
{
//	What to Do..?
//	2010..
	public abstract Booking book(); // Class Booking ..
	
	public abstract void cancleBooking();
	
	public abstract Booking checkStatus();
	
	SearchResult search(); // Claa SearchResult..
	
//	2020
//	public void autoUpgrade(); 
	/**
	 * Java V1.7 --> 
	 * when we add new Method Then Broke My entierSystem..
	 * like TrainBooking Add This Feature Not Using Bus & Flight ...
	 * so , Forcley Implemented ALl Class..
	 * 
	 * 
	 * 
	 * 2020..
	 * using Java V8...
	 * 1. Default --> is Keyword, it is Optional.., this is MEthod Body...
	 * 
	 */
	
//	Optional..
	public default void autoUpgrade()
	{
		System.out.println("IBooking . autoUpgrade()..");
	}
	
//	Static Methods...
	public static void printTicket(String path , String contents)
	{
//		200 Line Code...
		System.out.println("Printing Tikcets ... Static MEthods...");
	}
	
	
}
