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



import com.fsmd.bean.Receptionbean;
import com.fsmd.model.ReceptionModel;
import com.fsmd.service.ReceptionService;

@Controller
public class ReceptionController {
	@Autowired
	private ReceptionService receptserv;
	
	@RequestMapping(value = "/recptnhome")
	public ModelAndView indentpage(@ModelAttribute("recptnhome")@Valid final Receptionbean indbean,
	        BindingResult result, HttpSession session,Errors errors){  
		
		 return new ModelAndView("Receptionhome","command",indbean); 
	}
	
	
	@RequestMapping(value = "/recptAdd")
	public ModelAndView indentAdd(@ModelAttribute("recptnhome")@Valid final Receptionbean recptbean,
	        BindingResult result, HttpSession session,Errors errors){
		
		
		receptserv.addRecpt_vistor(prepareReceptionbean(recptbean));
		 return new ModelAndView("Receptionhome","command",recptbean); 
	}
	
	
	@RequestMapping(value="/vistorsview", method = RequestMethod.GET)
	public ModelAndView listEmployees(){
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("receptview",receptserv.listRecp_Vistor());
		
		return new ModelAndView("ReceptionList", model);
	}
	
	
	private ReceptionModel prepareReceptionbean(Receptionbean bean){
		ReceptionModel modell=new ReceptionModel();
		

			modell.setRecp_id(bean.getRecp_id());
			
			modell.setRecptnist_id(bean.getRecptnist_id());
			
			modell.setVisit_id(bean.getVisit_id());
			
			modell.setVisit_purpose(bean.getVisit_purpose());
			
			modell.setVisitor_comm_details(bean.getVisitor_comm_details());
			
			modell.setVisitor_name(bean.getVisitor_name());
			
			modell.setVisit_date(bean.getVisit_date());
			
			modell.setModified_date(bean.getModified_date());
			
		
		return modell;
	}
	
	
}
