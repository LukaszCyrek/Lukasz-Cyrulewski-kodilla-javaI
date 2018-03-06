package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DrivingTask);
        //Then
        Assert.assertEquals("third", drivingTask.getTaskName());
    }

    @Test
    public  void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.ShoppingTask);
        //Then
        Assert.assertEquals("first", shoppingTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PaintingTask);
        //Then
        Assert.assertEquals("second", paintingTask.getTaskName());
    }
}
