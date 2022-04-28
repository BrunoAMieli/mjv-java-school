package br.com.mjv.model.service;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.Endereco;
import br.com.mjv.model.util.FormatadorUtil;

public class GeradorMensagem {

	public void gerar(Contrato contrato) {
		
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		Endereco endereco = cliente.getEndereco();
		String cpfFormatador = FormatadorUtil.formatarCpf(cliente.getCpf());
        String formatarData = FormatadorUtil.formatarData(contrato.getDataHora());
		
		//sb.append("Senhor(a) " + cliente.getNome() + " cpf de número " + cpfFormatador);
		sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatador));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d ", contrato.getProtocolo()));
		sb.append(String.format("está agendado para a data\\hora %sh", formatarData));
		sb.append(String.format(" a instalação do serviço de %s com taxa de valor R$ %s em sua residência localizada no endereço abaixo: ", contrato.getSerico(), contrato.getValor()));
		sb.append(String.format("\nLogradouro: %s, %s\n" + 
								"Complemento: %s\n" + 
								"Bairro: %s\n" + 
								"Cidade: %s\n" + 
								"Cep: %s\n", endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getBairro(), endereco.getCidade(), endereco.getCep()));
		System.out.println(sb.toString());
	}

}
