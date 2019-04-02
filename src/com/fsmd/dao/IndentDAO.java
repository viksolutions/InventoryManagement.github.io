package com.fsmd.dao;

import java.util.List;

import com.fsmd.bean.IndentBean;
import com.fsmd.model.IndentModel;
import com.fsmd.model.ItemModel;

public interface IndentDAO  {
	public void addIndent(IndentModel inden) ;
	public List<IndentModel> listIndent() ;
	public IndentModel getIndent(int indenId);
	public void deleteIndent(IndentModel inden);
	public List<ItemModel> listItem();
	public List<IndentModel> listIndentApproved();
	public List<IndentModel> listIndenttoApprove();
	public List<IndentModel> listIndentReceived() ;
	public void approveIndent(IndentModel inden);
	public void forapproveIndent(IndentModel inden) ;
	public void receiveIndent(IndentModel inden) ;
	public List<IndentBean> listAvailblePharStocks() ;
	List<IndentBean> listAvailblePharWHStocks();
	public List<IndentBean> listAvailbleStocks() ;
}
