package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.airports.put("JFK Airport", false);
        flightSearch.airports.put("Lakeland Linder International Airport", true);
        flightSearch.airports.put("Chicago-Midway Airport", true);

        try {
            flightSearch.findFlight(new Flight("Lakeland Linder International Airport","Chicago-Midway Airport"));
        } catch (RouteNotFoundException e) {
            System.out.println("Wrong airport name!!!");
        }
    }
}
