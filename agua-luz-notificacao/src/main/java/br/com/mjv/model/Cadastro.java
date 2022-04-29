package br.com.mjv.model;

public class Cadastro {
	
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private Endereco endereco;
	
	private Pais pais;
	
	private Contrato contrato;

	public Cadastro() {
		super();

	}

	public Cadastro(String nome, String cpf, String rg, Endereco endereco, Pais pais, Contrato contrato) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.pais = pais;
		this.contrato = contrato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", pais=" + pais
				+ ", contrato=" + contrato + "]";
	}

}
