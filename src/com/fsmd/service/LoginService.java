package com.fsmd.service;

import java.util.List;

import com.fsmd.bean.LoginBean;
import com.fsmd.model.LoginModel;

public interface LoginService {
	public List<LoginModel> listUser();
	public LoginModel getUser(LoginModel users,LoginBean available);
}
