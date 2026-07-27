package com.cognizant.ormappinghandson.repository;

import com.cognizant.ormappinghandson.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}