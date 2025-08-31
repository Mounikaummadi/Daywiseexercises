package com.wipro.jwtdemo.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.*;

import com.wipro.jwtdemo.dto.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class UserController {

    @PostMapping("/login")
    public User login(@RequestBody User loginRequest) {
        String username = loginRequest.getUser();
        String password = loginRequest.getPwd();

        // TODO: Validate against DB with encrypted password
        System.out.println("username=" + username);

        String token = getJWTToken(username);
        loginRequest.setToken(token);
        loginRequest.setPwd(null); // Don't return password

        return loginRequest;
    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        return "Bearer " + Jwts.builder()
                .setId("wiproUserMgmt")
                .setSubject(username)
                .claim("authorities", grantedAuthorities.stream()
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000)) // 10 minutes
                .signWith(SignatureAlgorithm.HS512, secretKey.getBytes())
                .compact();
    }
}