package com.tql.controller;

import com.tql.entities.User;
import com.tql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String homepage(){

        return "This is homepage";
    }

    @GetMapping("/hello")
    public String hello() {
        return "This is hellopage";
    }
}
