package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        TaskList getToDoList = board.getToDolist();
        getToDoList.addTask("Learn programming 4 hours a day");
        TaskList getinProgressList = board.getInProgressList();
        getinProgressList.addTask("Learn programming 20 minutes already");
        TaskList getDoneList = board.getDoneList();
        getDoneList.addTask("Clean house before christmas");


        //When & Then
        Assert.assertEquals( 1, board.getToDolist().getTasks().size());
        Assert.assertTrue(board.getToDolist().getTasks().contains("Learn programming 4 hours a day"));
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertTrue(board.getInProgressList().getTasks().contains("Learn programming 20 minutes already"));
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
        Assert.assertTrue(board.getDoneList().getTasks().contains("Clean house before christmas"));

        assertEquals(true, board.getToDolist().getTasks().contains("Learn programming 4 hours a day"));
        assertEquals(false, board.getInProgressList().getTasks().contains("Learn programming 2222 minutes already"));
        assertEquals(1, board.getDoneList().getTasks().size());
    }
}

