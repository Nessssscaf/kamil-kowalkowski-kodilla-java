package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class Connections {

    public List<Flights> createFlightsList() {
        List<Flights> flightsList = new ArrayList<>();

        flightsList.add(new Flights("Warszawa", "Kraków"));
        flightsList.add(new Flights("Warszawa", "Wrocław"));
        flightsList.add(new Flights("Kraków", "Gdańsk"));
        flightsList.add(new Flights("Gdańsk", "Wrocław"));
        flightsList.add(new Flights("Gdańsk", "Katowice"));
        flightsList.add(new Flights("Kraków", "Szczecin"));
        flightsList.add(new Flights("Katowice", "Warszawa"));
        flightsList.add(new Flights("Katowice", "Kraków"));
        flightsList.add(new Flights("Warszawa", "Poznań"));
        flightsList.add(new Flights("Radom", "Szczecin"));
        flightsList.add(new Flights("Szczecin", "Warszawa"));
        flightsList.add(new Flights("Radom", "Warszawa"));
        flightsList.add(new Flights("Warszawa", "Katowice"));

        return flightsList;
    }
}
