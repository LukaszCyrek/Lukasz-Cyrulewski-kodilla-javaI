package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ToDoList taskEasy = new TaskEasy();
        ToDoList taskHard = new TaskHard();
        ToDoList taskAverage = new TaskAverage();
        Mentor tomCant = new Mentor("Tom Cant");
        Mentor alanGable = new Mentor("Alan Gable");
        taskEasy.registerObserver(tomCant);
        taskHard.registerObserver(alanGable);
        taskAverage.registerObserver(tomCant);
        taskHard.registerObserver(tomCant);
        //When
        taskEasy.addNewTasks("First easy task");
        taskEasy.addNewTasks("Second easy task");
        taskEasy.addNewTasks("Third easy task");
        taskAverage.addNewTasks("First average task");
        taskAverage.addNewTasks("Second average task");
        taskHard.addNewTasks("First hard task");
        //then
        assertEquals(6, tomCant.getUpdateCount());
        assertEquals(1, alanGable.getUpdateCount());
    }
}
