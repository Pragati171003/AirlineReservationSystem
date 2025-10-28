package com.airline.model;

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	private int totalSeats;
	private int availableSeats;
	
	public Flight(String flightNumber,String origin,String destination,int totalSeats){
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.availableSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber= " + flightNumber + ", origin= " + origin + ", destination= " + destination
				+ ", totalSeats= " + totalSeats + ", availableSeats= " + availableSeats + "]";
	}
	
	public boolean bookSeat() {
		if(this.availableSeats > 0) {
			this.availableSeats--;
			return true;
		}
		return false;
	}
	
	public boolean hasAvailableSeats() {
		return this.availableSeats > 0;
	}
	
	public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDestination() {
        return this.destination;
    }
}
