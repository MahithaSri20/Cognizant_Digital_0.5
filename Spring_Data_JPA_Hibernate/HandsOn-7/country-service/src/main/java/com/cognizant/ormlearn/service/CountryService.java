package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;


    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }


    public Country getCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }
}