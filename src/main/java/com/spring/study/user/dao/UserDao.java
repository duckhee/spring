package com.spring.study.user.dao;

import com.spring.study.user.model.vo.UserVO;

public interface UserDao {
	public UserVO loginRow(UserVO user);
	public UserVO logoutRow(UserVO user);
	public UserVO modify_userRow(UserVO user);
	public UserVO create_userRow(UserVO user);
	public UserVO delete_userRow(UserVO user);
}
