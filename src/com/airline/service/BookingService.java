package com.airline.service;

import com.airline.model.Flight;
import com.airline.model.Passenger;
import com.airline.model.Ticket;

public class BookingService {
	
	public Ticket bookTicket(Passenger passenger, Flight flight) {
		if(flight.bookSeat()) {
			Ticket ticket = new Ticket(passenger,flight);
			return ticket;
		}
		System.out.print("Booking failed. Flight ");
		System.out.print(flight.getFlightNumber());
		System.out.print(" is full.");
		return null;
	}

}
