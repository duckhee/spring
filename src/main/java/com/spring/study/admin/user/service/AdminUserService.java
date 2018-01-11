package com.spring.study.admin.user.service;

import java.util.List;

import com.spring.study.user.model.vo.UserVO;

public interface AdminUserService {
	public UserVO login(UserVO user);
	public UserVO logout(UserVO user);
	public UserVO modify_user(UserVO user);
	public UserVO delete_user(UserVO user);
	public void create_user(UserVO user);
	public int checkSignup(String user_id);
	public int checkSignup_email(String user_email);
	public int count_user2(String keyword );
	public List<UserVO> list();

}
