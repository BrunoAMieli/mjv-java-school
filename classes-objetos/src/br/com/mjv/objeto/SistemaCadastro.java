package br.com.mjv.objeto;

public class SistemaCadastro {

	public static void main(String[] args) {

		Pessoa bruno = new Pessoa("999.999.999-99", "Bruno Alessandro");
		

		System.out.println("Nome: " + bruno.nome + "\n" + "CPF: " + bruno.cpf + "\n" + "Endereço: " + bruno.endereco);
	}

}
