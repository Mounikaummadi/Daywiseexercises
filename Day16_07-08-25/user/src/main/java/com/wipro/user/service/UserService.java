package com.wipro.user.service;

import com.wipro.user.dto.UserDTO;
import com.wipro.user.entity.User;

public interface UserService {
    User createUser(UserDTO dto);
    User updateUser(Long id, UserDTO dto);
    void deleteUser(Long id);
    User getUser(Long id);
}
