package com.fsmd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_indent")
public class IndentModel implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ind_id")
	private int ind_id;
	
	@Column(name="ind_item_id")
	private int ind_item_id;
	
	@Column(name="ind_from_dept")
	private int ind_from_dept;
	
	@Column(name="ind_to_dept")
	private int ind_to_dept;
	
	@Column(name="indent_by")
	private int indent_by;

	@Column(name="ind_approve_by")
	private int ind_approve_by;
	
	@Column(name="ind_status")
	private int ind_status;
	
	@Column(name="ind_quantity")
	private int ind_quantity;
	
	@Column(name="ind_date")
	private Date ind_date;


	public int getInd_id() {
		return ind_id;
	}
	/*public int getInd_AvailQuantity() {
		return ind_AvailQuantity;
	}
	public void setInd_AvailQuantity(int ind_AvailQuantity) {
		this.ind_AvailQuantity = ind_AvailQuantity;
	}*/
	public void setInd_id(int ind_id) {
		this.ind_id = ind_id;
	}
	public int getInd_item_id() {
		return ind_item_id;
	}
	public void setInd_item_id(int ind_item_id) {
		this.ind_item_id = ind_item_id;
	}
	public int getInd_from_dept() {
		return ind_from_dept;
	}
	public void setInd_from_dept(int ind_from_dept) {
		this.ind_from_dept = ind_from_dept;
	}
	public int getInd_to_dept() {
		return ind_to_dept;
	}
	public void setInd_to_dept(int ind_to_dept) {
		this.ind_to_dept = ind_to_dept;
	}
	public int getIndent_by() {
		return indent_by;
	}
	public void setIndent_by(int indent_by) {
		this.indent_by = indent_by;
	}
	public int getInd_approve_by() {
		return ind_approve_by;
	}
	public void setInd_approve_by(int ind_approve_by) {
		this.ind_approve_by = ind_approve_by;
	}
	public int getInd_status() {
		return ind_status;
	}
	public void setInd_status(int ind_status) {
		this.ind_status = ind_status;
	}
	public int getInd_quantity() {
		return ind_quantity;
	}
	public void setInd_quantity(int ind_quantity) {
		this.ind_quantity = ind_quantity;
	}
	public Date getInd_date() {
		return ind_date;
	}
	public void setInd_date(Date ind_date) {
		this.ind_date = ind_date;
	}
	public int getInd_org() {
		return ind_org;
	}
	public void setInd_org(int ind_org) {
		this.ind_org = ind_org;
	}
	private int ind_org;


}
