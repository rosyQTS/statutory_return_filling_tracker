package com.qts.tracker.demo_filling_tracker.request;



public class CompanyAdminRequest {
	private int cAdminId;
	private String fullName;
	private String emailId;
	private String phNumber;
	private String password;
	private int companyId;
	public int getcAdminId() {
		return cAdminId;
	}
	public void setcAdminId(int cAdminId) {
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
	public void setPhno(String phno) {
		this.phNumber = phNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getcompanyId() {
		return companyId;
	}
	public void setcompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	
}
