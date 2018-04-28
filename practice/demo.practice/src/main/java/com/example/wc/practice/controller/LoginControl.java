package com.example.wc.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginControl {

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    /*@RequestMapping("/login")
    public String homelogin(HttpServletRequest request){
        if(request.getParameter("goto") == "用户") {
            return "loginUser";
        }else if(request.getParameter("goto") == "工作人员"){
            return "loginWorker";
        }else{
            return "loginAdmin";
        }
    }*/
}
