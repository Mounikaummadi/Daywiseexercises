package com.wipro.user.service.impl;

import com.wipro.user.dto.NotificationDTO;
import com.wipro.user.entity.User;
import com.wipro.user.repo.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    private final String NOTIFY_URL = "http://notificationservice/notify";

    public User createUser(User user) {
        User saved = userRepository.save(user);
        notifyChange(saved, "Created");
        return saved;
    }

    public User updateUser(Long id, User user) {
        User existing = userRepository.findById(id).orElseThrow();
        existing.setUsername(user.getUsername());
        existing.setPassword(user.getPassword());
        existing.setAddress(user.getAddress());
        User updated = userRepository.save(existing);
        notifyChange(updated, "Updated");
        return updated;
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        userRepository.deleteById(id);
        notifyChange(user, "Deleted");
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    private void notifyChange(User user, String action) {
        NotificationDTO dto = new NotificationDTO(user, action);
        restTemplate.postForObject(NOTIFY_URL, dto, Void.class);
    }
}