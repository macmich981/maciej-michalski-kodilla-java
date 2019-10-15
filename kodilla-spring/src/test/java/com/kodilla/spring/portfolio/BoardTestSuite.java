package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testAddTaskToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Zadanie do zrobienia");
        String result = board.getToDoList().getTasks().get(0);
        //Them
        System.out.println(result);
        Assert.assertEquals("Zadanie do zrobienia", result);
    }

    @Test
    public void testAddTaskToInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().getTasks().add("Zadanie w toku");
        String result = board.getInProgressList().getTasks().get(0);
        //Them
        System.out.println(result);
        Assert.assertEquals("Zadanie w toku", result);
    }

    @Test
    public void testAddTaskToDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks().add("Zadanie wykonane");
        String result = board.getDoneList().getTasks().get(0);
        //Them
        System.out.println(result);
        Assert.assertEquals("Zadanie wykonane", result);
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Zadanie do zrobienia");
        board.getInProgressList().getTasks().add("Zadanie w toku");
        board.getDoneList().getTasks().add("Zadanie wykonane");

        int result = board.getToDoList().getTasks().size();
        int result1 = board.getInProgressList().getTasks().size();
        int result2 = board.getDoneList().getTasks().size();
        //Then
        Assert.assertEquals(1, result);
        Assert.assertEquals(1, result1);
        Assert.assertEquals(1, result2);
    }
}
