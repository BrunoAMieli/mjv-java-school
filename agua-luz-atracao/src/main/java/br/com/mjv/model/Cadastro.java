package br.com.mjv.model;

import java.io.Serializable;

public class Cadastro implements Serializable{

	private static final long serialVersionUID = -1622592906196942843L;

	private String cpf;
	
	private String nome;
	
	private String rg;
	
	private String celular;
	
	private Endereco endereco;
	
	private Pais pais;

	public Cadastro() {
		super();
	}

	public Cadastro(String cpf, String nome, String rg, String celular, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.celular = celular;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
