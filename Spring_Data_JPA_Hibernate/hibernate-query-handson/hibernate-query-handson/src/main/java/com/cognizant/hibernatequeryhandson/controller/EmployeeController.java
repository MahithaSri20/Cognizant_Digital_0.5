package com.cognizant.hibernatequeryhandson.controller;

import com.cognizant.hibernatequeryhandson.model.Employee;
import com.cognizant.hibernatequeryhandson.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    // Add Employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }


    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


    // HQL Query
    // Find employees by department
    @GetMapping("/department/{department}")
    public List<Employee> findByDepartment(
            @PathVariable String department) {

        return employeeService.findByDepartment(department);
    }


    // Native Query
    // Find employees with salary greater than value
    @GetMapping("/salary/{salary}")
    public List<Employee> findBySalary(
            @PathVariable double salary) {

        return employeeService.findBySalary(salary);
    }


    // HQL Query
    // Search employee name
    @GetMapping("/search/{name}")
    public List<Employee> searchByName(
            @PathVariable String name) {

        return employeeService.searchByName(name);
    }
}