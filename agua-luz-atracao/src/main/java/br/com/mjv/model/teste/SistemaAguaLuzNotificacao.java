package br.com.mjv.model.teste;

import br.com.mjv.model.Contrato;
import br.com.mjv.model.repository.ContratoTxtRepository;
import br.com.mjv.model.service.GeradorMensagem;

public class SistemaAguaLuzNotificacao {
	
	public static void main(String[] args) {
		ContratoTxtRepository rep = new ContratoTxtRepository();
		
		Contrato contrato =  rep.buscar();
		
		GeradorMensagem gm = new GeradorMensagem();
		
		gm.gerar(contrato);
		
	}
}