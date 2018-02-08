package com.spring.study.admin.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.spring.study.user.model.vo.UserVO;

@Repository("AdminUserDao")
public class AdminUserDaoImpl implements AdminUserDao {

	@Autowired
	private SqlSession session;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public UserVO loginRow(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO logoutRow(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO modify_userRow(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO delete_userRow(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create_userRow(UserVO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public int checkSignupRow(String user_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkSignup_emailRow(String user_email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count_user2Row(String keyword) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserVO> listRow() {
		// TODO Auto-generated method stub
		return null;
	}

}
