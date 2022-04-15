package br.com.mjv.model.teste;

import java.io.File;

//A classe File é a representação Java de um nome de caminho de arquivo ou diretório. 
//Como os nomes de arquivos e diretórios têm formatos diferentes em plataformas diferentes, 
//uma string simples não é adequada para nomeá-los. 
//A classe File contém vários métodos para trabalhar com o nome do caminho, 
//excluir e renomear arquivos, criar novos diretórios, listar o conteúdo de um diretório e 
//determinar vários atributos comuns de arquivos e diretórios.

public class FileTeste {

	public static void main(String[] args) {

		File file = new File("file.txt");

		System.out.println("Nome do arquivo :" + file.getName());
		System.out.println("Caminho completo do arquivo: "+ file.getAbsolutePath());
		System.out.println("Arquivo existe: " + file.exists());

		if (file.exists()) {
			System.out.println("\nÉ gravável: " + file.canWrite());
			System.out.println("É legível: " + file.canRead());
			System.out.println("É um diretório: " + file.isDirectory());
			System.out.println("Tamanho do arquivo em bytes: " + file.length());
		}
	}
}