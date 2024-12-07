package com.example.fwrp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Map to the root URL "/"
    @GetMapping("/")
    public String home() {
        return "Welcome to the Food Waste Reduction Platform!";
    }

    // Another endpoint example
    @GetMapping("/test")
    public String test() {
        return "Test endpoint is working!";
    }
}
