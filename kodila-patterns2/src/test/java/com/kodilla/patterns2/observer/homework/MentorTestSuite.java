package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TasksList tasksList = new TasksList("List number 1");
        TasksList tasksList1 = new TasksList("List number 2");
        TasksList tasksList2 = new TasksList("List number 3");
        Mentor franek = new Mentor("Franek");
        Mentor zbychu = new Mentor("Zbychu");
        tasksList.registerObserver(franek);
        tasksList1.registerObserver(franek);
        tasksList2.registerObserver(zbychu);

        //When
        tasksList.addTask(new Task(1));
        tasksList.addTask(new Task(2));
        tasksList1.addTask(new Task(1));
        tasksList1.addTask(new Task(2));
        tasksList1.addTask(new Task(3));
        tasksList2.addTask(new Task(1));

        //Then
        assertEquals(5, franek.getUpdateCount());
        assertEquals(1, zbychu.getUpdateCount());
    }
}