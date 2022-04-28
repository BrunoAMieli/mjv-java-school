package br.com.mjv.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Contrato implements Serializable {

	private static final long serialVersionUID = 753389399289690738L;

	private Long protocolo;
	
	private String servico;
	
	private double valor;
	
	private LocalDateTime dataHora;
				
	private Cadastro cliente;
	
	public Contrato() {
		super();
	}

	public Contrato(Long protocolo, String serico, double valor, LocalDateTime dataHora, Cadastro cliente) {
		super();
		this.protocolo = protocolo;
		this.servico = serico;
		this.valor = valor;
		this.dataHora = dataHora;
		this.cliente = cliente;
	}

	public Long getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Long protocolo) {
		this.protocolo = protocolo;
	}

	public String getSerico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Cadastro getCliente() {
		return cliente;
	}

	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Contrato [protocolo=" + protocolo + ", serico=" + servico + ", valor=" + valor + ", dataHora=" + dataHora
				+ ", cliente=" + cliente + "]";
	}
	
}
