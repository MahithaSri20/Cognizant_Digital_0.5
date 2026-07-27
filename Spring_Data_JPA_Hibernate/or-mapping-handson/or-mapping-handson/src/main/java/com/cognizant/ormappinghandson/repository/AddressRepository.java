package com.cognizant.ormappinghandson.repository;

import com.cognizant.ormappinghandson.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}