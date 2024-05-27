package com.example.springboot.cruddemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DemoRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Test World !!!";
    }
}
