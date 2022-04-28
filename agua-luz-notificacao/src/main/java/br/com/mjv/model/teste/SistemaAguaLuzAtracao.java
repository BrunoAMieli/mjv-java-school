package br.com.mjv.model.teste;

import java.util.List;

import br.com.mjv.model.Contrato;
import br.com.mjv.model.repository.ContratoRepository;
import br.com.mjv.model.service.GeradorArquivo;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		ContratoRepository rep = new ContratoRepository();
		List<Contrato> contratos = rep.listar();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.csv(contratos);
		ga.txt(contratos);
		
	}
}
