package com.cognizant.countryservice.service;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;
import com.cognizant.countryservice.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country getCountry(String code) {

        Country country = countryRepository.findById(code).orElse(null);

        if (country == null) {
            throw new CountryNotFoundException("Country not found with code: " + code);
        }

        return country;
    }
}