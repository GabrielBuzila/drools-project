package com.entities;

public class CustomerProduct {

	PotentialCustomer potentialCustomer;
	Product product;
	Double creditValue;
	Double interestPc; // procent e.g 2.35%
	Double interestValue; // suma e.g 500
	Integer period; // in months

	
	public PotentialCustomer getPotentialCustomer() {
		return potentialCustomer;
	}

	public void setPotentialCustomer(PotentialCustomer potentialCustomer) {
		this.potentialCustomer = potentialCustomer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getCreditValue() {
		return creditValue;
	}

	public void setCreditValue(Double creditValue) {
		this.creditValue = creditValue;
	}

	public Double getInterestPc() {
		return interestPc;
	}

	public void setInterestPc(Double interestPc) {
		this.interestPc = interestPc;
	}

	public Double getInterestValue() {
		return interestValue;
	}

	public void setInterestValue(Double interestValue) {
		this.interestValue = interestValue;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}
}
