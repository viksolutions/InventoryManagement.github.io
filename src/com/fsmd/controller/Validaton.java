package com.fsmd.controller;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.fsmd.bean.LoginBean;
import com.fsmd.dao.LoginDAO;
import com.fsmd.model.LoginModel;
@Component
public class Validaton implements Validator {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	/*@SuppressWarnings("unchecked")
	public List<LoginModel> listUser() {
		return (List<LoginModel>) sessionFactory.getCurrentSession().createCriteria(LoginModel.class).list();
	}*/
	
	
	
	 @Override
	    public boolean supports(Class<?>  clazz) {
	        return LoginBean.class.isAssignableFrom(clazz);
	    }
	 private HibernateTemplate hibernateTemplate;
	
	 public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	private static Logger log = Logger.getLogger(Validaton.class);
	 @Override
	 public void validate(Object obj, Errors errors) {
	    	
		
		LoginBean login = (LoginBean) obj; 
			
	String sqlQuery="select login_id,login_password from tb_user where login_id=?,login_password=?";
	String user="";
	String pwd="";
	        try {
	        	//LoginDAO logg=new LoginDAO();
	        	
	        	//System.out.println("userlist::"+logg.listEmployeess().size());
	        	
	        	 Session session=sessionFactory.getCurrentSession();
	        	System.out.println("getlogin_id::"+login.getLogin_id()+"getlogin_pass::"+login.getLogin_password());
	        	 Criteria cr = session.createCriteria(LoginModel.class);
	        	 cr.add(Restrictions.isNull("user_login_id"));
	        	 cr.add(Restrictions.isNull("login_id"));
	        	 cr.add(Restrictions.isNull("login_password"));
	        	 System.out.println("yess");
	        	 cr.add(Restrictions.gt("login_id", login.getLogin_id()));
	        	 cr.add(Restrictions.gt("login_password", login.getLogin_password()));
	        	
	        	 
	        	 List lst = cr.list();

	             for (Iterator iterator = lst.iterator(); iterator.hasNext();){
	            	 LoginModel userr = (LoginModel) iterator.next(); 
	                System.out.print("First Name: " + userr.getLogin_id()); 
	                System.out.print("  Last Name: " + userr.getLogin_password()); 
	                 
	             }
	        } catch(Exception e) {

	         e.printStackTrace();

	            log.error("An error occurred while fetching the user details from the database", e);    

	        }
		 
		 
		 
		 
	        if (login.getLogin_id() == null || login.getLogin_id().length() == 0) {
	            errors.rejectValue("login_id", "login.login_id", "Please Enter User Name");
	            
	        }
	        else if (!login.getLogin_id().equals(user)) {
	            errors.rejectValue("login_id", "login.login_id", "Unknown User");
	        }
	        if (login.getLogin_password() == null || login.getLogin_password().length() == 0) {
	            errors.rejectValue("login_password", "login.login_password", "Please Enter Password");
	        } 
	        else if (!login.getLogin_password().equals(pwd)) {
	            errors.rejectValue("login_password", "login.password", "Wrong Password");
	        }      
	        
	    }
}
