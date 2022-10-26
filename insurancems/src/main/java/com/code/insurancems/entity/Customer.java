package com.code.insurancems.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate dateOfBirth;
	private String contactNumber;
	private String uniqueIdNumber;
	private Insurance insurance;
	
	
	public Customer(Long id, String firstName, String lastName, String email, LocalDate dateOfBirth,
			String contactNumber, String uniqueIdNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		this.dateOfBirth = dateOfBirth;
		this.contactNumber = contactNumber;
		this.uniqueIdNumber = uniqueIdNumber;
	}


	public Customer() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}


	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}


	public Insurance getInsurance() {
		return insurance;
	}


	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	
	
	
	
}
