package com.fsmd.service;

import java.util.List;

import com.fsmd.model.AdmissionModel;

public interface AdmissionService {
	public void addAdmission(AdmissionModel recpt) ;
	public List<AdmissionModel> admissionList();
}
