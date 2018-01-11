package com.spring.study.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
	BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String LoginForm(HttpSession session, Model model)
	{
		System.out.println("Ctrl loginForm");
		try {
		if (session == null) {
			System.out.println("ctrl session");
			return "user/login";
		}
		@SuppressWarnings("unchecked")
		Map<String, Object> map = (Map<String, Object>) session.getAttribute("user");
		if (map == null) {
			System.out.println("ctrl map");
			return "user/login";
		}
		Object str = map.get("user_id");
		if (str == null) {
			System.out.println("ctrl str");
			return "user/login";
		}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception : " + e.getStackTrace());
			return "user/login";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String Login(UserVO user, HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("Ctrl login");
		
		UserVO result;
		String returnURL = "";
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			result = service.login(user);
			System.out.println("user : " + user.toString());
			System.out.println("result : " + result.toString());
			if (passwordEncoder.matches(user.getuser_pw(), result.getuser_pw())) {
				System.out.println("login sucess");
				map.put("user_id", result.getUser_id());
				map.put("user_level", result.getUser_level());
				request.getSession().setAttribute("user", map);
				returnURL = "redirect:/";
			} else {
				System.out.println("login fail");
				map.put("msg", "fail");
				request.getSession().setAttribute("user", map);
				returnURL = "redirect:/member/login";
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception ctrl : " + e.toString());
			System.out.println("login fail");
			map.put("msg", "fail");
			request.getSession().setAttribute("user", map);
			returnURL = "redirect:/member/login";
		}
		
		return returnURL;
		
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpSession session) {
		System.out.println("Ctrl logout");
		session.invalidate();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "logout");
		request.getSession().setAttribute("user", map);
		return "redirect:/member/login";
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	@RequestMapping(value="/registe", method=RequestMethod.GET)
	public String RegisteForm()
	{
		System.out.println("Ctrl registeForm");
		return "user/registe";
	}
	@RequestMapping(value="/registe", method=RequestMethod.POST)
	public ModelAndView Registe(@RequestParam String user_id, String user_password, String user_name, String user_phone, String user_email) {
		System.out.println("Ctrl registepost");
		ModelAndView view = new ModelAndView();
		Date date = new Date();
		SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String current_time = date_format.format(date);
		String encryptPassword = passwordEncoder.encode(user_password);
		System.out.println("pw : " + encryptPassword);
		UserVO uservo = new UserVO(user_name, user_phone, user_email, user_id, encryptPassword, current_time, current_time, current_time, 5);
		service.create_user(uservo);
		view.setViewName("redirect:/member/login");
		return view;
	}
	

}
