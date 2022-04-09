package com.vidu.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public  String Greeting(){
        return "<H1> WELOCOME TO SPRING BOOT </H1> ";
    }
}
