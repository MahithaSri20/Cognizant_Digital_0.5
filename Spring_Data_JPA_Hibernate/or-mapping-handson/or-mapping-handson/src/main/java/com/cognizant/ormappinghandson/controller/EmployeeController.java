package com.cognizant.ormappinghandson.controller;

import com.cognizant.ormappinghandson.model.Employee;
import com.cognizant.ormappinghandson.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;


    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }


    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}