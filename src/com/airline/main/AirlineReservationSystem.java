package com.airline.main;
import java.util.*;
import com.airline.concurrency.BookingTask;

import com.airline.model.Flight;
import com.airline.model.Passenger;
import com.airline.service.BookingService;

public class AirlineReservationSystem {

	public static void main(String[] args) {
		System.out.println("--- Welcome to the Airline Reservation System ---");
		
		Flight flight1 = new Flight("UF267","New York","Los Angeles", 256);
		Flight flight2 = new Flight("FDR561", "Paris", "Atens",1);
		
		Passenger passenger1 = new Passenger("Pragathi K","pragathi@gmail.com");
		Passenger passenger2 = new Passenger("Pavani K","pavanii@gmail.com");
		
		BookingService bs = new BookingService();
		
		System.out.println("\nInitial Flight Status:");
        System.out.println(flight1); 
        System.out.println(flight2);
        System.out.println("-------------------------------------------------");
        
		System.out.println(bs.bookTicket(passenger2, flight2));
		System.out.println(bs.bookTicket(passenger1, flight2));
		
		System.out.println("\nFinal Flight Status:");
        System.out.println(flight1);
        System.out.println(flight2);
        //runConcurrencyTest();
	}
	
	/*public static void runConcurrencyTest() {
		Flight f3 = new Flight("BFVS3","DCH","DHBSN",2);
		BookingService bs2 = new BookingService();
		List<Thread> threads = new ArrayList<>();
		

		for(int i = 0; i < 10; i++) {
			for (int j = 1; j <= 1; j++) {
	            Passenger passenger = new Passenger("Passenger " + i, "p" + i + "@email.com");
	            BookingTask task = new BookingTask(passenger, f3,bs2);
	            Thread thread = new Thread(task);
	            threads.add(thread);
	        }
		}
		
		for (Thread t : threads) {
            t.start(); 
        }
		
        try {
            for (Thread t : threads) {
                t.join(); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}*/
}
