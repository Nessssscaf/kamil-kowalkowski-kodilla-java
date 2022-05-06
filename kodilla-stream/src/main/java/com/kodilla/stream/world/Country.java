package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String country;
    private final BigDecimal quantity;

    public Country(String country, BigDecimal quantity) {
        this.country = country;
        this.quantity = quantity;
    }

    public BigDecimal getPeopleQuantity() {
        return quantity;
    }
}
