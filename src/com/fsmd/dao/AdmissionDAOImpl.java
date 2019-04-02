package com.fsmd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsmd.bean.IndentBean;
import com.fsmd.model.AdmissionModel;
import com.fsmd.model.IndentModel;
@Repository("admissionDAO")
public class AdmissionDAOImpl implements AdmissionDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public void addAdmission(AdmissionModel recpt) {
		sessionFactory.getCurrentSession().saveOrUpdate(recpt);
	}

	@SuppressWarnings("unchecked")
	public List<AdmissionModel> admissionList() {
		  List<AdmissionModel> selectedlist=new ArrayList<AdmissionModel>();	
		  selectedlist= sessionFactory.getCurrentSession().createQuery("FROM AdmissionModel").list(); 	
		   return selectedlist;
	}
	

}
