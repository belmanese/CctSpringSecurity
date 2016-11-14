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
@RequestMapping(value = "/planVenta")
public class PlanVentaController {

	@Secured({"ROLE_CONSULT"})
	@RequestMapping(value = "/generar", method = RequestMethod.GET)
	public ModelAndView adminPage(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Modulo Plan Venta");
		model.addObject("message", "Acceso a plan venta para ROLE_CONSULT!");
		model.setViewName("planVenta");
		JOptionPane.showInputDialog(null, "Modulo Plan de Venta SessionId: ", RequestContextHolder.currentRequestAttributes().getSessionId());
		System.out.println(RequestContextHolder.currentRequestAttributes().getSessionId());

		return model;

	}

}