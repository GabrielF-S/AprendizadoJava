package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		CaixaInt caixa = new CaixaInt();
		
		caixa.guardar(123);
		int coisa = caixa.abrir();
		System.out.println(coisa);
	}

}
