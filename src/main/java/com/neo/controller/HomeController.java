package com.neo.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String getHomePage()
      {
		return "home.html";
		}
	@PostMapping("/")
	public String showHomePage()
	{
		return "home.html";
	}
}
