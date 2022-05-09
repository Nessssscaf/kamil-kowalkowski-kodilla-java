package com.kodilla.exception.test;

public class FirstChallenge {

    public void divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            double result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Oh no! Cannot be divided by zero! Error:" + e);
        } finally {
            System.out.println("End of challenge");
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        firstChallenge.divide(3, 0);
    }
}