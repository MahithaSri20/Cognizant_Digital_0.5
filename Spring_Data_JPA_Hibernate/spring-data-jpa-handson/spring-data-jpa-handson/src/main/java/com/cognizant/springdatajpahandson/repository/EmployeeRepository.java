package com.cognizant.springdatajpahandson.repository;

import com.cognizant.springdatajpahandson.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Query Method 1: Find employee by name
    List<Employee> findByName(String name);


    // Query Method 2: Find employees by department
    List<Employee> findByDepartment(String department);


    // Query Method 3: Find employees whose salary is greater than given value
    List<Employee> findBySalaryGreaterThan(double salary);


    // Query Method 4: Find employees whose name contains given text
    List<Employee> findByNameContaining(String keyword);

}