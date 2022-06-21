package com.qts.tracker.demo_filling_tracker.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="companyAdmin")
public class CompanyAdmin {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int cAdminId;
	private String fullName;
	private String emailId;
	private String phNumber;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_company_id")
	private Company company;
	
		
	public CompanyAdmin(String fullName, String emailId, String phNumber, String password,Company company) {
		super();
		this.fullName = fullName;
		this.emailId = emailId;
		this.phNumber = phNumber;
		this.password = password;
		this.company = company;
	}
	public CompanyAdmin() {
		super();
	}
	
	
	public int getcAdminId() {
		return cAdminId;
	}
	public void setcAdminId(Integer cAdminId) {
		this.cAdminId = cAdminId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getphNumber() {
		return phNumber;
	}
	public void setphNumber(String phno) {
		this.phNumber = phNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}
}
