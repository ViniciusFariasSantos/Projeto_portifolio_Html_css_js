package com.vinicius.portifolio.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;





@Controller

public class PortifolioController {
	
	
	@RequestMapping("/Portifolio")
	public String portifolio() {
		
		return "Portifolio";
	}
	
	
	@RequestMapping("/Projeto")
	public String projeto() {
		
		return "Projeto";
	}
	
	@RequestMapping("/skill")
	public String skill() {
		
		return "skill";
	}
	
	@RequestMapping("/contato")
	public String contato() {
		
		return "contato";
	}
}
