package com.spring.study.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.spring.study.user.model.vo.UserVO;
import com.spring.study.user.service.UserService;




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
		return "member/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void Login(Model model, UserVO user) {
		System.out.println("Ctrl login");
		UserVO result = service.login(user);
		model.addAttribute("loginUser", result);
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public void logout(HttpSession session) {
		System.out.println("Ctrl logout");
	}
	
	@RequestMapping(value="/registe", method=RequestMethod.GET)
	public String RegisteForm()
	{
		System.out.println("Ctrl registeForm");
		return "member/registe";
	}
	@RequestMapping(value="/registe", method=RequestMethod.POST)
	public void Registe(Model model, UserVO user) {
		System.out.println("Ctrl registepostForm");
		UserVO result = service.create_user(user);
		model.addAttribute("registeUser", result);
	}

}
