package com.qts.tracker.demo_filling_tracker.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qts.tracker.demo_filling_tracker.model.Company;
import com.qts.tracker.demo_filling_tracker.model.CompanyAdmin;
import com.qts.tracker.demo_filling_tracker.repository.CompanyAdminRepository;
import com.qts.tracker.demo_filling_tracker.request.CompanyAdminRequest;
import com.qts.tracker.demo_filling_tracker.service.CompanyAdminService;

@RestController
public class CompanyAdminController {
	@Autowired
	CompanyAdminRepository companyAdminRepository;
	@Autowired
	CompanyAdminService companyAdminService;
	
	@PostMapping("/createOrUpdateCompanyAdminDetails")
	public CompanyAdmin createOrUpdateCompanyAdminDetails(@RequestBody CompanyAdminRequest companyAdminRequest) {
		
		return companyAdminService.createOrUpdateCompanyAdmin(companyAdminRequest);
		
	}
	@DeleteMapping("/deleteCompanyAdminByCompanyId/{cAdminId}")
	public String deleteCompanyAdminByCompanyId(@PathVariable("cAdminId") int cAdminId) {
		return companyAdminService.deleteCompanyAdminByCompanyId(cAdminId);
	}
	@GetMapping("/getCompanyAdminDetailsByCompanyAdminId/{cAdminId}")
	public CompanyAdmin getCompanyAdminDetailsByCompanyAdminId(@PathVariable("cAdminId") int cAdminId) {
	return companyAdminService.getCompanyAdminByCompanyAdminId(cAdminId);
	}
	@GetMapping("/getAllCompanyAdminDetails")
	public List<CompanyAdmin> getAllCompanyAdminDetails() {
		List<CompanyAdmin> obj = new ArrayList<CompanyAdmin>();
		obj = companyAdminService.getAllCompanyAdminDetails();
		return obj;
	} 
	}


