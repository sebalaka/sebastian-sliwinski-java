package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    private final static String DESCRIPTION = "TestList";
    private final static String LIST_NAME = "Test";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListDao.save(taskList);
        //When
        List<TaskList> readListName = taskListDao.findByListName(LIST_NAME);
        int id = taskList.getId();
        //Then
        assertEquals(LIST_NAME, readListName.get(0).getListName());
        assertEquals(1, readListName.size());
        //CleanUp
        taskListDao.deleteById(id);
    }
}
