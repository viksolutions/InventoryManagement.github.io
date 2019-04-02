package com.fsmd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_user")
public class LoginModel implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "user_login_id")
	private Integer user_login_id;
	
	@Column(name="login_id")
	private String login_id;
	
	@Column(name="login_password")
	private String login_password;
	

	
	public int getUser_login_id() {
		return user_login_id;
	}
	public void setUser_login_id(int user_login_id) {
		this.user_login_id = user_login_id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	
	
	
}
