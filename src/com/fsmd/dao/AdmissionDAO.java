package com.fsmd.dao;

import java.util.List;

import com.fsmd.model.AdmissionModel;

public interface AdmissionDAO {
	public void addAdmission(AdmissionModel recpt) ;
	public List<AdmissionModel> admissionList();

}
