package com.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
		ModelAndView ret = new ModelAndView("home");
		// Adds an objet to be used in home.jsp
		ret.addObject("name", name);
		return ret;
	}


	@GetMapping("/hello")
	public String index(Model model) {

		model.addAttribute("message", "Hello Spring MVC 5!");
		return "index";
	}
}
