package javaexplorer.fundamentos;

public class StringExplorer {

	public static void main(String[] args) {
		StringExplorer.explorandoMetodoSplit();
	}
	
	//O split separa as palavras de uma String
	static void explorandoMetodoSplit() {
		String nomeCompleto = "BRUNO ALESSANDRO MIELI";
		String [] palavras = nomeCompleto.split(" ");
		
		//Como Percorrer um array
		for (String palavra: palavras) {
			System.out.println(palavra);
		}
		/*
		 * Simulando a utilização do split no contexto 
		 * de um ticket de passagem aérea.
		 */
		String lastname = palavras[palavras.length-1];
		String firstname = palavras[0];
		System.out.println(lastname.concat(" ".concat(firstname)));
	}
}
