package com.ipartek.formacion.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ipartek.formacion.service.PersonaManager;
import com.ipartek.formacion.service.ProductManager;

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

}
