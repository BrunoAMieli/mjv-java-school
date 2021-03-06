package br.com.mjv.model;

public enum Pais {
	BRASIL("BR"),
	ESTADOS_UNIDOS("US"),
	FRANCA ("FR");
	
	private String sigla;
	private Pais(String sigla) {
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}
	
	public static Pais getPaisPorSigla(String sigla) {
		for(Pais p: Pais.values()) {
			if(p.getSigla().equals(sigla))
				return p;
		}
		return null;
	}
}