package com.cognizant.countryservice.repository;

import com.cognizant.countryservice.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByNameContaining(String name);

}