package com.codeforgeyt.springmvcnav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@GetMapping("/info")
	public String getInfo(Model model) {
		model.addAttribute("activePage", "info");
		return "info";
	}
	
	@GetMapping("/contact")
	public String getContact(Model model) {
		model.addAttribute("activePage", "contact");
		return "contact";
	}
}
