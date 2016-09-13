package com.ipartek.formacion.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.ipartek.formacion.service.SimplePersonaManager;
import com.ipartek.formacion.service.SimpleProductManager;

public class PersonaControllerTest {

	@Test
	public void test() {
		try {
			final PersonaController controller = new PersonaController();
			controller.setPersonaManager(new SimplePersonaManager());
			final ModelAndView mv = controller.handleRequest(null, null);

			controller.setPersonaManager(new SimplePersonaManager());

			assertEquals("Vista NO valida", "personas", mv.getViewName());
			assertNull(mv.getModel().get("personas"));
		} catch (final Exception e) {
			fail("No deveria lanzar excepcion");
		}
	}

}
