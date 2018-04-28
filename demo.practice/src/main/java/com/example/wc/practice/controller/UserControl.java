package com.example.wc.practice.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.wc.practice.model.*;
import com.example.wc.practice.service.*;



@Controller
public class UserControl {
	
	@Autowired
	UserService userService;

	
	 @RequestMapping(value = "/user")
	    public String index(Model model){
	        return "loginUser";
	    }
	 
	 @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	 public String login(HttpServletRequest request, @RequestParam("userinfo") UserInfo userinfo){
	 	if(request.getParameter("abc") == "1"){
			if(userService.loginUser(userinfo)){
				request.getSession().setAttribute("idNum", userinfo.getIdNum());
				request.getSession().setAttribute("password", userinfo.getPassword());
				return "redirect:homeUser";
			}else{
				return "loginFailed";
			}
		}else if(request.getParameter("abc") == "2"){
	 		return "register";
		}else{
	 		return "login";
		}

	 }

	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	 public String register(HttpServletRequest request){
		 UserInfo userinfo = new UserInfo();
		 userinfo.setId(userService.GetUserCounts()+1);
		 userinfo.setName(request.getParameter("name"));
		 userinfo.setSex(request.getParameter("selectSex"));
		 userinfo.setAge(Integer.parseInt(request.getParameter("age")));
		 userinfo.setIdNum(request.getParameter("idNum"));
		 userinfo.setTelNum(request.getParameter("telNum"));
		 userinfo.setPassword(request.getParameter("password"));
	 	 if(userService.register(userinfo)){
	 	 	userService.ModUserCounts(userService.GetUserCounts()+1);
	 	 	 return "registerSuccess";
		 }else {
			 return "registerFailed";
		 }
	 }

	 @RequestMapping(value = "/queryUser", method = RequestMethod.POST)
	 public String queryUser(HttpSession session,String idNum){
	 	UserInfo userinfo = userService.GetUserInfo(idNum);
	 	session.setAttribute("UserInfo", userinfo);
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
	 	if(userService.ModUserInfo(userinfo)){
			return "modSuccess";
		}else{
	 		return "modFailed";
	 	}
	 }

	 @RequestMapping(value = "/saveMoney", method = RequestMethod.POST)
	 public String saveMoney(String idNum,String amount){
	 	String oldBalance = userService.GetUserInfo(idNum).getBalance();
	 	String newBalance = userService.SaveMoney(idNum, amount);
	 	if(oldBalance.equals(newBalance)){
	 		return "saveSuccess";
		}else{
	 		return "saveFailed";
		}
	 }

	 @RequestMapping(value = "/withdrawMoney", method = RequestMethod.POST)
	 public String withdrawMoney(String idNum,String amount){
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
