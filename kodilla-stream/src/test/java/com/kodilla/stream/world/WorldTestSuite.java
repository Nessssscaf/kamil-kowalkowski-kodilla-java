package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given

        Continent asia = new Continent();
        asia.addCountry(new Country("Japan", new BigDecimal("84566616")));
        asia.addCountry(new Country("China", new BigDecimal("345646468")));
        asia.addCountry(new Country("India", new BigDecimal("646844646")));

        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("464666616")));
        europe.addCountry(new Country("Germany", new BigDecimal("46463451616")));
        europe.addCountry(new Country("France", new BigDecimal("4643434616")));

        Continent africa = new Continent();
        africa.addCountry(new Country("Kongo", new BigDecimal("4646341616")));
        africa.addCountry(new Country("RPA", new BigDecimal("44534516")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("445616")));

        Continent northAmerica = new Continent();
        northAmerica.addCountry(new Country("United States", new BigDecimal("46451616")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("454453416")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("784474216")));

        //When

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(northAmerica);
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("58625311574");
        assertEquals(expectedPopulation, worldPopulation);
    }
}
