package com.shinypools.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.util.StringUtils.capitalize;

import static com.shinypools.util.AppConstants.*;

/* @author "Jack Kern" */

@Controller
@RequestMapping(ABOUT)
public class AboutController
{
	@GetMapping
	public String getTemplate(Model model)
	{
		model.addAttribute(ACTIVEPAGE, capitalize(strMapping(ABOUT)));
		return strMapping(ABOUT);
	}
}