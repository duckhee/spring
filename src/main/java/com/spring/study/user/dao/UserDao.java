package com.spring.study.user.dao;

import com.spring.study.user.model.vo.UserVO;

public interface UserDao {
	public UserVO loginRow(UserVO user);
	public UserVO logoutRow(UserVO user);
	public UserVO modify_userRow(UserVO user);
	public void create_userRow(UserVO user);
	public UserVO delete_userRow(UserVO user);
	public int checkSignup(String user_id);
	public int checkSignup_email(String user_email);
	public int count_user2(String keyword );
	
}
