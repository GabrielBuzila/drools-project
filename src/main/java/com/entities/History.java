package com.entities;

public class History {
	PotentialCustomer potentialCustomer;
	Boolean isFirstCredit;
	Integer activeNumbOfCredits;
	Double rateOverdue;

	
	public PotentialCustomer getPotentialCustomer() {
		return potentialCustomer;
	}

	public void setPotentialCustomer(PotentialCustomer potentialCustomer) {
		this.potentialCustomer = potentialCustomer;
	}

	public Boolean getIsFirstCredit() {
		return isFirstCredit;
	}

	public void setIsFirstCredit(Boolean isFirstCredit) {
		this.isFirstCredit = isFirstCredit;
	}

	public Integer getActiveNumbOfCredits() {
		return activeNumbOfCredits;
	}

	public void setActiveNumbOfCredits(Integer activeNumbOfCredits) {
		this.activeNumbOfCredits = activeNumbOfCredits;
	}

	public Double getRateOverdue() {
		return rateOverdue;
	}

	public void setRateOverdue(Double rateOverdue) {
		this.rateOverdue = rateOverdue;
	}
}
