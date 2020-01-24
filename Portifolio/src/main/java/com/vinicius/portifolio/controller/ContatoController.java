package com.vinicius.portifolio.controller;

import com.vinicius.portifolio.model.Contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
@RequestMapping("/contato")
public class ContatoController {

	
	@Autowired
	private Contato contato;

	
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Contato contato  ) {	
			this.contato.adicionar(contato);
			return "redirect:/contato";	
	}

}
