package com.cognizant.employeemanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.employeemanagement.model.Employee;
import com.cognizant.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}