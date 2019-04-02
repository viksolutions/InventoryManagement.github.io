package com.fsmd.dao;

import java.util.List;

import com.fsmd.model.ReceptionModel;

public interface ReceptionDAO {
	public void addRecpt_vistor(ReceptionModel recpt) ;
	public List<ReceptionModel> listRecp_Vistor();
}
