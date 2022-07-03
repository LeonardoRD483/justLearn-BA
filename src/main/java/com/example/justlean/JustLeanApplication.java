package com.example.justlean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class  JustLeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(JustLeanApplication.class, args);
    }

}

