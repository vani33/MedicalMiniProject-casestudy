package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.DAO.AdminDAO;
import com.hcl.service.AdminService;
import com.hcl.service.MedicineService;
import com.model.AdminDetails;
import com.model.MedicineDetails;

@Controller

public class UserController {

	

	//private AdminDAO adminDAO;
	@Autowired
	private AdminService adminService;
	@Autowired
	private MedicineService medicineService;
	
	
	@RequestMapping("/RegistrationLink")
	public String registrationLink() {
		System.out.println("im coming from registration link");
		return "RegistrationLink";
	}

	@RequestMapping("/LoginPage")
	public String loginPage() {
		return "LoginPage";
	}
	
	@RequestMapping("/MedicineInformationPage")
	public String medicineInformation() {
		return "AvailableMedicines";
	}

	
	@RequestMapping("/InsertAdmin")
	public String addAdmin(@ModelAttribute AdminDetails adminDetails) {
		System.out.println("im coming from insert admin url");
		this.adminService.createAdmin(adminDetails);
		System.out.println("your Admin details are saved successfully");
		return "insert";
	}
	@RequestMapping("/InsertMedicine")
	public String addMedicine(@ModelAttribute MedicineDetails medicineDetails) {
		System.out.println("im coming from insert medicine url");
		this.medicineService.addMedicine(medicineDetails);
		System.out.println("your medicine details are saved successfully");
		return "insert";
	}
		
	@RequestMapping("/FetchAdmin")
	public String fetchAdmin(@ModelAttribute("adminDetails") AdminDetails adminDetails) {
		
		List<AdminDetails> list = this.adminService.readAllAdmin();
		
		return "FetchAdmin";
		
	}

}