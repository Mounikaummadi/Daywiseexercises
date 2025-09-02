package com.ecommerce.controller;

import com.ecommerce.Dto.JwtResponse;
import com.ecommerce.Dto.SignInRequest;
import com.ecommerce.Dto.SignupRequest;
import com.ecommerce.entity.User;
import com.ecommerce.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AUthController {

    private final AuthService authService;


    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody SignupRequest signupRequest) {
        return ResponseEntity.ok(authService.registerUser(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> loginUser(@RequestBody SignInRequest signInRequest) {
        return new ResponseEntity<>(authService.loginUser(signInRequest), HttpStatus.OK);
    }
}
