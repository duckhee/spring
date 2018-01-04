package com.spring.study.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.spring.study.user.model.vo.UserVO;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession session;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public UserVO loginRow(UserVO user) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("loginRow>>>>>>>>>>>"+ user +'\n');
		UserVO result = session.selectOne("loginUser", user);
		return result;
	}

	@Override
	public UserVO logoutRow(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("logoutRow>>>>>>>>>>>"+ user +'\n');
		return null;
	}

	@Override
	public UserVO modify_userRow(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("modifyRow>>>>>>>>>>>"+ user +'\n');
		return null;
	}

	@Override
	public void create_userRow(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("createRow>>>>>>>>>>>"+ user +'\n');
		session.insert("create_user", user);
	}

	@Override
	public UserVO delete_userRow(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("deleteRow>>>>>>>>>>>"+ user +'\n');
		return null;
	}

}
