package com.cognizant.employeemanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeemanagement.model.Employee;
import com.cognizant.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "Employee added successfully";
    }
}