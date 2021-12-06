package com.spring.spring.init.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8080
@RestController
@RequestMapping("/api")
//http://localhost:8080/api
public class testingcontroller {
    //http://localhost:8080/api/name
    @GetMapping("/name")
public  String getname(){
    return  "i am omar saeed";
}
}
