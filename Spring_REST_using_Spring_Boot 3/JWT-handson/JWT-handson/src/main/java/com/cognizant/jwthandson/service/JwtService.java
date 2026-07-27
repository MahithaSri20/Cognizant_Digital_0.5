package com.cognizant.jwthandson.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

@Service
public class JwtService {


    private final String secretKey =
            "myverystrongsecretkeymyverystrongsecretkey";


    public String generateToken(String username) {


        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(System.currentTimeMillis() + 1000 * 60 * 30)
                )
                .signWith(
                        SignatureAlgorithm.HS256,
                        secretKey.getBytes()
                )
                .compact();
    }
}