package com.shinypools.controllers;

import static com.shinypools.util.AppConstants.*;
import static org.springframework.util.StringUtils.capitalize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/* @author "Jack Kern" */

@Controller
@RequestMapping({ "/", INDEX })
public class IndexController
{
	@GetMapping
	public String getTemplate(Model model)
	{
		model.addAttribute(ACTIVEPAGE, capitalize(strMapping(INDEX)));
		return strMapping(INDEX);
	}
}