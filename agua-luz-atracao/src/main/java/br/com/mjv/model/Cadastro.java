package br.com.mjv.model;

import java.io.Serializable;

public class Cadastro implements Serializable{

	private static final long serialVersionUID = -1622592906196942843L;

	private String cpf;
	
	private String rg;
	
	private String nome;
	
	private String celular;
	
	private String logradouro;
	
	private String complemento;
	
	private String bairro;
	
	private String cidade;
	
	private String cep;

	public Cadastro() {
		super();
	}

	public Cadastro(String cpf, String rg, String nome, String celular, String logradouro, String complemento,
			String bairro, String cidade, String cep) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.celular = celular;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cadastro [cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", celular=" + celular + ", logradouro="
				+ logradouro + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep="
				+ cep + "]";
	}

}
