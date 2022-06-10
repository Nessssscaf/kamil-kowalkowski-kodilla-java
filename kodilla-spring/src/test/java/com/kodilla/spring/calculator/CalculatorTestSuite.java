package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        calculator.add(2, 2);
        calculator.sub(5, 2);
        calculator.div(30, 3);
        calculator.mul(5, 3);
        //Then
        //do nothing
    }
}