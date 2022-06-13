package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLog() {
        logger = Logger.INSTANCE;
        logger.log("My log");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String myLog = logger.getLastLog();
        System.out.println("Logger: " + myLog);
        //Then
        assertEquals("My log", myLog);
    }
}