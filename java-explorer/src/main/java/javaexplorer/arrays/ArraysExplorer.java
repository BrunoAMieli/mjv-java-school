package javaexplorer.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
		System.out.println("\nO ArrayList contém " + alunos2.size() + " elementos.\n");
		
		Set <String> alunos3 = new HashSet<String>();
		
		System.out.println(alunos3.add("GLEYSON"));
		alunos3.add("ARAMIS");
		
		System.out.println(alunos3.size());
		                
        for(String aluno:alunos) {
        	System.out.println(aluno);
        }
        System.out.println(alunos3.size());
        
        alunos3.add("MARCOS");
        alunos3.add( "JULIA");
        System.out.println(alunos3.add("GLEYSON"));
        
        for(String aluno :alunos) {
        	System.out.println(aluno);
        }
	}
}
