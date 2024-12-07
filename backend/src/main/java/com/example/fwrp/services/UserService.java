package com.example.fwrp.services;

import com.example.fwrp.models.User;
import com.example.fwrp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to register a new user
    public User registerUser(User user) {
        return userRepository.save(user);  // Save the user to the database
    }

    // Method to find a user by email
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);  // Use the repository method to find user by email
    }
}
