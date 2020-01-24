package com.vinicius.portifolio.repositorio;



import java.util.*;

import com.vinicius.portifolio.model.*;





public class ReposiConatato {

	
	
			
	 List<Contato> LISTACONTATO = new ArrayList<>();
	static {
		
		
		
	}
	
	public void adicionar(Contato contato) {
		
		Contato.LISTACONTATO.add(contato);
	}
}
