package br.com.mjv.openbanking;

import java.time.LocalDate;

public class GeradorArquivo {

	public static void main(String[] args) {
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDate.of(2022,4,16));
		movimentacao.setCpfCnpj("135.217.791-18");
		movimentacao.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
		movimentacao.setValor(1275.48);
		movimentacao.setTipo(TipoMovimentacao.RECEITA);
		movimentacao.setEstornada(false);
		
		System.out.println(movimentacao);
		
		GeradorConteudo gc = new GeradorConteudo();
		String conteudoGerado = gc.gerar(movimentacao);
		
		System.out.println(conteudoGerado);
	}

}
