package br.com.mjv.model.service;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		//sb.append("Senhor(a) " + cliente.getNome() +" cpf de número " + cpfFormatado );
		sb.append(String.format("Senhor(a) %s cpf de número %s, ",cliente.getNome(), cpfFormatado ));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d", contrato.getNumeroProtocolo()));
		System.out.println(sb.toString());
	}
}
