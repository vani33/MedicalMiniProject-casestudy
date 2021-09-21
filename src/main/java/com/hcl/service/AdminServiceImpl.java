package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.hcl.DAO.AdminDAO;
import com.model.AdminDetails;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDAO;

	public AdminDAO getAdminDAO() {

		return adminDAO;

	}

	public void setAdminDAO(AdminDAO adminDAO) {

		this.adminDAO = adminDAO;

	}

	@Transactional
	public void createAdmin(AdminDetails adminDetails) {
		this.adminDAO.createAdmin(adminDetails);

	}

	public List<AdminDetails> readAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateAdmin(AdminDetails adminDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	public AdminDetails deleteAdminById(int vendorId) {
		// TODO Auto-generated method stub
		return null;
	}

}