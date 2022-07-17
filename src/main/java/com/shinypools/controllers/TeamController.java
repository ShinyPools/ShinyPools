package com.shinypools.controllers;

import static com.shinypools.util.AppConstants.*;
import static org.springframework.util.StringUtils.capitalize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/* @author "Jack Kern" */

@Controller
@RequestMapping(TEAM)
public class TeamController
{
	@GetMapping
	public String getTemplate(Model model)
	{
		model.addAttribute(ACTIVEPAGE, capitalize(strMapping(TEAM)));
		return strMapping(TEAM);
	}

	@GetMapping(DANKERN)
	public String getDanKern(Model model)
	{
		model.addAttribute(ACTIVEPAGE, "Dan Kern");
		return strMapping(DANKERN);
	}
}