package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.Facade;
import com.kodilla.hibernate.manytomany.facade.QueryException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTest {
    @Autowired
    private Facade facade;

    @Test
    public void testFacadeCompanySearchByMatch() throws QueryException {
        //Given
        TestInputData inputData = new TestInputData();
        inputData.createDataBaseEntries();
        //When
        List<Company> result = facade.processCompanyQueries("chin");
        //Then
        Assert.assertEquals(3, result.size());
        //Cleanup
        inputData.deleteTestInput();

    }

    @Test
    public void testFacadeEmployeeSearchByMatch() throws QueryException {
        //Given
        TestInputData inputData = new TestInputData();
        inputData.createDataBaseEntries();
        //When
        List<Employee> result = facade.processEmployeeQueries("mit");
        //Then
        Assert.assertEquals(1, result.size());
        //Cleanup
        inputData.deleteTestInput();

    }

}
