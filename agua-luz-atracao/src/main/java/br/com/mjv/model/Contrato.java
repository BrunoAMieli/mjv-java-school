package br.com.mjv.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.mjv.model.model.TipoNotificacao;

public class Contrato implements Serializable {

	private static final long serialVersionUID = 753389399289690738L;

	private Long protocolo;
	
	private Servico servico;
	
	private double valor;
	
	private LocalDateTime dataHora;
				
	private Cadastro cliente;
	
	private TipoNotificacao tipoNotificacao;
	
	public Contrato() {
		super();
	}

	public Contrato(Long protocolo, Servico servico, double valor, LocalDateTime dataHora, Cadastro cliente) {
		super();
		this.protocolo = protocolo;
		this.servico = servico;
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

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
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
		return "Contrato [protocolo=" + protocolo + ", servico=" + servico + ", valor=" + valor + ", dataHora="
				+ dataHora + ", cliente=" + cliente + "]";
	}

	public void setServico(String string) {
		
	}

	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	
}
