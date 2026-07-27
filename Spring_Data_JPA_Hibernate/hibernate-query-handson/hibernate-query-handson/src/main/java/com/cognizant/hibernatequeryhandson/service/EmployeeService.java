package com.cognizant.hibernatequeryhandson.service;

import com.cognizant.hibernatequeryhandson.model.Employee;
import com.cognizant.hibernatequeryhandson.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    // Save Employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    // HQL Query
    public List<Employee> findByDepartment(String department) {
        return employeeRepository.findEmployeesByDepartment(department);
    }


    // Native Query
    public List<Employee> findBySalary(double salary) {
        return employeeRepository.findEmployeesBySalary(salary);
    }


    // HQL Query
    public List<Employee> searchByName(String name) {
        return employeeRepository.findEmployeesByName(name);
    }

}