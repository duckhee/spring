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
		
		System.out.println("admin login");
	
		return "";
	}
	
	@RequestMapping(value="/userlist", method = RequestMethod.GET)
	public String UserListForm() {
		
		System.out.println("admin userlist Form");
		
		return "";
	}
	
	@RequestMapping(value="/userlist", method = RequestMethod.POST)
	public String UserList() {
		
		System.out.println("admin userlist");
		
		return "";
	}
	
	@RequestMapping(value="/userdelete", method = RequestMethod.GET)
	public String UserDestoryForm() {
		
		System.out.println("admin user destory form");
		
		return "";
	}
	
	@RequestMapping(value="/userdelete", method = RequestMethod.POST)
	public String UserDestory() {
		
		System.out.println("admin user destory");
		
		return "";
	}
}
