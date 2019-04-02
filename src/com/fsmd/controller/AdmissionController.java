package com.fsmd.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fsmd.bean.AdmissionBean;
import com.fsmd.model.AdmissionModel;
import com.fsmd.service.AdmissionService;

@Controller
public class AdmissionController {

	@Autowired
	private AdmissionService admisnserv;
	
	@RequestMapping(value = "/admsnhome")
	public ModelAndView admsnpage(@ModelAttribute("admsnhome")@Valid final AdmissionBean admsnbean,
	        BindingResult result, HttpSession session,Errors errors){  
		
		 return new ModelAndView("AdmissionHome","command",admsnbean); 
	}
	
	
	@RequestMapping(value = "/admsnAdd")
	public ModelAndView admsnAdd(@ModelAttribute("admsnhome")@Valid final AdmissionBean admsnbean,
	        BindingResult result, HttpSession session,Errors errors){
		
		admsnbean.setAdmsn_flg(true);
		admisnserv.addAdmission(prepareAdmisisonbean(admsnbean));
		 return new ModelAndView("AdmissionHome","command",admsnbean); 
	}
	
	
	@RequestMapping(value="/admisnview", method = RequestMethod.GET)
	public ModelAndView listAdmission(){
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("admisnview",admisnserv.admissionList());
		
		return new ModelAndView("AdmissionView", model);
	}
	
	
	private AdmissionModel prepareAdmisisonbean(AdmissionBean bean){
		AdmissionModel modell=new AdmissionModel();
		

			modell.setAdmsn_id(bean.getAdmsn_id());
			
			modell.setAdmsn_pat_id(bean.getAdmsn_pat_id());
			
			modell.setAdmsn_by(bean.getAdmsn_by());
			
			modell.setAdmsn_date(bean.getAdmsn_date());
			
			modell.setAdmsn_mdate(bean.getAdmsn_mdate());
			
			modell.setAdmsn_bed(bean.getAdmsn_bed());
			
			modell.setAdmsn_wrd(bean.getAdmsn_wrd());
			
			modell.setAdmsn_room(bean.getAdmsn_room());
			
			modell.setAdmsn_flg(bean.isAdmsn_flg());
			modell.setAdmsn_type(bean.getAdmsn_type());
		
		return modell;
	}
}
