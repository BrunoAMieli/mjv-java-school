package br.com.mjv.model;

public enum TipoServico {
	ÁGUA ("A"),
	LUZ ("L");
	
	private String sigla;

	private TipoServico(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}
	
	
}
