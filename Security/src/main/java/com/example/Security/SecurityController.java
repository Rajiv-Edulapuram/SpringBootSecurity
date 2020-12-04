package com.example.Security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String sayWelcome(){
        return "<h2>Welcome</h2>";
    }
    @GetMapping("/user")
    public String sayWelcomeUser(){
        return "<h2>Welcome User!!</h2>";
    }
    @GetMapping("/admin")
    public String sayWelcomeAdmin(){
        return "<h2>Welcome Admin!!!</h2>";
    }

}
