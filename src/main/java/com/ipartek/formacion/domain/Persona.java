package com.ipartek.formacion.domain;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override()
	public String toString() {
		return "Persona [nombre=" + this.nombre + "]";
	}

}
