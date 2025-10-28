package com.airline.concurrency;

import com.airline.model.Flight;
import com.airline.model.Passenger;
import com.airline.model.Ticket;
import com.airline.service.BookingService;

public class BookingTask implements Runnable{
	private Passenger passenger;
	private Flight flight;
	private BookingService bookingService;
	
	public BookingTask(Passenger passenger,Flight flight,BookingService bookingService) {
		this.passenger = passenger;
		this.flight = flight;
		this.bookingService = bookingService;
	}
	
	@Override
	public void run() {
		Ticket ticket = bookingService.bookTicket(passenger, flight);
		if(ticket == null) {
			System.out.println("Sorry " + passenger.getName() + ", we could not book your ticket");
			System.out.println(flight);
		}
		else {
			System.out.println(passenger.getName() + " have successfully booked the ticket with id:" + ticket.getTicketId());
		}
	}

}
