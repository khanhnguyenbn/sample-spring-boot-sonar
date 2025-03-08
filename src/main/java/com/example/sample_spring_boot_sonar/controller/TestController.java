package com.example.sample_spring_boot_sonar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String testApi() {
        System.out.printf("Make an issue with sonar here");
        return "Hello, this is a test API  !";
    }
}
