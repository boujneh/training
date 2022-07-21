package com.boujneh.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping("/sayHello")
    public String SayHello()
    {
        return "HOLA";
    }
}
