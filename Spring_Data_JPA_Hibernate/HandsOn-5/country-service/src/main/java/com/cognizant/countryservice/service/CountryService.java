package com.cognizant.countryservice.service;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.repository.CountryRepository;
import com.cognizant.countryservice.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    // Find country by code
    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

        Optional<Country> result = countryRepository.findById(countryCode);

        if (!result.isPresent()) {
            throw new CountryNotFoundException(
                    "Country not found with code: " + countryCode
            );
        }

        return result.get();
    }


    // Add new country
    @Transactional
    public Country addCountry(Country country) {

        return countryRepository.save(country);

    }


    // Update country
    @Transactional
    public Country updateCountry(Country country) {

        return countryRepository.save(country);

    }

}