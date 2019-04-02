package com.fsmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about() {
		return new ModelAndView("About_us");
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homepage() {
		return new ModelAndView("Home");
	}
	
	@RequestMapping(value = "/succeshome", method = RequestMethod.GET)
	public ModelAndView modulepage() {
		return new ModelAndView("Success");
	}

	@RequestMapping(value = "/founder", method = RequestMethod.GET)
	public ModelAndView founderpage() {
		return new ModelAndView("Founderr");
	}
	
	@RequestMapping(value = "/recptionhm", method = RequestMethod.GET)
	public ModelAndView receptionPage() {
		return new ModelAndView("Receptionhome");
	}
	
	@RequestMapping(value = "/billinhm", method = RequestMethod.GET)
	public ModelAndView billingPage() {
		return new ModelAndView("BillingHome");
	}
	@RequestMapping(value = "/doctorhm", method = RequestMethod.GET)
	public ModelAndView doctrPage() {
		return new ModelAndView("DoctorHome");
	}
	@RequestMapping(value = "/apptmt", method = RequestMethod.GET)
	public ModelAndView apptPage() {
		return new ModelAndView("Appointments");
	}
	@RequestMapping(value = "/pharmcy", method = RequestMethod.GET)
	public ModelAndView pharmPage() {
		return new ModelAndView("Pharmacy");
	}
	@RequestMapping(value = "/pharmcywh", method = RequestMethod.GET)
	public ModelAndView pharmwhPage() {
		return new ModelAndView("PharmacyWarehouse");
	}
	
	@RequestMapping(value = "/stckmgmt", method = RequestMethod.GET)
	public ModelAndView stckPage() {
		return new ModelAndView("StockManangement");
	}
	
	@RequestMapping(value = "/assetmgmt", method = RequestMethod.GET)
	public ModelAndView assetPage() {
		return new ModelAndView("AssetManangement");
	}
	@RequestMapping(value = "/staffmgmt", method = RequestMethod.GET)
	public ModelAndView staffPage() {
		return new ModelAndView("StaffManangement");
	}
	@RequestMapping(value = "/housekeep", method = RequestMethod.GET)
	public ModelAndView houseKeepPage() {
		return new ModelAndView("HouseKeeping");
	}
	
	@RequestMapping(value = "/linenmgmt", method = RequestMethod.GET)
	public ModelAndView linenPage() {
		return new ModelAndView("LinenManagement");
	}
	
	@RequestMapping(value = "/ot", method = RequestMethod.GET)
	public ModelAndView otPage() {
		return new ModelAndView("OperationTheater");
	}
	
	@RequestMapping(value = "/ward", method = RequestMethod.GET)
	public ModelAndView wardPage() {
		return new ModelAndView("WardManagement");
	}
	
	@RequestMapping(value = "/lab", method = RequestMethod.GET)
	public ModelAndView labPage() {
		return new ModelAndView("LabManagement");
	}
	
	@RequestMapping(value = "/saffty", method = RequestMethod.GET)
	public ModelAndView saftyPage() {
		return new ModelAndView("SafetyManagement");
	}
	
	
	@RequestMapping(value = "/availstkwh", method = RequestMethod.GET)
	public ModelAndView availstk_wh() {
		return new ModelAndView("AvailStockphware");
	}
	
	@RequestMapping(value = "/contct", method = RequestMethod.GET)
	public ModelAndView contct() {
		return new ModelAndView("Contact");
	}
	@RequestMapping(value = "/helps", method = RequestMethod.GET)
	public ModelAndView helps() {
		return new ModelAndView("Help");
	}
}
