package com.aritsd.arit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
    @RequestMapping("/signUp")
    String getName(){
        return "Testing site";
    }

}
