package com.ipartek.formacion.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Canido {
	@NotNull
	@Size(min = 3, max = 255)
	private String raza;
	private String nombre;
	@Min(0)
	@Max(60)
	private int edad;

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Canido [raza=" + this.raza + ", nombre=" + this.nombre + ", edad=" + this.edad + "]";
	}

}
