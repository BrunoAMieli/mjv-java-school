package br.com.mjv.objeto;

public class Pessoa {
	
	String cpf;
	String nome;
	String endereco;
	
	public Pessoa() {
		
	}

	public Pessoa(String cpf, String nome, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Pessoa(String cpf, String nome) {
		this(cpf, nome, "Não informado.");
	}
	
}
