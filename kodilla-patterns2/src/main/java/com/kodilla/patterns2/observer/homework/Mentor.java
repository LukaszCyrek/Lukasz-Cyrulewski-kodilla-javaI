package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(ToDoList toDoList) {
        System.out.println(username + " :He has to check new tasks in the module: " + toDoList.getName());
        System.out.println("the sum of the tasks to be checked: " + toDoList.getTasks().size());
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
