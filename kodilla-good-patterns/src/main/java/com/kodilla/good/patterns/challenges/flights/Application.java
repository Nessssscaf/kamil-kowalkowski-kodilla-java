package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        Service service = new Service();
        Connections connections = new Connections();

        service.findDepartures("Warszawa", connections.createFlightsList());
        service.findArrivals("Kraków", connections.createFlightsList());
        service.findConnections("Warszawa", "Kraków", "Katowice", connections.createFlightsList());
    }
}