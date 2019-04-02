package com.fsmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fsmd.bean.LoginBean;
import com.fsmd.dao.LoginDAO;
import com.fsmd.model.LoginModel;

@Service("loginService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	public List<LoginModel> listUser() {
		return loginDAO.ListUser();
	}
	public LoginModel getUser(LoginModel users,LoginBean available) {
		return loginDAO.getUser(users,available);
	}
}
