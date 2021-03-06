package com.spring.study.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.study.user.dao.UserDao;
import com.spring.study.user.model.vo.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Resource(name="UserDao")
	private UserDao dao;
	
	@Override
	public UserVO login(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("service login");
		try {
		return dao.loginRow(user);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("login exception : "+e.toString());
			return null;
		}
	}

	@Override
	public UserVO logout(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("service logout");
		return dao.logoutRow(user);
	}

	@Override
	public UserVO modify_user(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("service modify");
		return dao.modify_userRow(user);
	}

	@Override
	public UserVO delete_user(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("service delete");
		return dao.delete_userRow(user);
	}

	@Override
	public void create_user(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("service create");
		 dao.create_userRow(user);
	}

	@Override
	public int checkSignup(String user_id) {
		// TODO Auto-generated method stub
		System.out.println("service check sign up");
		return dao.checkSignup(user_id);
	}

	@Override
	public int checkSignup_email(String user_email) {
		// TODO Auto-generated method stub
		System.out.println("service check sign up email");
		return dao.checkSignup_email(user_email);
	}

	@Override
	public int counter_user(String keyword) {
		// TODO Auto-generated method stub
		System.out.println("service check count user");
		return dao.counter_userRow(keyword);
	}

}
