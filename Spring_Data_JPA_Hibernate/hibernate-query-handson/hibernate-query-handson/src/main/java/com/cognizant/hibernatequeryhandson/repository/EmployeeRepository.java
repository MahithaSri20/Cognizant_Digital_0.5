package com.cognizant.hibernatequeryhandson.repository;

import com.cognizant.hibernatequeryhandson.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    // HQL Query - Find employees by department
    @Query("SELECT e FROM Employee e WHERE e.department = :department")
    List<Employee> findEmployeesByDepartment(String department);


    // Native Query - Find employees with salary greater than value
    @Query(value = "SELECT * FROM employee WHERE salary > :salary",
            nativeQuery = true)
    List<Employee> findEmployeesBySalary(double salary);


    // HQL Query - Search employee name
    @Query("SELECT e FROM Employee e WHERE e.name LIKE %:name%")
    List<Employee> findEmployeesByName(String name);

}