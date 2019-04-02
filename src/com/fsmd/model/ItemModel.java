package com.fsmd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_item_master")
public class ItemModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "item_id")	
private int item_id;

@Column(name = "item_name")
private String item_name;

@Column(name = "item_type")
private int item_type;

@Column(name = "item_dept")
private int item_dept;

@Column(name = "item_org")
private int item_org;

@Column(name = "item_status")
private int item_status;


public int getItem_id() {
	return item_id;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}
public String getItem_name() {
	return item_name;
}
public void setItem_name(String item_name) {
	this.item_name = item_name;
}
public int getItem_type() {
	return item_type;
}
public void setItem_type(int item_type) {
	this.item_type = item_type;
}
public int getItem_dept() {
	return item_dept;
}
public void setItem_dept(int item_dept) {
	this.item_dept = item_dept;
}
public int getItem_org() {
	return item_org;
}
public void setItem_org(int item_org) {
	this.item_org = item_org;
}
public int getItem_status() {
	return item_status;
}
public void setItem_status(int item_status) {
	this.item_status = item_status;
}


}
