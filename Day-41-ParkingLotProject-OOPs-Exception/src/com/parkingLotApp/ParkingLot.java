package com.parkingLotApp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ParkingLot 
{
	private final List<ParkingSpot> spots = new ArrayList<>();
    private final Map<Integer, ParkingTicket> activeTickets = new HashMap<>();
    private int nextTicketId = 1;

    public ParkingLot(int capacity) 
    {
        if (capacity <= 0) 
        {
            throw new IllegalArgumentException("Capacity must be positive.");
        }

        for (int index = 0; index < capacity; index++)
        {
            spots.add(new ParkingSpot(index + 1));
        }
    }

    public ParkingTicket park(Vehicle vehicle, LocalDateTime entryTime)
    {
        Objects.requireNonNull(vehicle, "Vehicle is required.");
        Objects.requireNonNull(entryTime, "Entry time is required.");

        for (ParkingSpot spot : spots) {
            if (spot.containsVehicle(vehicle.getRegistrationNumber())) {
                throw new IllegalStateException("This vehicle is already parked.");
            }
        }

        for (ParkingSpot spot : spots) {
            if (spot.isAvailable()) {
                ParkingTicket ticket = new ParkingTicket(
                        nextTicketId++, spot.getNumber(), entryTime);

                spot.park(vehicle);
                activeTickets.put(ticket.getId(), ticket);
                return ticket;
            }
        }

        throw new IllegalStateException("Parking lot is full.");
    }

    public int exit(int ticketId, LocalDateTime exitTime) {
        Objects.requireNonNull(exitTime, "Exit time is required.");
        ParkingTicket ticket = activeTickets.get(ticketId);

        if (ticket == null) {
            throw new IllegalArgumentException("Ticket is invalid or already used.");
        }

        if (exitTime.isBefore(ticket.getEntryTime())) {
            throw new IllegalArgumentException("Exit time cannot be before entry time.");
        }

        Duration duration = Duration.between(ticket.getEntryTime(), exitTime);
        long hours = duration.toHours();

        if (duration.compareTo(Duration.ofHours(hours)) > 0) {
            hours++;
        }

        int billableHours = Math.toIntExact(Math.max(1, hours));

        // Spot numbers start at 1. List indexes start at 0.
        ParkingSpot spot = spots.get(ticket.getSpotNumber() - 1);
        int fee = spot.calculateFee(billableHours);

        spot.vacate();
        activeTickets.remove(ticketId);

        return fee;
    }
}
