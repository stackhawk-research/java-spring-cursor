package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @PostMapping("/echo")
    public String reverseWord(@RequestBody String word) {
        return new StringBuilder(word).reverse().toString();
    }
} 