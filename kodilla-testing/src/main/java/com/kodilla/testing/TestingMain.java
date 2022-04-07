package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // test dodawania
        Calculator addCalculator = new Calculator(10 ,5);

        int actionResult = addCalculator.getA() + addCalculator.getB();

        if (actionResult == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // test odejmowania
        Calculator subtractCalculator = new Calculator(10 ,5);

        int actionResult2 = addCalculator.getA() - addCalculator.getB();

        if (actionResult2 == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}