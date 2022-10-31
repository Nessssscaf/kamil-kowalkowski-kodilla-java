package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    void testUpdate(){

        //given
        Student student1 = new Student("Jan");
        Student student2 = new Student("Tadeusz");
        Student student3 = new Student("Wacław");

        Mentor mentor1 = new Mentor("Kaziemirz");
        Mentor mentor2 = new Mentor("Arnold");

        //when
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor2);

        student1.submitHomework("mod.1");
        student1.submitHomework("mod.2");
        student3.submitHomework("mod.5");
        student2.submitHomework("mod.2");

        int kazimierzNotificationCount = mentor1.getCounter();
        int arnoldNotificationCount= mentor2.getCounter();

        //then
        assertEquals(2,kazimierzNotificationCount);
        assertEquals(2,arnoldNotificationCount);
    }
}