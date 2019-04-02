package com.fsmd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsmd.bean.IndentBean;
import com.fsmd.model.IndentModel;
import com.fsmd.model.ReceptionModel;

@Repository("receptionDAO")
public class ReceptionDAOImpl implements ReceptionDAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	public void addRecpt_vistor(ReceptionModel recpt) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(recpt);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<ReceptionModel> listRecp_Vistor() {
		  List<ReceptionModel> selectedlist=new ArrayList<ReceptionModel>();	
		  selectedlist= sessionFactory.getCurrentSession().createQuery("FROM ReceptionModel").list(); 
		 //String sql="select recp_id,recptnist_id,visitor_name,visitor_comm_details,visit_purpose,visit_id,visit_date from tb_reception";
		   //selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(ReceptionModel.class)).list();	
		   return selectedlist;
	}
}
