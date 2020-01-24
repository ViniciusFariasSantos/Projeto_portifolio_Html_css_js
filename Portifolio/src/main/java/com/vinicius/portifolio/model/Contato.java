package com.vinicius.portifolio.model;

public class Contato {

	String nome;
	String email;
	String mensagem;
	

	public Contato(String nome, String email, String mensagem) {
		super();
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public void adicionar(Contato contato) {
		// TODO Auto-generated method stub
		
	}
	

}
