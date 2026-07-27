package com.cognizant.ormappinghandson.controller;

import com.cognizant.ormappinghandson.model.Address;
import com.cognizant.ormappinghandson.repository.AddressRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {


    private final AddressRepository addressRepository;


    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @PostMapping
    public Address addAddress(@RequestBody Address address){
        return addressRepository.save(address);
    }


    @GetMapping
    public List<Address> getAddresses(){
        return addressRepository.findAll();
    }
}