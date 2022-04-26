package estruturarepeticao;

public class ForEach {

	public static void main(String[] args) {

		ForEach.simuladorForEach();
		ForEach.simuladorForEachComSplit();
		ForEach.simuladorForEachComNumero();
	}

	static void simuladorForEach() {
		System.out.println("Lista de ForEach: ");
		String alunos[] = { "PAULO", "BRUNO", "EDI", "FABIO", "GABRIEL", "RENATO" };

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

	static void simuladorForEachComSplit() {
		System.out.println("\nLista de ForEach com split: ");
		String integrantesEquipe = "Paulo Bruno Edi Fabio Gabriel Renato";
		String alunos[] = integrantesEquipe.split(" ");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

	static void simuladorForEachComNumero() {
		System.out.println("\nLista de ForEach com números: ");
		Integer numeros[] = { 12, 25, 35, 88, 99, 10, 13 };
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}