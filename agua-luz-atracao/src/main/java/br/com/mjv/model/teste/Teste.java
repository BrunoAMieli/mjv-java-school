package br.com.mjv.model.teste;

import java.time.LocalDateTime;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.Endereco;
import br.com.mjv.model.service.GeradorMensagem;

public class Teste {
	public static void main(String[] args) {
		
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
		contrato.setProtocolo(2022025687L);
		contrato.setServico("Água");
		contrato.setValor(127.33);
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		
		cliente.setCpf("23476598727");
		cliente.setNome("Gleyson Sampaio");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310-657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Bloco C");
		
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerar(contrato);
		
	}
}
