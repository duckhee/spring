package com.spring.study.user.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.study.user.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@Controller
@RequestMapping(value="/member")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource(name="UserService")
	private UserService service;
	
	@Autowired
	BCryptPasswordEncoder passwordencoding;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String LoginForm()
	{
		System.out.println("Ctrl loginForm");
		return "user/login";
	}
	
	@RequestMapping(value="/registe", method=RequestMethod.GET)
	public String RegisteForm()
	{
		System.out.println("Ctrl registeForm");
		return "user/registe";
	}

}
