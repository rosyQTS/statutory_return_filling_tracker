package com.qts.tracker.demo_filling_tracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qts.tracker.demo_filling_tracker.model.Company;
import com.qts.tracker.demo_filling_tracker.repository.CompanyRepository;
import com.qts.tracker.demo_filling_tracker.service.CompanyService;

@RestController
public class CompanyController {
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	CompanyService companyService;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/createCompanyData")
	public String insertCompanyData(@RequestBody Company company) {
	return	companyService.saveCompanyData(company);
		
	}
	@CrossOrigin(origins = "*")
	@GetMapping("/findAllCompanyName")
	public List<Company> findAll() {
		List<Company> obj = new ArrayList<Company>();
		obj = companyService.findAllCompany();
		return obj;
	}
	@CrossOrigin(origins = "*")
	@PutMapping("/updateCompanyDetails")
	public String editCompanyDetails(@RequestBody Company company) {
		return companyService.editCompanyDetails(company);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping("/deleteCompanyDetails")
	public String deleteCompanyDetails(@RequestBody Company company) {
		return companyService.deleteAllCompanyDetails(company);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping("/deleteCompanyDetailsById/{cid}")
	public String deleteCompanyDetailsById(@PathVariable("cid") Integer cid) {
		return companyService.deleteAllCompanyDetailsById(cid);
	}
	@CrossOrigin(origins = "*")
	@GetMapping("/getCompanyByCompanyId/{cid}")
	public Company getCompanyByCompanyId(@PathVariable("cid") Integer cid) {
		return companyService.getAllCompanyByCompanyId(cid);
		
	}

}
