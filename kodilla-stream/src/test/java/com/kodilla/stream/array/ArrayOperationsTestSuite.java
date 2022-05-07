package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];

        //When
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 2;
        numbers[3] = 1;
        numbers[4] = 4;
        numbers[5] = 6;
        numbers[6] = 5;
        numbers[7] = 4;
        numbers[8] = 6;
        numbers[9] = 3;
        numbers[10] = 2;
        numbers[11] = 2;
        numbers[12] = 1;
        numbers[13] = 6;
        numbers[14] = 5;
        numbers[15] = 4;
        numbers[16] = 6;
        numbers[17] = 3;
        numbers[18] = 3;
        numbers[19] = 5;
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(3.85, average);
    }
}