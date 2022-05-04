package br.com.mjv.model.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Contrato;
import br.com.mjv.model.Endereco;

public class LeitorArquivo {

    public List<Contrato> lerContratosTxt(){
        List<String> conteudo = ler("agua-luz-contratos.txt");
        List<Contrato> contratos = new ArrayList<>();
        for (String linha : conteudo) {
            Contrato c = new Contrato();
            Cadastro cad = new Cadastro();
            cad.setCpf(linha.substring(0, 11).trim());
            cad.setRg(linha.substring(11, 21).trim());
            cad.setNome(linha.substring(21, 51).trim());
            cad.setCelular(linha.substring(51, 61).trim());
            
            c.setCliente(cad);

            contratos.add(c);
        }
        return contratos;
    }
	
    public List<Contrato> lerContratosCsv(){
        List <String> conteudo = ler("agua-luz-contratos.csv");
        List<Contrato> contratos = new ArrayList<Contrato>();
        
        for (String linha : conteudo) {
            String[] campos = linha.split(";");

            Contrato c = new Contrato();
            Endereco end = new Endereco();
            Cadastro cad = new Cadastro();
            cad.setCpf(campos[0]);
            cad.setRg(campos[1]);
            cad.setNome(campos[2]);
            cad.setCelular(campos[3]);
            end.setLogradouro(campos[4]);
            end.setNumero(campos[5]);
            end.setComplemento(campos[6]);
            end.setBairro(campos[7]);
            end.setCidade(campos[8]);
            end.setEstado(campos[9]);
            end.setCep(campos[10]);

            c.setCliente(cad);
            cad.setEndereco(end);

            contratos.add(c);
        }
        return contratos;
    }

    private List<String> ler(String nomeArquivo) {
    	Path filePath = Paths.get("/Users/brunomieli/Documents/GitHub/MJV/mjv-java-school/agua-luz-output", nomeArquivo);
    	
        try {
        	List<String> lines = Files.readAllLines(filePath);
        	return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}