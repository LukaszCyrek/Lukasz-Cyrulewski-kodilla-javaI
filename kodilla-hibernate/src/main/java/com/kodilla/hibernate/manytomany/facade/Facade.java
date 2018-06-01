package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Facade {
    @Autowired
    EmployeeDao employeeDao;
    CompanyDao companyDao;

    public List<Employee> findEmployee(String secondName) {
        return employeeDao.searchByName("%" + secondName + "%");

    }
    public List<Company> findCompany(String name) {
        return companyDao.searchByName("%" + name + "$");
    }
}
