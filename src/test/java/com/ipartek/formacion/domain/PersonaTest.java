package com.ipartek.formacion.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Testea el pojo Persona
 * @author adassoy
 *
 */

public class PersonaTest {
	private Persona persona;
	
	@Before
	public void setUp() throws Exception {
		this.persona = new Persona();
	}

	@Test
	public void testSetAndGetName() {
		String sName = "nombre";
		assertNull(this.persona.getNombre());
		this.persona.setNombre(sName);
		assertEquals(sName, this.persona.getNombre());
	}

}
