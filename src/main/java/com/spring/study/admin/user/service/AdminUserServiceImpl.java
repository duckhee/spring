package com.spring.study.admin.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.study.admin.user.dao.AdminUserDao;
import com.spring.study.user.model.vo.UserVO;

@Service("AdminUserService")
public class AdminUserServiceImpl implements AdminUserService {

	@Resource(name="AdminUserDao")
	private AdminUserDao dao;
	
	@Override
	public UserVO login(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO logout(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO modify_user(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO delete_user(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create_user(UserVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public int checkSignup(String user_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkSignup_email(String user_email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count_user2(String keyword) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserVO> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
