package com.example.wc.practice.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.wc.practice.model.UserInfo;
import com.example.wc.practice.model.WorkerInfo;
import com.example.wc.practice.service.UserService;
import com.example.wc.practice.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class WorkerControl {

	@Autowired
	WorkerService workerService;

	@Autowired
	UserService userService;
	
	 @RequestMapping(value = "/worker")
	 	public String index(Model model){
	        return "loginWorker";
	    }
	 
	 @RequestMapping(value = "/loginWorker", method = RequestMethod.POST)
	 public String login(HttpServletRequest request, @RequestParam("workerinfo") WorkerInfo workerinfo){
		 if(workerService.loginWorker(workerinfo)){
		 	request.getSession().setAttribute("jobNum", workerinfo.getJobNum());
		 	return "redirect:homeWorker";
		 }else{
		 	return "loginFailed";
		 }
	 }

	 @RequestMapping(value = "/queryAllUser", method = RequestMethod.POST)
	 public String queryAllUser(HttpServletRequest request){
	 	 List<UserInfo> list = workerService.GetAllUserInfo();
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
	 public String modUserCredit(String idNum,String credit){

	 	if(userService.GetUserInfo(idNum).getIdNum().equals(idNum)) {
			workerService.ModUserCredit(idNum, credit);
			return "modSuccess";
		}else {
	 		return "modCreditFailed";
		}
	 }

	 @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
	 public String deleteUser(String idNum ){
	 	if(userService.GetUserInfo(idNum).getIdNum().equals(idNum)){
	 		workerService.DeleteUser(idNum);
	 		userService.ModUserCounts(userService.GetUserCounts()-1);
	 		return "deleteUserSuccess";
		}else {
	 		return "deleteUserFailed";
		}
	 }

}
