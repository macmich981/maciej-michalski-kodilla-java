package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskProducerTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskProducer taskProducer = new TaskProducer();
        //When
        Task driving = taskProducer.makeTask(new DrivingTaskFactory("Driving", "Home", "my car"));
        //Then
        driving.executeTask();
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskProducer taskProducer = new TaskProducer();
        //When
        Task painting = taskProducer.makeTask(new PaintingTaskFactory("Painting", "Red", "Wall"));
        //Then
        painting.executeTask();
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskProducer taskProducer = new TaskProducer();
        //When
        Task shopping = taskProducer.makeTask(new ShoppingTaskFactory("Shopping", "Bread", 10));
        //Then
        shopping.executeTask();
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }
}
