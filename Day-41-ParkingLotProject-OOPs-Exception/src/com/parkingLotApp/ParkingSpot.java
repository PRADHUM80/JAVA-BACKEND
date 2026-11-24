package com.parkingLotApp;
// # 3. 
public class ParkingSpot 
{
	private final int number;
    private Vehicle vehicle;
    
//    const
    ParkingSpot(int number) 
    {
        this.number = number;
    }
    
//    getters
    int getNumber()
    {
    		return number;
    }
    
    
    boolean isAvailable() 
    {
        return vehicle == null;
    }
    
    boolean containsVehicle(String registrationNumber)
    {
    	 return vehicle != null
                 && vehicle.getRegistrationNumber().equalsIgnoreCase(registrationNumber);
    }
    
    void park(Vehicle vehicle) 
    {
        this.vehicle = vehicle;
    }

    int calculateFee(int hours)
    {
        return vehicle.calculateParkingFee(hours);
    }

    void vacate() 
    {
        vehicle = null;
    }

}
