package com.hcl.DAO;

import java.util.List;

import com.model.MedicineDetails;

public interface MedicineDAO {
	
	public abstract void addMedicine(MedicineDetails medicineDetails);

	public abstract List<MedicineDetails> readAllMedicine();

	public abstract int updateMedicine(MedicineDetails medicineDetails);

	public abstract MedicineDetails deleteMedicineById(int Id);

}
