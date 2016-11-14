package com.cct.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/inventario")
public class InventarioController {

	@Secured({"ROLE_USER", "ROLE_ADMIN"})
	@RequestMapping(value = "/generar", method = RequestMethod.GET)
	public ModelAndView adminPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Modulo Inventario");
		model.addObject("message", "Acceso a inventario para ROLE_ADMIN o ROLE_USER!");
		model.setViewName("inventario");
		JOptionPane.showInputDialog(null, "Modulo Inventario SessionId: ", RequestContextHolder.currentRequestAttributes().getSessionId());
		System.out.println(RequestContextHolder.currentRequestAttributes().getSessionId());
		return model;
	}

}