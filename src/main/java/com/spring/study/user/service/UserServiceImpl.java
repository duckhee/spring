package com.spring.study.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.study.user.dao.UserDao;
import com.spring.study.user.model.vo.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao dao;
	
	@Override
	public UserVO login(UserVO user) {
		// TODO Auto-generated method stub
		return dao.loginRow(user);
	}

	@Override
	public UserVO logout(UserVO user) {
		// TODO Auto-generated method stub
		return dao.logoutRow(user);
	}

	@Override
	public UserVO modify_user(UserVO user) {
		// TODO Auto-generated method stub
		return dao.modify_userRow(user);
	}

	@Override
	public UserVO delete_user(UserVO user) {
		// TODO Auto-generated method stub
		return dao.delete_userRow(user);
	}

	@Override
	public UserVO create_user(UserVO user) {
		// TODO Auto-generated method stub
		return dao.create_userRow(user);
	}

}