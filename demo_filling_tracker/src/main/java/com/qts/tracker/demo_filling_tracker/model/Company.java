package com.qts.tracker.demo_filling_tracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private String ctype;
	private String cRegisterdAddress;
	private String cOperationalAddress;
	
	public Company(Integer cid, String cname, String ctype, String cRegisterdAddress,
			String cOperationalAddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
		this.cRegisterdAddress = cRegisterdAddress;
		this.cOperationalAddress = cOperationalAddress;
	}
	
	public Company() {
		super();
	}
	
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getcRegisterdAddress() {
		return cRegisterdAddress;
	}
	public void setcRegisterdAddress(String cRegisterdAddress) {
		this.cRegisterdAddress = cRegisterdAddress;
	}
	public String getcOperationalAddress() {
		return cOperationalAddress;
	}
	public void setcOperationalAddress(String cOperationalAddress) {
		this.cOperationalAddress = cOperationalAddress;
	}
	

	
	
}
