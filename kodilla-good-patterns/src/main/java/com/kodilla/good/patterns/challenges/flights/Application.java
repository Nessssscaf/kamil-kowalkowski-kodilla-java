package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        Service service = new Service();
        service.findDepartures("Warszawa");
        service.findArrivals("Kraków");
        service.findConnections("Warszawa", "Kraków", "Katowice");
    }
}