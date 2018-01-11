package com.spring.study.admin.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.study.admin.user.service.AdminUserService;
import com.spring.study.user.model.vo.UserVO;
import com.spring.study.util.PageMaker;

@Controller
@RequestMapping("/admin/user")
public class AdminUserController {

	@Resource(name="AdminUserService")
	private AdminUserService service;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String LoginForm(HttpSession session, Model model) {
		
		System.out.println("admin login Form");
		try {
			if (session == null) {
				System.out.println("ctrl session");
				return "user/login";
			}
			@SuppressWarnings("unchecked")
			Map<String, Object> map = (Map<String, Object>) session.getAttribute("user");
			if (map == null) {
				System.out.println("ctrl map");
				return "admin/user/login";
			}
			Object str = map.get("user_id");
			if (str == null) {
				System.out.println("ctrl str");
				return "admin/user/login";
			}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception : " + e.getStackTrace());
				return "admin/user/login";
			}
			
			return "redirect:/";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String Login(UserVO user, HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("admin login");
		
		UserVO result;
		String resultURL = "";
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
				resultURL = "redirect:/";
			} else {
				System.out.println("login fail");
				map.put("msg", "fail");
				request.getSession().setAttribute("user", map);
				resultURL = "redirect:/admin/user/login";
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception ctrl : " + e.toString());
			System.out.println("login fail");
			map.put("msg", "fail");
			request.getSession().setAttribute("user", map);
			resultURL = "redirect:/admin/user/login";
		}
		return resultURL;
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpSession session) {
		System.out.println("Ctrl logout");
		session.invalidate();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "logout");
		request.getSession().setAttribute("user", map);
		return "redirect:/";
	}
	
	
	@RequestMapping(value="/list")
	public ModelAndView UserListForm(@RequestParam(defaultValue="") String keyword, PageMaker pagemaker, Model model) {
		
		System.out.println("admin userlist Form");
		ModelAndView mav = new ModelAndView();
		int count = 0;
		
		
		return mav;
	}
	
/*	@RequestMapping(value="/list", method = RequestMethod.POST)
	public String UserList() {
		
		System.out.println("admin userlist");
		
		return "";
	}
	*/
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String UserDestoryForm() {
		
		System.out.println("admin user destory form");
		
		return "";
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String UserDestory() {
		
		System.out.println("admin user destory");
		
		return "";
	}
}
