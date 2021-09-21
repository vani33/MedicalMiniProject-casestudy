package com.hcl.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.MedicineDetails;

@Repository
public class MedicineDAOImpl implements MedicineDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addMedicine(MedicineDetails medicineDetails) {
		
		Session session = sessionFactory.openSession();
		session.save(medicineDetails);
		
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
