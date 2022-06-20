package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        boolean beforeExecution = shopping.isTaskExecuted();
        shopping.executeTask();
        //then
        assertEquals("Shopping", shopping.getTaskName());
        assertFalse(beforeExecution);
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();
        //then
        assertEquals("Painting", painting.getTaskName());
        assertFalse(beforeExecution);
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
        //then
        assertEquals("Driving", driving.getTaskName());
        assertFalse(beforeExecution);
        assertTrue(driving.isTaskExecuted());
    }
}