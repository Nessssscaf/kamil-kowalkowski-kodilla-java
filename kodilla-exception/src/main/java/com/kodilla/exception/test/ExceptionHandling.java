package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(2, 8);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Oh no! Incorrect data: " + e);
        } finally {
            System.out.println("End of second challenge");
        }
    }
}
