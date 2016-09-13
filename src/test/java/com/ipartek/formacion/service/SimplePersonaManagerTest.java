package com.ipartek.formacion.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.domain.Persona;

public class SimplePersonaManagerTest {
	
	private SimplePersonaManager personaManager;

	private List<Persona> personas;

	private static int PEOPLE_COUNT = 2;
	
	private static String PERSONA1_NOMBRE = "Paco";
	private static String PERSONA2_NOMBRE = "Porras";
	
	@Before()
	public void setUp() throws Exception {
		this.personaManager = new SimplePersonaManager();
		this.personas = new ArrayList<Persona>();

		// stub up a list of products
		Persona persona = new Persona();
		persona.setNombre("Paco");
		this.personas.add(persona);

		persona = new Persona();
		persona.setNombre("Porras");		
		this.personas.add(persona);

		this.personaManager.setPersonas(this.personas);

	}
	

	@Test()
	public void testGetAllWithNoPersonas() {
		this.personaManager = new SimplePersonaManager();		
		assertNull(this.personaManager.getAll());
	}
	
	@Test()
	public void testGetAll() {
		List<Persona> personas = this.personaManager.getAll();
		
		assertNotNull(personas);
		assertEquals(PEOPLE_COUNT, this.personaManager.getAll().size());

		Persona persona = personas.get(0);
		assertEquals(PERSONA1_NOMBRE, persona.getNombre());
		

		persona = personas.get(1);
		assertEquals(PERSONA2_NOMBRE, persona.getNombre());
	}

}
