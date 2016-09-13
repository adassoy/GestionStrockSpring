package com.ipartek.formacion.domain;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;
	private Double price;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [description=" + this.description + ", price=" + this.price + "]";
	}

}
