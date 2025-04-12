package com.example.springbootApi.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/greet")
    public String greet(){

        return "Hello! welcome to world of cloud and devops!!!";
    }

}
