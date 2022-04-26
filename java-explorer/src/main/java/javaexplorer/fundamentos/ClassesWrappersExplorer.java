package javaexplorer.fundamentos;

public class ClassesWrappersExplorer {

	public static void main(String[] args) {
		ClassesWrappersExplorer.converterStringEmNumeros();
	}
	
	static void converterStringEmNumeros() {
		//Convertendo uma String em Integer;
		Integer numero =  Integer.valueOf("123");
		
		//Convertendo ums String em Double
		Double numeroDuplo = Double.valueOf("123");
		
		System.out.println(numeroDuplo + " " + numero);
	}
}
