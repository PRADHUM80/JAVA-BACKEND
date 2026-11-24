package com.parkingLotApp;

import java.time.LocalDateTime;

// #4.
/**
 * A ticket records which spot was assigned and when the vehicle entered. Its fields are final, so the values stay fixed after creation.
 * 
 */
public class ParkingTicket 
{
	 private final int id;
	 private final int spotNumber;
	 private final LocalDateTime entryTime;

	    ParkingTicket(int id, int spotNumber, LocalDateTime entryTime) 
	    {
	        this.id = id;
	        this.spotNumber = spotNumber;
	        this.entryTime = entryTime;
	    }
	    
	    public int getId() 
	    {
	        return id;
	    }

	    public int getSpotNumber() 
	    {
	        return spotNumber;
	    }

	    public LocalDateTime getEntryTime() {
	        return entryTime;
	    }

}
