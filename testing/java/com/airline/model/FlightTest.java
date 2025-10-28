package com.airline.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FlightTest {

    @Test
    void testFlightCreation_ShouldSetAvailableSeatsEqualToTotalSeats() {
        
        int totalSeats = 150;
        Flight testFlight = new Flight("TEST101", "JFK", "LAX", totalSeats);
        
        int actualAvailableSeats = testFlight.getAvailableSeats();
        int expectedAvailableSeats = 150;
        assertEquals(expectedAvailableSeats, actualAvailableSeats);
    }
    
    @Test
    void testBookSeat_WhenSeatsAreAvailable_ShouldReturnTrueAndDecrementAvailableSeats() {
        Flight testFlight = new Flight("TEST101", "JFK", "LAX", 5);
        boolean bookingResult = testFlight.bookSeat();

        assertTrue(bookingResult);
        assertEquals(4, testFlight.getAvailableSeats());
    }
    
    @Test
    void testBookSeat_WhenNoSeatsAreAvailable_ShouldReturnFalse() {
        Flight testFlight = new Flight("TEST101", "JFK", "LAX", 0);
        boolean bookingResult = testFlight.bookSeat();
        assertFalse(bookingResult);
        assertEquals(0, testFlight.getAvailableSeats());
    }
    
}