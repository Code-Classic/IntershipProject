package com.code.insurancems.entity;

public class Insurance {
	private Long inId;
	private String inName;
	private String inLevel;
	private Long inCover;
	private int inDuration;
	private Customer customer;
	
	public Insurance(Long inId, String inName, String inLevel, Customer customer) {
		super();
		this.inId = inId;
		this.inName = inName;
		this.inLevel = inLevel;
		this.customer = customer;
	}

	public Insurance() {}

	public Long getInId() {
		return inId;
	}

	public void setInId(Long inId) {
		this.inId = inId;
	}

	public String getInName() {
		return inName;
	}

	public void setInName(String inName) {
		this.inName = inName;
	}

	public String getInLevel() {
		return inLevel;
	}

	public void setInLevel(String inLevel) {
		this.inLevel = inLevel;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getInAmount() {
		return inCover;
	}

	public void setInAmount(Long inAmount) {
		this.inCover = inAmount;
	}

	public int getInDuration() {
		return inDuration;
	}

	public void setInDuration(int inDuration) {
		this.inDuration = inDuration;
	}
	
}
