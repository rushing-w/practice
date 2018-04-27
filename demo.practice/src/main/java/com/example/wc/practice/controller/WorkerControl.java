package com.example.wc.practice.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.wc.practice.service.impl.UserServiceImpl;
import com.example.wc.practice.service.impl.WorkerServiceImpl;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.wc.practice.model.*;
import com.example.wc.practice.service.*;

import java.util.List;

@Controller
public class WorkerControl {

	@Autowired
	WorkerService workerService;
	@Autowired
	WorkerServiceImpl workerServiceImpl;
	@Autowired
	UserServiceImpl userServiceImpl;
	
	 @RequestMapping(value = "/views")
	 	public String index(Model model){
	        return "loginWorker";
	    }
	 
	 @RequestMapping(value = "/loginWorker", method = RequestMethod.POST)
	 public String login(HttpServletRequest request, @RequestParam("workerinfo") WorkerInfo workerinfo){
		 if(workerService.loginWorker(workerinfo)){
		 	request.getSession().setAttribute("jobNum", workerinfo.getJobNum());
		 	return "homeWorker";
		 }else{
		 	return "loginFailed";
		 }
	 }

	 @RequestMapping(value = "/queryAllUser", method = RequestMethod.POST)
	 public String queryAllUser(HttpServletRequest request){
	 	 List<UserInfo> list = workerServiceImpl.GetAllUserInfo();
	 	 request.getSession().setAttribute("list", list);
	 	 return "queryAllUser";
	 }

	 //存在两个页面调用——还要再考虑
	 /*@RequestMapping(value = "/queryOneUser", method = RequestMethod.POST)
	 public String queryOneUser(HttpServletRequest request){
	 	 String idNum = request.getParameter("idNum");
	 	 String telNum = request.getParameter("telNum");

	 }*/

	 @RequestMapping(value = "/modUserCredit", method = RequestMethod.POST)
	 public String modUserCredit(HttpServletRequest request){
	 	String idNum = request.getParameter("idNum");
	 	String credit = request.getParameter("credit");
	 	if(userServiceImpl.GetUserInfo().getIdNum().equals(idNum)) {
			workerServiceImpl.ModUserCredit(idNum, credit);
			return "modSuccess";
		}else {
	 		return "modCreditFailed";
		}
	 }

	 @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
	 public String deleteUser(HttpServletRequest request){
	 	String idNum = request.getParameter("idNum");
	 	if(userServiceImpl.GetUserInfo().getIdNum().equals(idNum)){
	 		workerServiceImpl.DeleteUser(idNum);
	 		return "deleteUserSuccess";
		}else {
	 		return "deleteUserFailed";
		}
	 }

}
