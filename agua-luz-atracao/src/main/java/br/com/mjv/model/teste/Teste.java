package br.com.mjv.model.teste;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.TipoServico;

public class Teste {

	public static void main(String[] args) {

		Cadastro cadastro = new Cadastro();
		cadastro.setCpf("234.765.987-27");
		cadastro.setNome("Gleyson Sampaio");
		cadastro.setLogradouro("Rua das Marias, 243");
		cadastro.setComplemento("Ap 207, Bloco C");
		cadastro.setBairro("Santo Antonio");
		cadastro.setCidade("São Paulo / SP");
		cadastro.setCep("27.310-657");
		
		Contrato contrato = new Contrato();
		contrato.setProtocolo("2022025687");
		contrato.setData(LocalDate.of(2022, 2, 21));
		contrato.setHora(LocalTime.of(16, 0));
		contrato.setTipoServico(TipoServico.ÁGUA);
		contrato.setValor(127.33);
		
		System.out.println("Senhor(a) " + cadastro.getNome() + " cpf de número " + cadastro.getCpf() + 
						   ", Informamos que conforme contrato com protocolo de número " + contrato.getProtocolo() + 
						   " está agendado para a data\\hora " + contrato.getData() + " " + contrato.getHora() + 
						   " a instalação do serviço de " + contrato.getTipoServico() + " com taxa de valor R$ " + contrato.getValor() + 
						   " em sua residência localizada no endereço abaixo: " + "\nLogradouro: " + cadastro.getLogradouro() +
						   "\nComplemento: " + cadastro.getComplemento() + "\nBairro: " + cadastro.getBairro() + 
						   "\nCidade: " + cadastro.getCidade() + "\nCep: " + cadastro.getCep());
	}

}
