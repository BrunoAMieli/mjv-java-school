package controlefluxo;

public class Concat {

	public static void main(String[] args) {

		String concatenacao = 1+1+1+"1"; {
			System.out.println(concatenacao + "\n");
		}
		//O que vier após a String não será somado.
		String concatenacao1 = "1"+1+1+1; {
			System.out.println(concatenacao1);
		}
	}

}
