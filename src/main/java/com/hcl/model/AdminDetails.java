package com.hcl.model;

import javax.persistence.Entity;

/*import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;*/

import javax.persistence.Table;

@Entity

@Table(name = "AdminTable")

public class AdminDetails {

	private String firstName;

	private String lastName;

	private double age;

	private String gender;

	private String contactNo;

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 */

	private String vendorId;

	private String password;

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public double getAge() {

		return age;

	}

	public void setAge(double age) {

		this.age = age;

	}

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public String getContactNo() {

		return contactNo;

	}

	public void setContactNo(String contactNo) {

		this.contactNo = contactNo;

	}

	public String getVendorId() {

		return vendorId;

	}

	public void setVendorId(String vendorId) {

		this.vendorId = vendorId;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

}