package com.fsmd.service;

import java.util.List;

import com.fsmd.model.ReceptionModel;

public interface ReceptionService {
	public void addRecpt_vistor(ReceptionModel recpt) ;
	public List<ReceptionModel> listRecp_Vistor();
}
