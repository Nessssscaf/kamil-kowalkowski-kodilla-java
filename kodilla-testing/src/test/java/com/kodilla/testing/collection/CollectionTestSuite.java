package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test Case: " + testCounter + " begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("Test checks if the class is working properly when list is empty.")
    @Test

    void testOddNumbersExterminatorEmptyList() {

        //Given

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When

        List<Integer> numbers = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //Then

        Assertions.assertEquals(emptyList, result);
    }
    @DisplayName("Test checks if the class is working properly when list contains even and odd numbers.")
    @Test

    void testOddNumbersExterminatorNormalList() {

        //Given

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When

        List<Integer> numbers = new ArrayList<>();
        for (int n=0; n < 10; n++) {
            numbers.add(n);}
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        Integer a[] = new Integer[]{0, 2, 4, 6, 8};
        List<Integer> oddList = Arrays.asList(a);

        //Then

        Assertions.assertEquals(oddList, result);
    }
}
