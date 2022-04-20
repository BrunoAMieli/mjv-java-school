package br.com.mjv.openbanking;

import java.time.LocalDate;

public class GeradorArquivo {

	public static void main(String[] args) {
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDate.now());
		
		System.out.println(movimentacao.getData());
		
	}

}
