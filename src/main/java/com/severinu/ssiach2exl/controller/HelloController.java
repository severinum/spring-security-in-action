package com.severinu.ssiach2exl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/people")
    public List<String> getPeope(){
        return new ArrayList<>(Arrays.asList("Adam","Marian","Tomas","Nick","Allan"));
    }

}
