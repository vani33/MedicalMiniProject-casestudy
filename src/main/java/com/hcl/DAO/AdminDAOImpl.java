package com.hcl.DAO;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.model.AdminDetails;

@Repository

public class AdminDAOImpl implements AdminDAO {

	/*
	 * private static final Logger
	 * logger=LoggerFactory.getLogger(AdminDAOImpl.class);
	 */
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {

		return sessionFactory;

	}

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}
	//@Transactional
	public void createAdmin(AdminDetails adminDetails) {
		System.out.println("dao");

		Session session = sessionFactory.openSession();

		session.save(adminDetails);

		System.out.println("Your Details are submitted successfully" );

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