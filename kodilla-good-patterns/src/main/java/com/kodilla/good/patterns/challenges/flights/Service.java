package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public void findDepartures(String city, Connections connections) {
        System.out.println(connections.createFlightsList().stream()
                .filter(s -> s.getDeparture().equals(city))
                .collect(Collectors.toList()));
    }

    public void findArrivals(String city, Connections connections) {
        System.out.println(connections.createFlightsList().stream()
                .filter(s -> s.getArrival().equals(city))
                .collect(Collectors.toList()));
    }

    public void findConnections(String departureCity, String arrivalCity, String transferCity, Connections connections) {
        List<Flights> arrival = connections.createFlightsList().stream()
                .filter(s -> s.getArrival().equals(arrivalCity))
                .collect(Collectors.toList());
        List<Flights> departure = connections.createFlightsList().stream()
                .filter(s -> s.getDeparture().equals(departureCity))
                .collect(Collectors.toList());
        List<Flights> newList = new ArrayList<>();
        newList.addAll(arrival);
        newList.addAll(departure);
        newList.stream()
                .filter(s -> s.getArrival().equals(transferCity))
                .forEach(System.out::print);
        System.out.print(" > ");
        newList.stream()
                .filter(s -> s.getDeparture().equals(transferCity))
                .forEach(System.out::println);
    }
}