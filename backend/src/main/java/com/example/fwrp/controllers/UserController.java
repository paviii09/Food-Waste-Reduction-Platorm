package com.example.fwrp.controllers;

import com.example.fwrp.models.User;
import com.example.fwrp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Register a new user
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);  // Call the registerUser method
    }

    // Find a user by email
    @GetMapping("/findByEmail")
    public Optional<User> findUserByEmail(@RequestParam String email) {
        return userService.findUserByEmail(email);  // Call the findUserByEmail method
    }
}
