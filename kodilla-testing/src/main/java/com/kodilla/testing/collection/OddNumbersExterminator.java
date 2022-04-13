package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> numbers = new ArrayList<>();
    List<Integer> evenNumbers = new ArrayList<>();
    public OddNumbersExterminator() {
        this.numbers = numbers;
        this.evenNumbers = evenNumbers;
    }

    public List<Integer> exterminate(List<Integer> numbers) {

        int temporaryValue = 0;
        for (int n=0; n < numbers.size(); n++) {
             temporaryValue = numbers.get(n);
             if (temporaryValue % 2 == 0) {
                 evenNumbers.add(temporaryValue);
             }
        }
        return evenNumbers;
    }
}