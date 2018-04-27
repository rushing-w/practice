package com.example.wc.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControl {

    @RequestMapping("*")
    public String login(){
        return "login";
    }
}
