package com.example.cicd.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public String createUser() {
        return "Hello CI/CD";
    }
}
