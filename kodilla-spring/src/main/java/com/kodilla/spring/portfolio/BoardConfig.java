package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Bean(name = "toDoList")
    @Scope(value = "prototype")
    public TaskList getToDo() {
        TaskList taskList = new TaskList();
        taskList.getTasks().add("to do list");
        return taskList;
    }
    @Bean(name = "doneList")
    @Scope(value = "prototype")
    public TaskList getDone() {
        TaskList taskList = new TaskList();
        taskList.getTasks().add("done list");
        return taskList;
    }

    @Bean(name = "inProgressList")
    @Scope(value = "prototype")
    public TaskList getInProgress() {
        TaskList taskList = new TaskList();
        taskList.getTasks().add("in progress list");
        return taskList;
    }

    @Bean
    public Board getBoard() {
        return new Board(getToDo(), getInProgress(), getDone());
    }
}

