package com.cognizant.ormappinghandson.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

    @Id
    private int id;

    private String name;

    private String department;


    @OneToOne
    private Address address;


    public Employee() {
    }


    public Employee(int id, String name, String department, Address address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}