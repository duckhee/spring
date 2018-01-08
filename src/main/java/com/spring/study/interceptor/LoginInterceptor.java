package com.spring.study.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public void postHandle(	HttpServletRequest request, HttpServletResponse response, Object handler,
							ModelAndView modelAndView) throws Exception {
		HttpSession session = request.getSession() ; 
		ModelMap modelMap = modelAndView.getModelMap() ; 
		Object   user = modelMap.get("loginUser");
		if(user != null) {
			System.out.println(">>>>>>>>> new login session "); 
			session.setAttribute("loginUser", user); 
			
			//response.sendRedirect("/");
			
			Object dest = session.getAttribute("dest") ; 
			response.sendRedirect( dest != null ? (String)dest : "/");

		}
		
	}
}
