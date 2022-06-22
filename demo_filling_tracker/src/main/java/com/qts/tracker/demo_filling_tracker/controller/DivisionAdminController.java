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

import com.qts.tracker.demo_filling_tracker.model.DivisionAdmin;
import com.qts.tracker.demo_filling_tracker.repository.DivisionAdminRepository;
import com.qts.tracker.demo_filling_tracker.request.DivisionAdminRequest;
import com.qts.tracker.demo_filling_tracker.service.DivisionAdminService;

@RestController
public class DivisionAdminController {
	@Autowired
	DivisionAdminRepository divisionAdminRepository;
	@Autowired
	DivisionAdminService divisionAdminService;
	
	@PostMapping("/createOrUpdateDivisionAdmin")
	public DivisionAdmin createOrUpdateDivisionAdmin(@RequestBody DivisionAdminRequest divisionAdminRequest) {
		return divisionAdminService.createOrUpdateDivisionAdmin(divisionAdminRequest);
	}
	@GetMapping("/getAllDivisionAdminDetails")
	public List<DivisionAdmin> getAllDivisionAdminDetails() {
		List<DivisionAdmin> obj = new ArrayList<DivisionAdmin>();
		obj = divisionAdminService.getAllDivisionAdminDetails();
		return obj;
	}
	@DeleteMapping("/deleteDivisionAdminByDivisionAdminId/{divisionAdminId}")
	public String deleteDivisionAdminByDivisionAdminId(@PathVariable("divisionAdminId") int divisionAdminId) {
		return divisionAdminService.deleteDivisionById(divisionAdminId);
		
	}
	@GetMapping("/getDivisionAdminById/{divisionAdminId}")
	public DivisionAdmin getDivisionAdminById(@PathVariable("divisionAdminId") int divisionAdminId) {
		return divisionAdminService.getDivisionAdminById(divisionAdminId);
	}
	

}
