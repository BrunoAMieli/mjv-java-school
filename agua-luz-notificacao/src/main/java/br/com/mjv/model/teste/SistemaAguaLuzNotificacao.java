package br.com.mjv.model.teste;

import java.util.List;

import br.com.mjv.model.Contrato;
//import br.com.mjv.model.service.GeradorMensagem;
import br.com.mjv.model.service.LeitorArquivo;

public class SistemaAguaLuzNotificacao {
	
    public static void main(String[] args) {
    	
        LeitorArquivo la = new LeitorArquivo();

        List<Contrato> contratosVindoCsv =  la.lerContratosCsv();

//        GeradorMensagem gm = new GeradorMensagem();
        for (Contrato contratoCsv : contratosVindoCsv) {
			System.out.println(contratoCsv.getCliente().getCpf() + contratoCsv.getCliente().getRg() + contratoCsv.getCliente().getNome());
//            gm.gerar(contrato);

	    List<Contrato> contratosVindoTxt =  la.lerContratosTxt();
	    for (Contrato contratoTxt : contratosVindoTxt) {
			System.out.println("\n" + contratoTxt.getCliente().getCpf() + contratoTxt.getCliente().getRg() + contratoTxt.getCliente().getNome());
		}
		
		}        
    }
}