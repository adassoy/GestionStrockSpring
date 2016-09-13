package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.domain.Product;

public class SimpleProductManager implements ProductManager {
	private static final int cien = 100;
	private static final long serialVersionUID = 1L;
	private List<Product> products;

	@Override()
	public void increasePrice(int percentage) throws IllegalArgumentException {
		if (this.products != null) {
			if (percentage < INCREASE_MIN || percentage > INCREASE_MAX) {
				throw new IllegalArgumentException(MSG_ILLEGALARGUMENT_EXCEPTION);
			}
			for (Product product : this.products) {
				if (product != null) {
					double newPrice = product.getPrice().doubleValue() * (cien + percentage) / cien;
					product.setPrice(newPrice);
				}
			}
		}
	}

	@Override()
	public List<Product> getProducts() {

		return this.products;

	}

	public void setProducts(List<Product> products) {
		// throw new UnsupportedOperationException();
		this.products = products;

	}

}
