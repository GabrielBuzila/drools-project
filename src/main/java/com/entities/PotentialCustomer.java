package com.entities;

import com.enums.MaritalStatus;
import com.enums.Status;

public class PotentialCustomer {
	String name;
	Integer age;
	String nationality;
	MaritalStatus maritalStatus;
	Integer expActualJob; // in years
	Double salary;
	Integer dependents;
	Double creditLimit;
	Status status;
	GeneralCosts generalCosts;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Integer getExpActualJob() {
		return expActualJob;
	}

	public void setExpActualJob(Integer expActualJob) {
		this.expActualJob = expActualJob;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDependents() {
		return dependents;
	}

	public void setDependents(Integer dependents) {
		this.dependents = dependents;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public GeneralCosts getGeneralCosts() {
		return generalCosts;
	}

	public void setGeneralCosts(GeneralCosts generalCosts) {
		this.generalCosts = generalCosts;
	}

	@Override
	public String toString() {
		return "PotentialCustomer [name=" + name + ", age=" + age + ", nationality=" + nationality + ", maritalStatus="
				+ maritalStatus + ", expActualJob=" + expActualJob + ", salary=" + salary + ", dependents=" + dependents
				+ ", creditLimit=" + creditLimit + ", status=" + status + ", generalCosts=" + generalCosts + "]";
	}
}
