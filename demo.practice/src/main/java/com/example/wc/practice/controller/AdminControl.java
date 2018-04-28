package com.example.wc.practice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.wc.practice.model.*;
import com.example.wc.practice.service.AdminService;

@Controller
public class AdminControl {

	@Autowired
	AdminService adminService;
	
	 @RequestMapping(value = "/admin")
	    public String index(Model model){
	        return "loginAdmin";
	    }
	 
	 @RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	 public String login(HttpServletRequest request, @RequestParam("admininfo") AdminInfo admininfo){
		 if(adminService.loginAdmin(admininfo)){
		 	 request.getSession().setAttribute("account", admininfo.getAccount());
			 return "redirect:homeAdmin";
		 }else{
			 return "loginFailed";
		 }
	 }
}
