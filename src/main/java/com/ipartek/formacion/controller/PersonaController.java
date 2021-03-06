package com.ipartek.formacion.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ipartek.formacion.domain.Persona;
import com.ipartek.formacion.service.PersonaManager;

@Controller

public class PersonaController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private PersonaManager personaManager;
	// siempre tiene que tener un set:

	public void setPersonaManager(PersonaManager personaManager) {
		this.personaManager = personaManager;
	}

	@RequestMapping(value = "/personas")

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.logger.info("Procesando peticion para 'personas'");

		// atributos == modelo
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("personas", this.personaManager.getAll());
		model.put("fecha", (new Date()).toString());

		return new ModelAndView("personas", model);
		// de esta forma le indicamos cual es la pagina
		// que tiene que ejecutar "inventario" y
		// cuales son los atributos que tiene que enviarle 'model'
	}

	// @RequestMapping(value = "/insertar-persona.html")
	// public ModelAndView handleRequest2(HttpServletRequest request,
	// HttpServletResponse response)
	// throws ServletException, IOException {

	// this.logger.info("Procesando peticion para 'Insertar persona'");

	//// atributos == modelo
	// Map<String, Object> model = new HashMap<String, Object>();

	// return new ModelAndView("insertar-persona", model);
	// de esta forma le indicamos cual es la pagina
	// que tiene que ejecutar "inventario" y
	// cuales son los atributos que tiene que enviarle 'model'
	// }

	@RequestMapping(value = "/insertar-persona.html", method = RequestMethod.POST)
	public String onSubmit(@Valid Persona persona, BindingResult result) {
		if (result.hasErrors()) {
			// si la validacion no es correcta nos devuelve a esta pagina

			return "insertar-persona";
		}

		new HashMap<String, Object>();

		persona.getNombre();
		persona.getEdad();

		this.logger.trace("Insertanda persona " + persona.toString());

		return "redirect:/personas";
	}

	/**
	 *
	 * @param request
	 * @return 'insertar-persona.jsp' con datos cargados en los campos 'input'
	 * @throws ServletException
	 */
	@RequestMapping(value = "/insertar-persona.html", method = RequestMethod.GET)
	protected Persona formBackingObject(HttpServletRequest request) throws ServletException {
		this.logger.trace("Antes de cargar 'insertar-persona.jsp'");
		Persona persona = new Persona();
		persona.setEdad(0);

		return persona;
	}

}
