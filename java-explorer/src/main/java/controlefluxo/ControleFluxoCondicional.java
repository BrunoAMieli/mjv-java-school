package controlefluxo;

public class ControleFluxoCondicional {

	public static void main(String[] args) {
		ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples(25.0, 17.0);
		ControleFluxoCondicional.simuladorNotaEscolarFluxoComposto(7);
	}
	
	static void simuladorCaixaEletronicoFluxoSimples(double saldo, double valorSolicitado) {
	
		//double saldo = 25.0;
	    //double valorSolicitado = 17.0;

	    if(valorSolicitado < saldo) {
	       saldo = saldo - valorSolicitado;
	    }
	    System.out.println(saldo);
	    System.out.println("Fim");
	}
	
	static void simuladorNotaEscolarFluxoComposto(double nota) {
		if (nota >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}
