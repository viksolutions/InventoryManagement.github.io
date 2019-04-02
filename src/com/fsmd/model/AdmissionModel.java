package com.fsmd.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_admission")
public class AdmissionModel implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "admsn_id")
	private int admsn_id;
	
	@Column(name = "admsn_pat_id")
	private int admsn_pat_id;
	
	@Column(name = "admsn_by")
	private int admsn_by;
	
	@Column(name = "admsn_date")
	private Date admsn_date;
	
	@Column(name = "admsn_type")
	private String admsn_type;
	
	@Column(name = "admsn_mdate")
	private Date admsn_mdate;
	
	@Column(name = "admsn_bed")
	private int admsn_bed;
	
	@Column(name = "admsn_wrd")
	private int admsn_wrd;
	
	@Column(name = "admsn_room")
	private int admsn_room;
	
	@Column(name = "admsn_flg")
	private boolean admsn_flg;
	
	public int getAdmsn_id() {
		return admsn_id;
	}
	public void setAdmsn_id(int admsn_id) {
		this.admsn_id = admsn_id;
	}
	public int getAdmsn_pat_id() {
		return admsn_pat_id;
	}
	public void setAdmsn_pat_id(int admsn_pat_id) {
		this.admsn_pat_id = admsn_pat_id;
	}
	public int getAdmsn_by() {
		return admsn_by;
	}
	public void setAdmsn_by(int admsn_by) {
		this.admsn_by = admsn_by;
	}
	public Date getAdmsn_date() {
		return admsn_date;
	}
	public void setAdmsn_date(Date admsn_date) {
		this.admsn_date = admsn_date;
	}
	public String getAdmsn_type() {
		return admsn_type;
	}
	public void setAdmsn_type(String admsn_type) {
		this.admsn_type = admsn_type;
	}
	public Date getAdmsn_mdate() {
		return admsn_mdate;
	}
	public void setAdmsn_mdate(Date admsn_mdate) {
		this.admsn_mdate = admsn_mdate;
	}
	public int getAdmsn_bed() {
		return admsn_bed;
	}
	public void setAdmsn_bed(int admsn_bed) {
		this.admsn_bed = admsn_bed;
	}
	public int getAdmsn_wrd() {
		return admsn_wrd;
	}
	public void setAdmsn_wrd(int admsn_wrd) {
		this.admsn_wrd = admsn_wrd;
	}
	public int getAdmsn_room() {
		return admsn_room;
	}
	public void setAdmsn_room(int admsn_room) {
		this.admsn_room = admsn_room;
	}
	public boolean isAdmsn_flg() {
		return admsn_flg;
	}
	public void setAdmsn_flg(boolean admsn_flg) {
		this.admsn_flg = admsn_flg;
	}

}
