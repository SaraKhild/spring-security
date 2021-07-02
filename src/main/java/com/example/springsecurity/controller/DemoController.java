package com.example.springsecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/home")
    public String showHome(){
        return "home";
    }

    @GetMapping("/login")
    public String showMyLoginPage(){
        return "login";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
