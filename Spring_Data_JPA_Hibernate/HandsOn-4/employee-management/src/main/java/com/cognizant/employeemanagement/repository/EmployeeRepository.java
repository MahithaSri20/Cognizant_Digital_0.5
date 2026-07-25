package com.cognizant.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}