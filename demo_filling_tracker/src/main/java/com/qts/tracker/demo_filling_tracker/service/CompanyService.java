package com.qts.tracker.demo_filling_tracker.service;

import java.util.List;

import com.qts.tracker.demo_filling_tracker.model.Company;

public interface CompanyService {

	String saveCompanyData(Company company);

	List<Company> findAllCompany();

	String editCompanyDetails(Company company);

	String deleteAllCompanyDetails(Company company);

	String deleteAllCompanyDetailsById(Integer cid);

	Company getAllCompanyByCompanyId(Integer cid);

}
