package com.diallo.azuretest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    //Azure database password: Tountoye@62210@
    //Azure database user: diallo


    @GetMapping("")
    public String home() {

        return "Hello World from azure, Test CI/CD " + " Welcome docker Group";
    }
}
