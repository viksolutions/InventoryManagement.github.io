package com.fsmd.dao;


import java.security.MessageDigest;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsmd.bean.LoginBean;
import com.fsmd.model.LoginModel;
@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO  {
	@Autowired
	private SessionFactory sessionFactory;
		@SuppressWarnings("unchecked")
		public List<LoginModel> ListUser() {
			return (List<LoginModel>) sessionFactory.getCurrentSession().createCriteria(LoginModel.class).list();
		}
		
		
		public LoginModel getUser(LoginModel users,LoginBean available){
			List lst=null;
			 
			LoginModel Member = null;
			
			
			try{
				
				
				Criteria criteria = sessionFactory
				        .getCurrentSession().createCriteria(LoginModel.class);
				    criteria.add(Expression.eq("login_id", users.getLogin_id()));
				    
				    
				    //String strip =  users.getLogin_password();        
				    String strip = encryptPassword(users.getLogin_password()) ;
				     
				    criteria.add(Expression.eq("login_password", strip));

				     Member=(LoginModel) criteria.uniqueResult();
				     if (criteria != null) {	
							lst = criteria.list();
						}
				    if(lst.isEmpty()){
				    	available.setUserExist(false);
				    	
				    }else{
				    	available.setUserExist(true);
				    }
			
				
			}catch(Exception e){e.printStackTrace();}
			 return Member;
			
		
}
		
		public static String encryptPassword(String data) 
		{
			StringBuffer sb = new StringBuffer();

			try {
				MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
				messageDigest.update(data.getBytes("UTF-8"));
				byte[] digestBytes = messageDigest.digest();
				//         sb.append(digestBytes.toString());


				String hex = null;

				for (int i = 0; i < digestBytes.length; i++) {
					//Convert it to positive integer and then to Hex String

					hex = Integer.toHexString(0xFF & digestBytes[i]);

					//Append "0" to the String to made it exactly 128 length (SHA-512 algorithm)
					if (hex.length() < 2) 
						sb.append("0");
					sb.append(hex);
				}

			}
			catch (Exception ex) {
				ex.printStackTrace();
			}

			return new String(sb);
		}
}