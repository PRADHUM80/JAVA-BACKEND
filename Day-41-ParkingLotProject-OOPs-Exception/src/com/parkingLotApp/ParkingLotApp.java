package com.parkingLotApp;

import java.time.LocalDateTime;

public class ParkingLotApp {

	public static void main(String[] args) 
	{
		 ParkingLot parkingLot = new ParkingLot(2);

	        LocalDateTime entryTime = LocalDateTime.of(2026, 11, 19, 10, 0);
	        LocalDateTime exitTime = entryTime.plusHours(1).plusMinutes(30);

	        Vehicle car = new Car("BR-03-1001");
	        Vehicle bike = new Bike("BR-03-2002");

	        ParkingTicket carTicket = parkingLot.park(car, entryTime);
	        ParkingTicket bikeTicket = parkingLot.park(bike, entryTime);

	        System.out.println("Car parked in spot " + carTicket.getSpotNumber());
	        System.out.println("Bike parked in spot " + bikeTicket.getSpotNumber());

	        int carFee = parkingLot.exit(carTicket.getId(), exitTime);
	        int bikeFee = parkingLot.exit(bikeTicket.getId(), exitTime);

	        System.out.println("Car fee: Rs. " + carFee);
	        System.out.println("Bike fee: Rs. " + bikeFee);

	        ParkingTicket nextTicket = parkingLot.park(
	                new Car("BR-03-3003"), exitTime);

	        System.out.println("Next car parked in spot " + nextTicket.getSpotNumber());
	    }
	}

}
