package com.airline.model;

public class Ticket {
	private Passenger passenger;
	private Flight flight;
	private String ticketId;

	public Ticket(Passenger p1, Flight f1) {
		this.passenger = p1;
		this.flight = f1;
		this.ticketId = flight.getFlightNumber() + "-" + passenger.getName();
	}
	@Override
	public String toString() {
		String ticketDetails = "******************************************\n";
		ticketDetails += "*      AIRLINE BOOKING CONFIRMATION      *\n";
		ticketDetails += "******************************************\n";
		ticketDetails += "Ticket ID: " + this.ticketId + "\n";
		ticketDetails += "Passenger: " + this.passenger.getName() + "\n"; 
		ticketDetails += "Email: " + this.passenger.getEmailId() + "\n\n";    
		ticketDetails += "Flight Details:\n";
		ticketDetails += "  Flight Number: " + this.flight.getFlightNumber() + "\n"; 
		ticketDetails += "  Route: " + this.flight.getOrigin() + " to " + this.flight.getDestination() + "\n"; 
		ticketDetails += "******************************************\n";

		return ticketDetails;
	}
	
	public String getTicketId() {
	    return this.ticketId;
	}
}

