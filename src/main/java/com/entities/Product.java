package com.entities;

import com.enums.CreditType;

public class Product {
	public Product(CreditType type, Double maxValue) {
		this.type = type;
		this.maxValue = maxValue;
	}

	CreditType type;
	Double maxValue;

	
	public CreditType getType() {
		return type;
	}

	public void setType(CreditType type) {
		this.type = type;
	}

	public Double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}
}
