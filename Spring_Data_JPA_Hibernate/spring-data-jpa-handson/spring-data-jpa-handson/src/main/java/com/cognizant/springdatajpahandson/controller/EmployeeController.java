package com.cognizant.springdatajpahandson.controller;

import com.cognizant.springdatajpahandson.model.Employee;
import com.cognizant.springdatajpahandson.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


    // Save employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }


    // Query Method: Find by name
    @GetMapping("/name/{name}")
    public List<Employee> getByName(@PathVariable String name) {
        return employeeService.getEmployeesByName(name);
    }


    // Query Method: Find by department
    @GetMapping("/department/{department}")
    public List<Employee> getByDepartment(@PathVariable String department) {
        return employeeService.getEmployeesByDepartment(department);
    }


    // Query Method: Salary greater than
    @GetMapping("/salary/{salary}")
    public List<Employee> getBySalary(@PathVariable double salary) {
        return employeeService.getEmployeesBySalary(salary);
    }


    // Query Method: Name contains
    @GetMapping("/search/{keyword}")
    public List<Employee> search(@PathVariable String keyword) {
        return employeeService.searchEmployees(keyword);
    }
}