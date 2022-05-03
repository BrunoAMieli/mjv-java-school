package br.com.mjv.model.teste;

import br.com.mjv.model.Contrato;
import br.com.mjv.model.repository.ContratoRepository;
import br.com.mjv.model.service.GeradorArquivo;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		ContratoRepository rep = new ContratoRepository();
		Contrato contrato = rep.pegarUnicoContrato();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.csv(contrato);
		ga.txt(contrato);
		
	}
}