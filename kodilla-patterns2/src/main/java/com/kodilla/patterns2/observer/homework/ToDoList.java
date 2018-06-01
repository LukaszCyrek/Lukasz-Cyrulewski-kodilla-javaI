package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ToDoList implements Observable {
    private final List<String> tasks;
    private final String name;
    private final List<Observer> observers;


    public ToDoList(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addNewTasks(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}

