package br.com.mjv.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Contrato implements Serializable {

	private static final long serialVersionUID = 753389399289690738L;

	private String protocolo;
	
	private LocalDate data;
	
	private LocalTime hora;
	
	private TipoServico tipoServico;
	
	private double valor;
	
	private TipoNotificacao tipoNotificacao;

	public Contrato() {
		super();
	}

	public Contrato(String protocolo, LocalDate data, LocalTime hora, TipoServico tipoServico, double valor,
			TipoNotificacao tipoNotificacao) {
		super();
		this.protocolo = protocolo;
		this.data = data;
		this.hora = hora;
		this.tipoServico = tipoServico;
		this.valor = valor;
		this.tipoNotificacao = tipoNotificacao;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Contrato [protocolo=" + protocolo + ", data=" + data + ", hora=" + hora + ", tipoServico=" + tipoServico
				+ ", valor=" + valor + ", tipoNotificacao=" + tipoNotificacao + "]";
	}

}
