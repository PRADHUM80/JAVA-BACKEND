package com.parkingLotApp;
// #1.


/**  
 * in this project wht ill do?
 * Vehicle stores the registration number shared by cars and bikes. 
 * The abstract method says that every vehicle type must provide its own fee calculation.
 */
public abstract class Vehicle 
{
//	private	:-  Only Vehicle can access the field directly. Other classes can read it using getRegistrationNumber(). This is encapsulation.
//	final :- 	Once the constructor assigns the number, the field cannot be reassigned.
	private final String registrationNumber;
	
	
//	Setters
	protected Vehicle(String registrationNumber)
	{
		if (registrationNumber == null || registrationNumber.trim().isEmpty())
		  {
	          throw new IllegalArgumentException("Registration number is required.");
	      }
	        	  
		this.registrationNumber = registrationNumber.trim();        
	}
//	getters 
	public String getRegistrationNumber() 
	{
        return registrationNumber;
    }

//	here Using Abstract Keyword --> bcz Abstract has no body..
    public abstract int calculateParkingFee(int hours);
}
