package com.shinypools.controllers;

import static com.shinypools.util.AppConstants.*;
import static org.springframework.util.StringUtils.capitalize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/* @author "Jack Kern" */

@Controller
@RequestMapping(SERVICES)
public class ServicesController
{
	@GetMapping
	public String getTemplate(Model model)
	{
		model.addAttribute(ACTIVEPAGE, capitalize(strMapping(SERVICES)));
		return strMapping(SERVICES);
	}
}