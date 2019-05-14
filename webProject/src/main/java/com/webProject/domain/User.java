package com.webProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable=false, length=20)
	private String user_id;
	
	private String user_nm;
	private String post_no;
	private String addr;
	private String email;
	private String mobile_no;
	private String tel_no;
	private String vip_type;
	private String buy_pnt;
	private String reg_dt;
	private String upt_dt;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_nm() {
		return user_nm;
	}
	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}
	public String getPost_no() {
		return post_no;
	}
	public void setPost_no(String post_no) {
		this.post_no = post_no;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getTel_no() {
		return tel_no;
	}
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}
	public String getVip_type() {
		return vip_type;
	}
	public void setVip_type(String vip_type) {
		this.vip_type = vip_type;
	}
	public String getBuy_pnt() {
		return buy_pnt;
	}
	public void setBuy_pnt(String buy_pnt) {
		this.buy_pnt = buy_pnt;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getUpt_dt() {
		return upt_dt;
	}
	public void setUpt_dt(String upt_dt) {
		this.upt_dt = upt_dt;
	}

	

}
