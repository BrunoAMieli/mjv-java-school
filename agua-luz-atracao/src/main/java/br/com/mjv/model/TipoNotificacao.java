package br.com.mjv.model;

public enum TipoNotificacao {
	SMS ("S"),
	WHATS ("W");
	
	private String sigla;

	private TipoNotificacao(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}
	
}
