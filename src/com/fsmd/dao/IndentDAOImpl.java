package com.fsmd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsmd.bean.IndentBean;
import com.fsmd.model.IndentModel;
import com.fsmd.model.ItemModel;

@Repository("indentDAO")
public class IndentDAOImpl implements IndentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addIndent(IndentModel inden) {
		sessionFactory.getCurrentSession().saveOrUpdate(inden);
	}

	@SuppressWarnings("unchecked")
	public List<IndentModel> listIndent() {
		  List<IndentModel> selectedlist=new ArrayList<IndentModel>();	
		 String sql="select a.ind_id,a.ind_item_id,a.ind_quantity,b.item_name,(select dept_name from tb_department where a.ind_from_dept=dept_id)from_dept_name,(select dept_name from tb_department where a.ind_to_dept=dept_id)to_dept_name,a.ind_date  from tb_indent a,tb_item_master b where a.ind_item_id= b.item_id and a.ind_status='0'";
		   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();	
		   return selectedlist;
	}
	@SuppressWarnings("unchecked")
	public List<IndentModel> listIndentApproved() {
		  List<IndentModel> selectedlist=new ArrayList<IndentModel>();	
		 String sql="select a.ind_id,a.ind_item_id,a.ind_quantity,b.item_name,(select dept_name from tb_department where a.ind_from_dept=dept_id)from_dept_name,(select dept_name from tb_department where a.ind_to_dept=dept_id)to_dept_name,a.ind_date  from tb_indent a,tb_item_master b where a.ind_item_id= b.item_id and a.ind_status='2'";
		   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();	
		   return selectedlist;
	}
	@SuppressWarnings("unchecked")
	public List<IndentModel> listIndenttoApprove() {
		  List<IndentModel> selectedlist=new ArrayList<IndentModel>();	
		 String sql="select a.ind_id,a.ind_item_id,a.ind_quantity,b.item_name,(select dept_name from tb_department where a.ind_from_dept=dept_id)from_dept_name,(select dept_name from tb_department where a.ind_to_dept=dept_id)to_dept_name,a.ind_date  from tb_indent a,tb_item_master b where a.ind_item_id= b.item_id and a.ind_status='1'";
		   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();	
		   return selectedlist;
	}
	@SuppressWarnings("unchecked")
	public List<IndentModel> listIndentReceived() {
		  List<IndentModel> selectedlist=new ArrayList<IndentModel>();	
		String sql="select a.ind_id,a.ind_item_id,a.ind_quantity,b.item_name,(select dept_name from tb_department where a.ind_from_dept=dept_id)from_dept_name,(select dept_name from tb_department where a.ind_to_dept=dept_id)to_dept_name,a.ind_date  from tb_indent a,tb_item_master b where a.ind_item_id= b.item_id and a.ind_status='3'";
		   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();	
		   return selectedlist;
	}
	
	@SuppressWarnings("unchecked")
	public List<IndentBean> listAvailblePharStocks() {
		List<IndentBean> selectedlist=null;
		try{
	selectedlist=new ArrayList<IndentBean>();	
		 //String sql="select a.ind_quantity ,a.ind_item_id,b.item_name,a.ind_id,(select dept_name from tb_department where a.ind_to_dept=dept_id)to_dept_name from tb_indent a,tb_item_master b where a.ind_item_id= b.item_id and a.ind_status='3' and a.ind_to_dept='1'  group by   a.ind_item_id";
	     String sql="select sum(a.ind_quantity) as ind_quantity,b.item_name,c.dept_name as to_dept_name from tb_indent a,tb_item_master b,tb_department c where a.ind_item_id=b.item_id and c.dept_id=a.ind_to_dept and c.dept_id=1 and  a.ind_status='3' group by b.item_name";
		   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("item_name").addScalar("to_dept_name").addScalar("ind_quantity",Hibernate.INTEGER).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();	
	

		   return selectedlist;
		   }catch(Exception e){e.printStackTrace();}
		return selectedlist;
	}
	
	@SuppressWarnings("unchecked")
	public List<IndentBean> listAvailblePharWHStocks() {
		List<IndentBean> selectedlist=null;
		try{
	selectedlist=new ArrayList<IndentBean>();	
		 /*String sql="select a.ind_quantity ,a.ind_item_id,b.item_name,a.ind_id,(select dept_name from tb_department where a.ind_to_dept=dept_id)to_dept_name from tb_indent a,tb_item_master b where a.ind_item_id= b.item_id and a.ind_status='3' and a.ind_to_dept='2' group by   a.ind_item_id";
		   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();*/
	
	String sql="select sum(a.ind_quantity) as ind_quantity,b.item_name,c.dept_name as to_dept_name from tb_indent a,tb_item_master b,tb_department c where a.ind_item_id=b.item_id and c.dept_id=a.ind_to_dept and c.dept_id=2 and  a.ind_status='3' group by b.item_name";
	   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("item_name").addScalar("to_dept_name").addScalar("ind_quantity",Hibernate.INTEGER).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();
		   return selectedlist;
		   }catch(Exception e){e.printStackTrace();}
		return selectedlist;
	}
	
	@SuppressWarnings("unchecked")
	public List<IndentBean> listAvailbleStocks() {
		List<IndentBean> selectedlist=null;
		try{
	selectedlist=new ArrayList<IndentBean>();	
		/* String sql="select a.ind_quantity ,a.ind_item_id,b.item_name,a.ind_id,(select dept_name from tb_department where a.ind_to_dept=dept_id)to_dept_name from tb_indent a,tb_item_master b where a.ind_item_id= b.item_id and a.ind_status='3' group by   a.ind_item_id";
		   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();*/
	
	String sql="select sum(a.ind_quantity) as ind_quantity,b.item_name,c.dept_name as to_dept_name from tb_indent a,tb_item_master b,tb_department c where a.ind_item_id=b.item_id and c.dept_id=a.ind_to_dept  and  a.ind_status='3' group by b.item_name";
	   selectedlist=sessionFactory.getCurrentSession().createSQLQuery(sql).addScalar("item_name").addScalar("to_dept_name").addScalar("ind_quantity",Hibernate.INTEGER).setResultTransformer(Transformers.aliasToBean(IndentBean.class)).list();
		   return selectedlist;
		   }catch(Exception e){e.printStackTrace();}
		return selectedlist;
	}
	
	@SuppressWarnings("unchecked")
	public List<ItemModel> listItem() {
		return (List<ItemModel>) sessionFactory.getCurrentSession().createCriteria(ItemModel.class).list();
	}

	public IndentModel getIndent(int ind_id) {
		return (IndentModel) sessionFactory.getCurrentSession().get(IndentModel.class, ind_id);
	}

	public void deleteIndent(IndentModel inden) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM IndentModel WHERE ind_id = "+inden.getInd_id()).executeUpdate();
	}

	
	public void approveIndent(IndentModel inden) {
		sessionFactory.getCurrentSession().createQuery("UPDATE  IndentModel set ind_status='2' WHERE ind_id = "+inden.getInd_id()).executeUpdate();
	}
	public void forapproveIndent(IndentModel inden) {
		sessionFactory.getCurrentSession().createQuery("UPDATE  IndentModel set ind_status='1' WHERE ind_id = "+inden.getInd_id()).executeUpdate();
	}
	public void receiveIndent(IndentModel inden) {
		sessionFactory.getCurrentSession().createQuery("UPDATE  IndentModel set ind_status='3' WHERE ind_id = "+inden.getInd_id()).executeUpdate();
	}
}
