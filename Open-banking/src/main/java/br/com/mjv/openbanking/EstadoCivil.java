package br.com.mjv.openbanking;

public enum EstadoCivil {

	SOLTEIRO ("S"),
	CASADO ("C"),
	DIVORCIADO ("D");
	
	private String sigla;
	
	private EstadoCivil (String sigla) {
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
}
