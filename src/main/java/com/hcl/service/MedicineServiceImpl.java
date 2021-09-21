package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.DAO.MedicineDAO;
import com.model.MedicineDetails;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	private MedicineDAO medicineDAO;
	@Override
	@Transactional
	public void addMedicine(MedicineDetails medicineDetails) {
		this.medicineDAO.addMedicine(medicineDetails);
		
	}

	@Override
	public List<MedicineDetails> readAllMedicine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMedicine(MedicineDetails medicineDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MedicineDetails deleteMedicineById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
