package com.spring.study.user.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
