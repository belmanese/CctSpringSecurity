package com.cct.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/cotizacion/")
public class CotizacionController {

	@Secured({"ROLE_USER"})
	@RequestMapping(value = "/generar", method = RequestMethod.GET)
	public ModelAndView adminPage(HttpServletRequest request) {		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Modulo Cotizacion");
		model.addObject("message", "Acceso a cotizaciones para ROLE_USER!");
		model.setViewName("cotizacion");
		WebAuthenticationDetails wad = null;
		JOptionPane.showInputDialog(null, "Modulo Cotizacion ClientIp: ", request.getRemoteAddr());
		JOptionPane.showInputDialog(null, "Modulo Cotizacion SessionId: ", RequestContextHolder.currentRequestAttributes().getSessionId());
		System.out.println(RequestContextHolder.currentRequestAttributes().getSessionId());
		return model;
	}

}