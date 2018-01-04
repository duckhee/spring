package com.spring.study.user.model.vo;

public class UserVO {

	private int user_idx;
	private String user_name;
	private String user_phone;
	private String user_email;
	private String user_id;
	private String user_password;
	private String user_createtime;
	private String user_updatetime;
	private String user_lastlogin;
	private int	user_level;
	
	
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_createtime() {
		return user_createtime;
	}
	public void setUser_createtime(String user_createtime) {
		this.user_createtime = user_createtime;
	}
	public String getUser_updatetime() {
		return user_updatetime;
	}
	public void setUser_updatetime(String user_updatetime) {
		this.user_updatetime = user_updatetime;
	}
	public String getUser_lastlogin() {
		return user_lastlogin;
	}
	public void setUser_lastlogin(String user_lastlogin) {
		this.user_lastlogin = user_lastlogin;
	}
	public int getUser_level() {
		return user_level;
	}
	public void setUser_level(int user_level) {
		this.user_level = user_level;
	}
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVO(int user_idx, String user_name, String user_phone, String user_id, String user_password,
			String user_createtime, String user_updatetime, String user_lastlogin, int user_level, String user_email) {
		super();
		this.user_email = user_email;
		this.user_idx = user_idx;
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_id = user_id;
		this.user_password = user_password;
		this.user_createtime = user_createtime;
		this.user_updatetime = user_updatetime;
		this.user_lastlogin = user_lastlogin;
		this.user_level = user_level;
	}
	public UserVO(String user_name, String user_phone, String user_email, String user_id, String user_password,
			String user_createtime, String user_updatetime, String user_lastlogin, int user_level) {
		super();
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_id = user_id;
		this.user_password = user_password;
		this.user_createtime = user_createtime;
		this.user_updatetime = user_updatetime;
		this.user_lastlogin = user_lastlogin;
		this.user_level = user_level;
	}
	public UserVO(String user_name, String user_phone, String user_email, String user_id, String user_password,
			String user_createtime, String user_updatetime, String user_lastlogin) {
		super();
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_id = user_id;
		this.user_password = user_password;
		this.user_createtime = user_createtime;
		this.user_updatetime = user_updatetime;
		this.user_lastlogin = user_lastlogin;
	}
	
	
	
}
