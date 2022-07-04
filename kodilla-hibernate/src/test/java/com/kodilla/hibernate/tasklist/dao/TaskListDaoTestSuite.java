package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "IN PROGRESS";
    private static final String DESCRITPION = "TASK 1";


    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRITPION);
        taskListDao.save(taskList);

        //When
        List<TaskList> taskListFound = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(LISTNAME, taskListFound.get(0).getListName());

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
}