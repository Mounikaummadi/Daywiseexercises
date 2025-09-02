package com.ecommerce.service;

import com.ecommerce.Dto.JwtResponse;
import com.ecommerce.Dto.SignInRequest;
import com.ecommerce.Dto.SignupRequest;
import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    public User registerUser(SignupRequest signupRequest) {
        if (userRepository.existsByEmail(signupRequest.getEmail())) {
            throw new IllegalArgumentException("Email is already in use");
        }

        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
        user.setFirstName(signupRequest.getFirstName());
        user.setLastName(signupRequest.getLastName());
        user.setRole(signupRequest.getRole());

        return userRepository.save(user);
    }


    public JwtResponse loginUser(SignInRequest signInRequest){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                signInRequest.getEmail(),
                signInRequest.getPassword()));

        var user = userRepository.findByEmail(signInRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));
        var jwtToken = jwtService.generateToken(user);

        JwtResponse jwtResponse = new JwtResponse();
        jwtResponse.setToken(jwtToken);
        return jwtResponse;
    }

    public User getUserProfile(String jwt) {
        String email = extractEmailFromJwt(jwt);
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found with email: " + email));

    }

    private String extractEmailFromJwt(String jwt) {
        return jwtService.extractUsername(jwt);
    }

    public User updateUserProfile(Long id, SignupRequest signUpRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        user.setFirstName(signUpRequest.getFirstName());
        user.setLastName(signUpRequest.getLastName());
        if (signUpRequest.getPassword() != null && !signUpRequest.getPassword().isEmpty()) {
            user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        }
        user.setEmail(signUpRequest.getEmail());
        user.setAddress(signUpRequest.getAddress());
        user.setRole(signUpRequest.getRole());

        userRepository.save(user);

        return user;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
}
