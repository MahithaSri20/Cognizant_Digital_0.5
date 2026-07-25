package com.cognizant.countryservice;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.service.CountryService;
import com.cognizant.countryservice.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CountryServiceApplication implements CommandLineRunner {


    @Autowired
    private CountryService countryService;


    public static void main(String[] args) {

        SpringApplication.run(CountryServiceApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {

        getCountryByCodeTest();

    }


    private void getCountryByCodeTest() throws CountryNotFoundException {

        System.out.println("Start Find Country");

        Country country = countryService.findCountryByCode("IN");

        System.out.println("Country: " + country);

        System.out.println("End Find Country");

    }

}