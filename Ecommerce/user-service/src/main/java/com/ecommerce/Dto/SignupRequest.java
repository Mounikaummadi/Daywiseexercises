package com.ecommerce.Dto;

import com.ecommerce.entity.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String address;
    @Enumerated(EnumType.STRING)
    private Role role;


}
