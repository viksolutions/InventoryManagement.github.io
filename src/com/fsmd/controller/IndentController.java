package com.fsmd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fsmd.bean.IndentBean;
import com.fsmd.model.IndentModel;
import com.fsmd.model.ItemModel;
import com.fsmd.service.IndentService;

@Controller
public class IndentController {
	@Autowired
	private IndentService indserv;
	@RequestMapping(value = "/indhome")
	public ModelAndView indentpage(@ModelAttribute("indhome")@Valid final IndentBean indbean,
	        BindingResult result, HttpSession session,Errors errors){  
		//Map<String, Object> model = new HashMap<String, Object>();
		//model.put("itemAjax", indserv.listItem());
		 return new ModelAndView("IndentHome","command",indbean); 
	}
	@RequestMapping(value = "/indAdd")
	public ModelAndView indentAdd(@ModelAttribute("indhome")@Valid final IndentBean indbean,
	        BindingResult result, HttpSession session,Errors errors){
		System.out.println("getInd_id::"+indbean.getInd_item_id());
		System.out.println("getInd_from_dept::"+indbean.getInd_from_dept());
		System.out.println("getInd_to_dept::"+indbean.getInd_to_dept());
		System.out.println("getInd_quantity::"+indbean.getInd_quantity());
		System.out.println("getInd_date::"+indbean.getInd_date());
		
		indserv.addEmployee(prepareIndenBean( indbean));
		 return new ModelAndView("IndentHome","command",indbean); 
	}
	
	@RequestMapping(value="/indentview", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("indentview", indserv.listIndent() );
		model.put("indentview1", indserv.listIndentApproved() );
		
		return new ModelAndView("Indentview", model);
	}
	
	@RequestMapping(value = "/availstkphyWH", method = RequestMethod.GET)
	public ModelAndView availstk_phyWH() {
			Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("availstk_pharWH", indserv.listAvailblePharWHStocks());
		
		return new ModelAndView("AvailStockphware", model);
	}
	
	@RequestMapping(value = "/availstkphy", method = RequestMethod.GET)
	public ModelAndView availstk_phy() {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("availstk_phar", indserv.listAvailblePharStocks());
		
		return new ModelAndView("AvailableStock_Phar", model);
	}
	
	@RequestMapping(value = "/availstk", method = RequestMethod.GET)
	public ModelAndView availstk() {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("availstk", indserv.listAvailbleStocks());
		
		return new ModelAndView("AvailableStk", model);
	}
	
	
	
	@RequestMapping(value="/approvl", method = RequestMethod.GET)
	public ModelAndView listOfApprovals() {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("approvalview", indserv.listIndenttoApprove() );
		
		
		return new ModelAndView("Approvals", model);
	}
	
	@RequestMapping(value = "/approve")
	public ModelAndView indentApprove(@ModelAttribute("indhome") @Valid final IndentBean indbean,
	        BindingResult result, HttpSession session,Errors errors){
		
		System.out.println("getInd_id::"+indbean.getInd_id());
	
		indserv.approveIndent(prepareIndenBean(indbean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("approvalview", indserv.listIndenttoApprove() );
		return new ModelAndView("Approvals", model);
	}
	
	@RequestMapping(value = "/recive")
	public ModelAndView indentReceive(@ModelAttribute("indhome") @Valid final IndentBean indbean,
	        BindingResult result, HttpSession session,Errors errors){
		
		System.out.println("getInd_id::"+indbean.getInd_id());
	
		indserv.receiveIndent(prepareIndenBean(indbean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("indentview", indserv.listIndent() );
		model.put("indentview1", indserv.listIndentApproved());
		return new ModelAndView("Indentview", model);
	}
	
	@RequestMapping(value = "/toapprove")
	public ModelAndView indentForApprove(@ModelAttribute("indhome") @Valid final IndentBean indbean,
	        BindingResult result, HttpSession session,Errors errors){
		
		System.out.println("getInd_id::"+indbean.getInd_id());
	
		indserv.forapproveIndent(prepareIndenBean(indbean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("indentview", indserv.listIndent() );
		model.put("indentview1", indserv.listIndentApproved());
		return new ModelAndView("Indentview", model);
	}
	
	 @ModelAttribute("itemAjax")
	   public List<ItemModel>  listItems() {
		  return indserv.listItem();
	   }
	
	private IndentModel prepareIndenBean(IndentBean bean){
		IndentModel modell=new IndentModel();
		

			modell.setInd_id(bean.getInd_id());
			
			modell.setInd_item_id(bean.getInd_item_id());
			
			modell.setInd_from_dept(bean.getInd_from_dept());
			
			modell.setInd_to_dept(bean.getInd_to_dept());
			
			modell.setIndent_by(bean.getIndent_by());
			
			modell.setInd_approve_by(bean.getInd_approve_by());
			
			modell.setInd_status(bean.getInd_status());
			
			modell.setInd_quantity(bean.getInd_quantity());
			
			modell.setInd_date(bean.getInd_date());
			
			modell.setInd_org(bean.getInd_org());
			
			
		
		return modell;
	}
	
	
	
	/*private List<IndentBean> prepareListofBean(List<IndentModel> list){
		List<IndentBean> beans = null;
		if(list != null && !list.isEmpty()){
			
			beans = new ArrayList<IndentBean>();
			IndentBean bean = null;
			for(IndentModel logmod : list){
				bean = new IndentBean();
				bean.setInd_id(logmod.getInd_id());
				
				bean.setInd_item_id(logmod.getInd_item_id());
				
				bean.setInd_from_dept(logmod.getInd_from_dept());
				
				bean.setInd_to_dept(logmod.getInd_to_dept());
				
				bean.setIndent_by(logmod.getIndent_by());
				
				bean.setInd_approve_by(logmod.getInd_approve_by());
				
				bean.setInd_status(logmod.getInd_status());
				
				bean.setInd_quantity(logmod.getInd_quantity());
				
				bean.setInd_date(logmod.getInd_date());
				
				bean.setInd_org(logmod.getInd_org());
				
				beans.add(bean);
				
			}
		}
		return beans;
	}*/
}
