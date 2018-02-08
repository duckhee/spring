package com.spring.study.admin.user.dao;

import java.util.List;

import com.spring.study.user.model.vo.UserVO;

public interface AdminUserDao {

	public UserVO loginRow(UserVO user);
	public UserVO logoutRow(UserVO user);
	public UserVO modify_userRow(UserVO user);
	public UserVO delete_userRow(UserVO user);
	public void create_userRow(UserVO user);
	public int checkSignupRow(String user_id);
	public int checkSignup_emailRow(String user_email);
	public int count_user2Row(String keyword );
	public List<UserVO> listRow();
}
