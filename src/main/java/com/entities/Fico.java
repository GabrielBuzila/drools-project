package com.entities;

import java.util.ArrayList;
import java.util.List;

public class Fico {
	PotentialCustomer potentialCustomer;
	Integer promptSc; // promptitudine
	Integer overdueDateSc; // numar zile intarziere
	Integer remainingAmountSc; // suma restanta
	Integer fullPaidCreditSc; // credite achitate integral
	Integer creditTypeSc; // tip imprumut
	Integer creditValueSc; // suma creditata
	Integer presentSoldSc; // soldul in prezent
	Integer activeCreditsSc; // numar credite active
	Integer oldestCredSc; // timpul trecut de la primul credit luat
	Integer recentOpenCreditSc; // numar credite deschise recent
	Integer recentTypeCreditSc; // tipul creditelor deschise recent
	Integer allTypeCreditSc; // tipul tuturor creditelor
	Integer total;

	
	List<PotentialCustomer> firstThreeScores = new ArrayList<PotentialCustomer>();
	
	public void addCustomer(PotentialCustomer pc) {
		firstThreeScores.add(pc);
	}
	
	public List<PotentialCustomer> getFirstThreeScores() {
		return firstThreeScores;
	}

	public PotentialCustomer getPotentialCustomer() {
		return potentialCustomer;
	}

	public void setPotentialCustomer(PotentialCustomer potentialCustomer) {
		this.potentialCustomer = potentialCustomer;
	}

	public Integer getPromptSc() {
		return promptSc;
	}

	public void setPromptSc(Integer promptSc) {
		this.promptSc = promptSc;
	}

	public Integer getOverdueDateSc() {
		return overdueDateSc;
	}

	public void setOverdueDateSc(Integer overdueDateSc) {
		this.overdueDateSc = overdueDateSc;
	}

	public Integer getRemainingAmountSc() {
		return remainingAmountSc;
	}

	public void setRemainingAmountSc(Integer remainingAmountSc) {
		this.remainingAmountSc = remainingAmountSc;
	}

	public Integer getFullPaidCreditSc() {
		return fullPaidCreditSc;
	}

	public void setFullPaidCreditSc(Integer fullPaidCreditSc) {
		this.fullPaidCreditSc = fullPaidCreditSc;
	}

	public Integer getCreditTypeSc() {
		return creditTypeSc;
	}

	public void setCreditTypeSc(Integer creditTypeSc) {
		this.creditTypeSc = creditTypeSc;
	}

	public Integer getCreditValueSc() {
		return creditValueSc;
	}

	public void setCreditValueSc(Integer creditValueSc) {
		this.creditValueSc = creditValueSc;
	}

	public Integer getPresentSoldSc() {
		return presentSoldSc;
	}

	public void setPresentSoldSc(Integer presentSoldSc) {
		this.presentSoldSc = presentSoldSc;
	}

	public Integer getActiveCreditsSc() {
		return activeCreditsSc;
	}

	public void setActiveCreditsSc(Integer activeCreditsSc) {
		this.activeCreditsSc = activeCreditsSc;
	}

	public Integer getOldestCredSc() {
		return oldestCredSc;
	}

	public void setOldestCredSc(Integer oldestCredSc) {
		this.oldestCredSc = oldestCredSc;
	}

	public Integer getRecentOpenCreditSc() {
		return recentOpenCreditSc;
	}

	public void setRecentOpenCreditSc(Integer recentOpenCreditSc) {
		this.recentOpenCreditSc = recentOpenCreditSc;
	}

	public Integer getRecentTypeCreditSc() {
		return recentTypeCreditSc;
	}

	public void setRecentTypeCreditSc(Integer recentTypeCreditSc) {
		this.recentTypeCreditSc = recentTypeCreditSc;
	}

	public Integer getAllTypeCreditSc() {
		return allTypeCreditSc;
	}

	public void setAllTypeCreditSc(Integer allTypeCreditSc) {
		this.allTypeCreditSc = allTypeCreditSc;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
