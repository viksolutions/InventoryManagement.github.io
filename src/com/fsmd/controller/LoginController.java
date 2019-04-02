package com.fsmd.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fsmd.bean.LoginBean;
import com.fsmd.model.LoginModel;
import com.fsmd.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
/*	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView LoginUser(@ModelAttribute("command")  LoginBean loginBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee", prepareUserBean(loginService.getUser(loginBean.getLogin_id())));
		model.put("employee", prepareUserBean(loginService.getUser(loginBean.getLogin_password())));
		return new ModelAndView("Login", model);
	}*/
	@RequestMapping(value="/usersss", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("usersss",  prepareListofBean(loginService.listUser()));
		return new ModelAndView("userList", model);
	}
	
	private LoginModel prepareUserBean(LoginBean bean){
		LoginModel modell=new LoginModel();
		System.out.println(bean.getLogin_id());
		modell.setLogin_id(bean.getLogin_id());
		modell.setLogin_password(bean.getLogin_password());
		
		return modell;
	}
	
	
		private List<LoginBean> prepareListofBean(List<LoginModel> list){
			List<LoginBean> beans = null;
			if(list != null && !list.isEmpty()){
				
				beans = new ArrayList<LoginBean>();
				LoginBean bean = null;
				for(LoginModel logmod : list){
					bean = new LoginBean();
					bean.setLogin_id(logmod.getLogin_id());
					bean.setLogin_password(logmod.getLogin_password());
					
					beans.add(bean);
					
				}
			}
			return beans;
		}
	

		 @RequestMapping("/ShowLogin")  
		    public ModelAndView viewemp1(@ModelAttribute("ShowLogin")@Valid final LoginBean login,
			        BindingResult result, HttpSession session,Errors errors){  
			 
		        return new ModelAndView("Login","command",login);  
		    }  	
		
		
	@RequestMapping(value = "/Login")  
	   public ModelAndView viewemp2( @ModelAttribute("Login")@Valid final LoginBean login,
	        BindingResult result, HttpSession session) { 
		ModelAndView model   = new ModelAndView("Login","command",login);
	
		LoginModel logmod=	prepareUserBean(login);
		
		loginService.getUser(logmod,login);

	if(login.isUserExist()==true){
		System.out.println("User  Available");
		  return new ModelAndView("Success","Message","Logged in Success"); 
	}
	
		 System.out.println("User Not Available Double Check UserName and Password");
		  return model;
		  
	  } 
	
}
