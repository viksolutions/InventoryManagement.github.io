package com.fsmd.bean;

public class LoginBean {

private String login_id;
private String login_password;
private Integer user_login_id;
private boolean userExist;

public boolean isUserExist() {
	return userExist;
}
public void setUserExist(boolean userExist) {
	this.userExist = userExist;
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

public int getUser_login_id() {
	return user_login_id;
}
public void setUser_login_id(int user_login_id) {
	this.user_login_id = user_login_id;
}
}
