package com.wipro.notificationservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.notificationservice.dto.NotificationDTO;

@RestController
@RequestMapping("/notify")
@Slf4j
public class NotificationController {

    @PostMapping
    public ResponseEntity<Void> notify(@RequestBody NotificationDTO dto) {
        String message = String.format("User %s information is %s", dto.getUser().getUsername(), dto.getAction());
        log.info(message);
        System.out.println(message);
        return ResponseEntity.ok().build();
    }
}