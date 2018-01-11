package com.spring.study.admin.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.study.admin.user.service.AdminUserService;

@Controller
@RequestMapping("/admin")
public class AdminUserController {

	@Resource(name="AdminUserService")
	private AdminUserService service;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String LoginForm(HttpSession session, Model model) {
		
		System.out.println("admin login Form");
		
		return "/admin/user/login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String Login() {
	
		return "";
	}
	
	
}
