package com.cognizant.springdatajpahandson.service;

import com.cognizant.springdatajpahandson.model.Employee;
import com.cognizant.springdatajpahandson.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    // Query Method: find by name
    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }


    // Query Method: find by department
    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }


    // Query Method: salary greater than
    public List<Employee> getEmployeesBySalary(double salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }


    // Query Method: name contains
    public List<Employee> searchEmployees(String keyword) {
        return employeeRepository.findByNameContaining(keyword);
    }


    // Save employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}