package com.fsmd.bean;

import java.sql.Date;

public class Receptionbean {
	
private int recp_id;
private int recptnist_id;
private String visitor_name;
private String visitor_comm_details;
private String visit_purpose;
private int visit_id;
private String visit_date;
private String modified_date;

public int getRecp_id() {
	return recp_id;
}
public void setRecp_id(int recp_id) {
	this.recp_id = recp_id;
}
public int getRecptnist_id() {
	return recptnist_id;
}
public void setRecptnist_id(int recptnist_id) {
	this.recptnist_id = recptnist_id;
}
public String getVisitor_name() {
	return visitor_name;
}
public void setVisitor_name(String visitor_name) {
	this.visitor_name = visitor_name;
}
public String getVisitor_comm_details() {
	return visitor_comm_details;
}
public void setVisitor_comm_details(String visitor_comm_details) {
	this.visitor_comm_details = visitor_comm_details;
}
public String getVisit_purpose() {
	return visit_purpose;
}
public void setVisit_purpose(String visit_purpose) {
	this.visit_purpose = visit_purpose;
}
public int getVisit_id() {
	return visit_id;
}
public void setVisit_id(int visit_id) {
	this.visit_id = visit_id;
}
public String getVisit_date() {
	return visit_date;
}
public void setVisit_date(String visit_date) {
	this.visit_date = visit_date;
}
public String getModified_date() {
	return modified_date;
}
public void setModified_date(String modified_date) {
	this.modified_date = modified_date;
}
}
