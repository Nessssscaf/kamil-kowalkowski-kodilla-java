package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When

        String taskToDo = "go to the hairdresser";
        String taskInProgress = "growing a beard";
        String taskDone = "shaving the armpits";
        board.getToDoList().addTasks(taskToDo);
        board.getInProgressList().addTasks(taskInProgress);
        board.getDoneList().addTasks(taskDone);

        //Then
        assertEquals("go to the hairdresser", board.getToDoList().getTasks().get(0));
        assertEquals("growing a beard", board.getInProgressList().getTasks().get(0));
        assertEquals("shaving the armpits", board.getDoneList().getTasks().get(0));
    }
}