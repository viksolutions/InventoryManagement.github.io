package com.fsmd.service;

import java.util.List;

import com.fsmd.bean.IndentBean;
import com.fsmd.model.IndentModel;
import com.fsmd.model.ItemModel;

public interface IndentService {
	public void addEmployee(IndentModel inden);
	public List<IndentModel> listIndent();
	public IndentModel getIndent(int ind_id) ;
	public void deleteIndent(IndentModel inden);
	public List<ItemModel> listItem();
	public List<IndentModel> listIndentApproved();
	public List<IndentModel> listIndenttoApprove();
	public List<IndentModel> listIndentReceived();
	public void approveIndent(IndentModel inden);
	public void forapproveIndent(IndentModel inden) ;
	public void receiveIndent(IndentModel inden) ;
	public List<IndentBean> listAvailblePharStocks() ;
	public List<IndentBean> listAvailblePharWHStocks();
	public List<IndentBean> listAvailbleStocks() ;
}
