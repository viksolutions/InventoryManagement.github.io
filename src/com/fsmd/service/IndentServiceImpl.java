package com.fsmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fsmd.bean.IndentBean;
import com.fsmd.dao.IndentDAO;
import com.fsmd.model.IndentModel;
import com.fsmd.model.ItemModel;

@Service("indentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class IndentServiceImpl implements IndentService {
	@Autowired
	private IndentDAO indenDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(IndentModel inden) {
		indenDao.addIndent(inden);
	}
	
	public List<IndentModel> listIndent(){
		return indenDao.listIndent();
	}

	public IndentModel getIndent(int ind_id) {
		return indenDao.getIndent(ind_id);
	}
	
	public void deleteIndent(IndentModel inden) {
		indenDao.deleteIndent(inden);
	}

	public List<ItemModel> listItem(){
		
		
		return  indenDao.listItem();
		
	}
	
	public List<IndentModel> listIndenttoApprove(){
		return indenDao.listIndenttoApprove();
	
	}
	
	public List<IndentModel> listIndentApproved(){
		return indenDao.listIndentApproved();
	
	}
	
	public List<IndentModel> listIndentReceived(){
		return indenDao.listIndentReceived();
	
	}
	
	public List<IndentBean> listAvailblePharStocks(){
		return indenDao.listAvailblePharStocks();
	
	}
	
	
	public List<IndentBean> listAvailblePharWHStocks(){
		return indenDao.listAvailblePharWHStocks();
	
	}
	public List<IndentBean> listAvailbleStocks() {
	return indenDao.listAvailbleStocks();
	
}
	
	public void approveIndent(IndentModel inden){indenDao.approveIndent(inden);}
	public void forapproveIndent(IndentModel inden) {indenDao.forapproveIndent(inden);}
	public void receiveIndent(IndentModel inden) {indenDao.receiveIndent(inden);}
}
