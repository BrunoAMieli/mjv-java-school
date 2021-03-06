package br.com.mjv.model.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.Endereco;
import br.com.mjv.model.Pais;
import br.com.mjv.model.Servico;
import br.com.mjv.model.TipoNotificacao;

public class ContratoTxtRepository {
	public Contrato buscar() {
		Contrato contrato = new Contrato();
		try
		{
		    byte[] bytes = Files.readAllBytes(Paths.get("/Users/brunomieli/Documents/GitHub/MJV/mjv-java-school/agua-luz-output","agua-luz-contratos.txt"));
		    String conteudo = new String (bytes);
		    Cadastro cli = new Cadastro();
		    cli.setCpf(conteudo.substring(0,11));
		    cli.setRg(conteudo.substring(11,21).trim());
		    cli.setNome(conteudo.substring(21,51).trim());
		    cli.setCelular(conteudo.substring(51,62).trim());
		    Endereco end = new Endereco();
		    end.setLogradouro(conteudo.substring(62,82).trim());
		    end.setNumero(conteudo.substring(82,88).trim());
		    end.setComplemento(conteudo.substring(88,98).trim());
		    end.setBairro(conteudo.substring(98,113).trim());
		    end.setCidade(conteudo.substring(113,143).trim());
		    end.setEstado(conteudo.substring(143,145).trim());
		    end.setCep(conteudo.substring(145,153).trim());
		    cli.setEndereco(end);
		    cli.setPais(Pais.getPaisPorSigla(conteudo.substring(153,155)));
		    contrato.setProtocolo(Long.valueOf(conteudo.substring(155,165).trim()));
		    
		    DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
		    LocalDateTime dataHORA = LocalDateTime.parse(conteudo.substring(165,177), DATEFORMATTER);
		    contrato.setDataHora(dataHORA);
		    contrato.setCliente(cli);
		    contrato.setServico(Servico.getPaisPorSigla(conteudo.substring(177,178)));
		    Double valor = Double.valueOf(conteudo.substring(178,186)) / 100;
		    contrato.setValor(valor);
		    contrato.setTipoNotificacao(TipoNotificacao.valueOf(conteudo.substring(186,189)));
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		
		System.out.println(contrato);
		
		return contrato;
		
	}
}