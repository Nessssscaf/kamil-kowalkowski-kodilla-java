package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    void TestBasicPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //when
        BigDecimal cost = pizzaOrder.getCost();
        String pizzaDescription = pizzaOrder.getIngredients();

        //then
        assertEquals(new BigDecimal(45), cost);
        assertEquals("Pizza with cheese, sauce, oregano", pizzaDescription);
    }

    @Test
    void TestPizzaWithSalami(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);

        //when
        BigDecimal cost = pizzaOrder.getCost();
        String pizzaDescription = pizzaOrder.getIngredients();

        //then
        assertEquals(new BigDecimal(50), cost);
        assertEquals("Pizza with cheese, sauce, oregano, bacon", pizzaDescription);
    }

    @Test
    void TestPizzaWithSalamiAndPepperoni(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new PepperoniDecorator(pizzaOrder);

        //when
        BigDecimal cost = pizzaOrder.getCost();
        String pizzaDescription = pizzaOrder.getIngredients();

        //then
        assertEquals(new BigDecimal(55), cost);
        assertEquals("Pizza with cheese, sauce, oregano, bacon, pepperoni", pizzaDescription);
    }
}