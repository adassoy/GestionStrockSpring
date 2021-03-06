package com.ipartek.formacion.service;

import java.io.Serializable;
import java.util.List;

import com.ipartek.formacion.domain.Product;

public interface ProductManager extends Serializable {

	int INCREASE_MIN = 0;
	int INCREASE_MAX = 50;

	String MSG_ILLEGALARGUMENT_EXCEPTION = "El incremento solo puede ser entre " + INCREASE_MIN + " y " + INCREASE_MAX;

	/**
	 * Incrementa el precio de todos los productos
	 *
	 * @param percentage
	 *            {@code int}} Porcentaje a incrementar maximo 50, minimo 0
	 * @throws IllegalArgumentException
	 */

	public void increasePrice(int percentage);

	public List<Product> getProducts();

}
