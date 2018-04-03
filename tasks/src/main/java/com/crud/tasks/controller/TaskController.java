package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDTo> getTasks() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDTo getTask(Long taskId) {
        return new TaskDTo((long) 1, "test title", "test_content");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public void deleteTask(String taskId) {
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTask")
    public TaskDTo updateTask(TaskDTo taskDTo) {
        return new TaskDTo((long)1, "Edit test title", "Test content");
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTask")
    public void createTask(TaskDTo taskDTo) {

    }
}
