package com.entities;

import java.time.LocalDate;

public class Payment {
	Double totalAmount;
	LocalDate dateOfPayment;
	LocalDate dueDate;
	Integer remainingRates; // numarul de rate ramase

	
	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(LocalDate dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getRemainingRates() {
		return remainingRates;
	}

	public void setRemainingRates(Integer remainingRates) {
		this.remainingRates = remainingRates;
	}

}
