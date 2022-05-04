package javaexplorer.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysExplorer {

	public static void main(String[] args) {
		String[] alunos = new String [50];
		
		alunos[0] = "BRUNO";
		alunos[10] = "GLEYSON";
		
		System.out.println("Exemplo Array: ");
//		for (int x=0; x < alunos.length; x++) {
//			System.out.println(alunos[x]);
//		}
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("\nExemplo ArrayList: ");
		
		List<String> alunos2 = new ArrayList<String>();
		alunos2.add("Bruno");
		alunos2.add("Gleyson");
		alunos2.add("Marcos");
		
		alunos2.remove(0);
		System.out.println("O Primeiro elemento da lista foi excluído com o método 'remove'.");
		
		for (String aluno : alunos2) {
			System.out.println(aluno);
		}
		
		System.out.println("\nO ArrayList contém " + alunos2.size() + " elementos.");
	}
}
