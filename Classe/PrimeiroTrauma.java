package Classe;

public class PrimeiroTrauma {

	int a = 3; // variavel de instancia, preciso instanciar para poder acessar o valor ou
	static int b = 5; // transformo a variavel da instancia em static para poder ser acessada por
						// outro metodo static

	public static void main(String[] args) {

		PrimeiroTrauma p = new PrimeiroTrauma(); // intanciei o objeto p para poder acessar o valor de Primeiro Trauma a
		System.out.println(p.a);

		System.out.println(b);

	}

}