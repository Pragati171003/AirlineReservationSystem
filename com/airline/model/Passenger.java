package com.airline.model;

public class Passenger {
	private String fullName;
	private String emailId;
	
	public Passenger(String fullName, String emailId){
		this.fullName = fullName;
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Your full name is " + this.fullName +"and your email id is " + emailId;
	}
	
	public String getName() {
		return this.fullName;
	}
	
	public String getEmailId() {
		return this.emailId;
	}
}
