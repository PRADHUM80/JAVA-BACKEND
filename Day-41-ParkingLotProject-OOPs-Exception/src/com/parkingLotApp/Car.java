package com.parkingLotApp;
//# 2.

public class Car extends Vehicle 
{
	/**
	 * private:- Keeps the field internal to the class.
	 * static:-	The field belongs to the class. All objects of that class share it.
	 * final	:-  Once assigned, the value cannot change.
	 * 
	 * 
	 * Both classes inherit from Vehicle. super(registrationNumber) calls the parent constructor to store the registration number.
	 * 
	 */
	private static final int HOURLY_RATE = 40;
	
	protected Car(String registrationNumber) 
	{
		super(registrationNumber);
	}

	@Override
	public int calculateParkingFee(int hours) 
	{
		return Math.multiplyExact(hours, HOURLY_RATE);
	}	
}

class Bike extends Vehicle
{
	
	private static final int HOURLY_RATE = 20;

	protected Bike(String registrationNumber) 
	{
		super(registrationNumber);	
	}

	@Override
	public int calculateParkingFee(int hours) 
	{
		return Math.multiplyExact(hours, HOURLY_RATE);
	}
	
}
