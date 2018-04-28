package com.example.wc.practice.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class WorkerLoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//获取请求的url
		String url = request.getRequestURI();
		// 如果获取的是公开地址（登录），则放行
		if(url.endsWith("login.action")){
			return true;
		}
		
		//判断session.员工是否登录
		HttpSession session = request.getSession();
		//从session中提取员工信息
		String jobNum = (String)session.getAttribute("jobNum");
		if(jobNum != null){
			return true;
		}
		
		//走到这里表示员工需要验证身份，跳转到员工登录页面
		request.getRequestDispatcher("views/loginWorker.jsp").forward(request, response);
		
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
