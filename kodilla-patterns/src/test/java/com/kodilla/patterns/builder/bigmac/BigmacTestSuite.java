package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(1)
                .roll(RollType.BUN_WITH_SESAME)
                .ingredients(IngredientsType.BACON)
                .ingredients(IngredientsType.MUSHROOMS)
                .ingredients(IngredientsType.SHRIMPS)
                .ingredients(IngredientsType.ONION)
                .ingredients(IngredientsType.CHILLI_PEPPERS)
                .sauce(SauceType.THOUSAND_ISLANDS)
                .build();
        //When
        int numberOfBurgers = bigmac.getBurgers();
        int numberOfIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(1, numberOfBurgers);
        assertEquals(5, numberOfIngredients);
        assertTrue(bigmac.getIngredients().contains(IngredientsType.SHRIMPS));
    }
}