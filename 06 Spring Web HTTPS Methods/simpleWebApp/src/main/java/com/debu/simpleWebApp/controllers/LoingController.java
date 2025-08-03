package com.debu.simpleWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoingController {

    @RequestMapping("/login-in")
    public String loginIn() {
        return "Login Successful!";
    }
}
