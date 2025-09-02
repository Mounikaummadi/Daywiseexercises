package com.wipro.springbootdemo.repo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wipro.springbootdemo.entity.User;

@Controller
public class UserController {

    @GetMapping("/userform")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "userreg";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getUserEmail());
        System.out.println("Phone: " + user.getUserPhone());
        return "userreg"; 
    }
}
