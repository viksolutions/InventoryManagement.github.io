package com.fsmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fsmd.dao.ReceptionDAO;
import com.fsmd.model.ReceptionModel;

@Service("receptionService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ReceptionServiceImpl implements ReceptionService {
	@Autowired
	private ReceptionDAO receptionDao;

	@Override
	public void addRecpt_vistor(ReceptionModel recpt) {
		receptionDao.addRecpt_vistor(recpt);
		
	}

	@Override
	public List<ReceptionModel> listRecp_Vistor() {
		// TODO Auto-generated method stub
		 	return receptionDao.listRecp_Vistor();
	}
	
	
}
