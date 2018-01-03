package com.spring.study.user.service;

import com.spring.study.user.model.vo.UserVO;


public interface UserService {
	public UserVO login(UserVO user);
	public UserVO logout(UserVO user);
	public UserVO modify_user(UserVO user);
	public UserVO delete_user(UserVO user);
	public UserVO create_user(UserVO user);
}