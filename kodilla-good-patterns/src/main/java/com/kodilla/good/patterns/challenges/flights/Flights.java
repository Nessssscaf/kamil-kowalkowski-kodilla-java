package com.kodilla.good.patterns.challenges.flights;

public class Flights {

    private String departure;
    private String arrival;

    public Flights(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "" + departure +
                " - " + arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flights = (Flights) o;

        if (departure != null ? !departure.equals(flights.departure) : flights.departure != null) return false;
        return arrival != null ? arrival.equals(flights.arrival) : flights.arrival == null;
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        return result;
    }
}
