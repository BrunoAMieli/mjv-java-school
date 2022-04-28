package br.com.mjv.model;

import java.io.Serializable;

public class Cadastro implements Serializable{

	private static final long serialVersionUID = -1622592906196942843L;

	private String cpf;
	
	private String nome;
	
	private Endereco endereco;

	public Cadastro() {
		super();
	}

	public Cadastro(String cpf, String nome, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cadastro [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
}
