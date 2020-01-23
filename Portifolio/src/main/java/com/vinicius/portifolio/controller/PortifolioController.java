package com.vinicius.portifolio.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PortifolioController {

	@RequestMapping("/portifolio")
	public String web() {
		
		return "Portifolio";
	}
}
