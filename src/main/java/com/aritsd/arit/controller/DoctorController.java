package com.aritsd.arit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/signUp")
    String getName(){
        return "Testing site";
    }
    @GetMapping("/users")
    public List<User> index(){
        return userRepository.findAll();
    }

}
