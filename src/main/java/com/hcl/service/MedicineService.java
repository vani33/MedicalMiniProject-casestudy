package com.hcl.service;

import java.util.List;

import com.model.MedicineDetails;


public interface MedicineService {

	public void addMedicine(MedicineDetails medicineDetails);

	public List<MedicineDetails> readAllMedicine();

	public int updateMedicine(MedicineDetails medicineDetails);

	public MedicineDetails deleteMedicineById(int Id);
}
