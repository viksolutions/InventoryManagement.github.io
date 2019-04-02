package com.fsmd.dao;

import java.util.List;

import com.fsmd.bean.LoginBean;
import com.fsmd.model.LoginModel;

public interface LoginDAO {

	public List<LoginModel> ListUser() ;
	public LoginModel getUser(LoginModel users,LoginBean available);
}
