package com.example.wc.practice.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.wc.practice.model.*;
import com.example.wc.practice.service.*;
import com.example.wc.practice.service.impl.*;



@Controller
public class UserControl {
	
	@Autowired
	UserService userService;

	@Autowired
	UserServiceImpl userServiceImpl;
	
	 @RequestMapping(value = "/views")
	    public String index(Model model){
	        return "loginUser";
	    }
	 
	 @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	 public String login(HttpServletRequest request, @RequestParam("userinfo") UserInfo userinfo){
	 	if(userService.loginUser(userinfo)){
	 		request.getSession().setAttribute("idNum", userinfo.getIdNum());
			request.getSession().setAttribute("password", userinfo.getPassword());
			return "homeUser";
	 	}else{
	 		return "loginFailed";
	 	}
	 }

	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	 public String register(HttpServletRequest request){
		 UserInfo userinfo = new UserInfo();
		 userinfo.setId(userServiceImpl.GetUserCounts()+1);
		 userinfo.setName(request.getParameter("name"));
		 userinfo.setSex(request.getParameter("selectSex"));
		 userinfo.setAge(Integer.parseInt(request.getParameter("age")));
		 userinfo.setIdNum(request.getParameter("idNum"));
		 userinfo.setTelNum(request.getParameter("telNum"));
		 userinfo.setPassword(request.getParameter("password"));
	 	 if(userService.register(userinfo)){
	 	 	userServiceImpl.ModUserCounts(userServiceImpl.GetUserCounts()+1);
	 	 	 return "registerSuccess";
		 }else {
			 return "registerFailed";
		 }
	 }

	 @RequestMapping(value = "/queryUser", method = RequestMethod.POST)
	 public String queryUser(HttpServletRequest request){
	 	UserInfo userinfo = userServiceImpl.GetUserInfo();
	 	request.getSession().setAttribute("UserInfo", userinfo);
	 	if(userinfo == null){
	 		return "queryFailed";
		}else{
	 		return "userInfo";
		}
	 }

	 @RequestMapping(value = "/modUser", method = RequestMethod.POST)
	 public String modUser(HttpServletRequest request){
		UserInfo userinfo = new UserInfo();
		userinfo.setName(request.getParameter("name"));
		userinfo.setSex(request.getParameter("selectSex"));
		userinfo.setAge(Integer.parseInt(request.getParameter("age")));
		userinfo.setTelNum(request.getParameter("telNum"));
		userinfo.setPassword(request.getParameter("password"));
	 	if(userServiceImpl.ModUserInfo(userinfo)){
			return "modSuccess";
		}else{
	 		return "modFailed";
	 	}
	 }

	 @RequestMapping(value = "/saveMoney", method = RequestMethod.POST)
	 public String saveMoney(HttpServletRequest request){
	 	String oldBalance = userServiceImpl.GetUserInfo().getBalance();
	 	String idNum = request.getParameter("idNum");
	 	String amount = request.getParameter("amount");
	 	String newBalance = userService.SaveMoney(idNum, amount);
	 	if(oldBalance.equals(newBalance)){
	 		return "saveSuccess";
		}else{
	 		return "saveFailed";
		}
	 }

	 @RequestMapping(value = "/withdrawMoney", method = RequestMethod.POST)
	 public String withdrawMoney(HttpServletRequest request){
	 	String idNum = request.getParameter("idNum");
	 	String amount = request.getParameter("amount");
	 	if(userService.WithdrawMoney(idNum, amount)){
	 		return "withdrawSuccess";
		}else{
	 		return "withdrawFailed";
		}
	 }

	 //贷款等待处理
	 @RequestMapping(value = "loanMoney", method = RequestMethod.POST)
	 public String loanMoney(HttpServletRequest request){
	 	String idNum = request.getParameter("idNum");
	 	String amount = request.getParameter("amount");


	 	return "loanFailed1";

	 	//return "loanFailed2";根据哪一步处理来判断贷款失败的原因
	 }

}
