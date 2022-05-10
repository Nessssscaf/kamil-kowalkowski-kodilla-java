package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    Map<String, Boolean> airports = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())) {
            if (airports.getOrDefault(flight.getArrivalAirport(), true) && airports.getOrDefault(flight.getDepartureAirport(), true)) {
                System.out.println("Flight is available");
            } else {
                System.out.println("Flight is not available");
            }
        } else {
                throw new RouteNotFoundException();
        }
    }
}
