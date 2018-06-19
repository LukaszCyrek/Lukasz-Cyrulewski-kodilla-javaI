package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(nativeQuery = true)
    List<Employee> findLastName(@Param("LASTNAME") String lastName);

    @Query(nativeQuery = true)
    List<Employee> findEmployeesByAnyMatch(@Param("LETTERS") String letters);
}
