package com.ecommerce.controller;

import com.ecommerce.Dto.SignupRequest;
import com.ecommerce.entity.User;
import com.ecommerce.service.AuthService;
import com.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final AuthService authService;

    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfile(@RequestHeader("Authorization") String authHeader) {
        String jwt=authHeader.substring(7).trim();
        return ResponseEntity.ok(authService.getUserProfile(jwt));
    }

    @PutMapping("/profile/{id}")
    public ResponseEntity<User> updateUserProfile(@PathVariable Long id, @RequestBody SignupRequest signUpRequest) {
        return ResponseEntity.ok(authService.updateUserProfile(id, signUpRequest));
    }

    @GetMapping("")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(authService.getAllUsers());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        authService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }

}
