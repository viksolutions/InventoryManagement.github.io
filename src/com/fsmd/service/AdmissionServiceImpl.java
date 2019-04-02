package com.fsmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fsmd.dao.AdmissionDAO;
import com.fsmd.model.AdmissionModel;
@Service("admissionService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AdmissionServiceImpl implements AdmissionService {

	@Autowired
	private AdmissionDAO admissionDAO;
	@Override
	public void addAdmission(AdmissionModel recpt) {
		admissionDAO.addAdmission(recpt);
		
	}

	@Override
	public List<AdmissionModel> admissionList() {
		// TODO Auto-generated method stub
		return admissionDAO.admissionList();
	}

}
