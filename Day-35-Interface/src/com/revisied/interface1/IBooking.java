package com.revisied.interface1;


// in 2010..
public interface IBooking 
{
//	 what to do ?..
	
	public abstract Booking book();
	
	public abstract void cancleBooking();
	
	public abstract Booking checkStatus();
	
	SearchResult search();
	
	
//	Optional --> 2020
	public default void autoUpgrade() // to Some Of The Classes .. This is Optional..
	{
		System.out.println("IBooking.autoUpgrade()........");
	}
}
