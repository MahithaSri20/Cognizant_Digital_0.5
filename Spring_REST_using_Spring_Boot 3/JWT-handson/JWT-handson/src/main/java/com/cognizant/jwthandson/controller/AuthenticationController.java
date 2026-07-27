package com.cognizant.jwthandson.controller;

import com.cognizant.jwthandson.model.AuthenticationResponse;
import com.cognizant.jwthandson.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;


    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {


        // Remove "Basic " from header
        String encodedCredentials = authorizationHeader.substring(6);


        // Decode Base64 username:password
        byte[] decodedBytes = Base64.getDecoder()
                .decode(encodedCredentials);

        String credentials = new String(decodedBytes);


        // Split username and password
        String username = credentials.split(":")[0];
        String password = credentials.split(":")[1];


        System.out.println("Username : " + username);
        System.out.println("Password : " + password);


        // Generate JWT token using username
        String token = jwtService.generateToken(username);


        return new AuthenticationResponse(token);
    }
}