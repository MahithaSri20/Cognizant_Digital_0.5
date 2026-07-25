package com.cognizant.countryservice.service;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    // Find country by code
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }


    // Add new country
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }


    // Update country
    public Country updateCountry(Country country) {
        return countryRepository.save(country);
    }


    // Delete country
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }


    // Find countries by partial name
    public List<Country> searchCountry(String name) {
        return countryRepository.findByNameContaining(name);
    }
}