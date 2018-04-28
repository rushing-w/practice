package com.example.wc.practice.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserLoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//获取请求的url
		String url = request.getRequestURI();
		// 如果获取的是公开地址（登录），则放行
		if(url.endsWith("login.action")){
			return true;
		}
		
		//判断session.用户是否登录
		HttpSession session = request.getSession();
		//从session中提取用户信息
		String idNum = (String)session.getAttribute("idNum");
		if(idNum != null){
			return true;
		}
		
		//走到这里表示用户需要验证身份，跳转到用户登录页面
		request.getRequestDispatcher("views/loginUser.jsp").forward(request, response);
		
		return false;
	}

	@Override
	public void afterCompletion(HttpServletRequest equest, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
			
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {	
		
	}

}
