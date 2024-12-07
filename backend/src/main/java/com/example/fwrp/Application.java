package com.example.fwrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This annotation marks the class as the main entry point for Spring Boot
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);  // Launch the Spring Boot application
    }
}
