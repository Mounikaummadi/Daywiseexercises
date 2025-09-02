package com.wipro.jwtdemo.controller;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("/getCurrentTime")
    public String getCurrentTime() {
        return "Current Time: " + LocalDateTime.now().toString();
    }
}