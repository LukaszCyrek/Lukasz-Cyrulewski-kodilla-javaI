package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "First List";

    @Test
    public void testTaskDaoSave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "jeden");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        TaskList readTask = taskListDao.findOne(id);
        Assert.assertEquals(id, readTask.getId());

        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public  void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "raz, dwa, trzy");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
       //int id = readTaskList.get(0).getId();
       //taskListDao.delete(id);
    }
}
