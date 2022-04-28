package br.com.mjv.model.service;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.util.FormatadorUtil;

public class GeradorMensagem {

	public void gerar(Contrato contrato) {
		
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatador = FormatadorUtil.formatarCpf(cliente.getCpf());
		
		//sb.append("Senhor(a) " + cliente.getNome() + " cpf de número " + cpfFormatador);
		sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatador));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d ", contrato.getProtocolo()));
		sb.append(String.format("está agendado para a data\\hora %sh", contrato.getDataHora().toString().replace("-", "/").replace("T", " ")));
		sb.append(String.format(" a instalação do serviço de %s com taxa de valor R$ %s em sua residência localizada no endereço abaixo: ", contrato.getSerico(), contrato.getValor()));
		System.out.println(sb.toString());
	}

}
