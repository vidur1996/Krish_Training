package com.vidu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public  String Greeting(){
        return "<H1>Iam running on docker </H1>";
    }
}
