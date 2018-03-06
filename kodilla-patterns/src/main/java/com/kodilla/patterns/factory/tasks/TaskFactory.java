package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShoppingTask = "Shoping Task";
    public static final String PaintingTask = "Painting Task";
    public static final String DrivingTask = "Driving Task";

     public final Task makeTask(final String taskClass){
         switch (taskClass) {
             case ShoppingTask:
                 return new ShoppingTask("table", 40.5, "first");
             case PaintingTask:
                 return new PaintingTask("second", "blue", "door");
             case DrivingTask:
                 return new DrivingTask("third", "Warszawa", "Paul");
                 default:
                     return null;
         }
     }
}


