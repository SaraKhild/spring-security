package com.example.springsecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/home")
    public String showHome(){
        System.out.println(" 1 ");
        return "home";
    }

    @GetMapping("/login")
    public String showMyLoginPage(){
        System.out.println(" 2 ");
        return "login";
    }

    @GetMapping("/hello")
    public  String hello(){
        System.out.println(" 3 ");
        return "hello";
    }
}
