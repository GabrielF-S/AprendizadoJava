package Classe.DesafioDeModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1, c2;
		c1 = new Comida();
		
		c1.nome = "feijão";
		c1.peso = 0.200;
		
		c2 = new Comida();
		c2.nome="macarrão";
		c2.peso= 1;
		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome="Gabriel";
		pessoa1.peso=80;
		
		pessoa1.imprimirPeso();
		System.out.println("Comeu: " + c1.nome);
		
		pessoa1.comer(c1);
		
		pessoa1.imprimirPeso();
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.imprimirPeso();
		System.out.println("Comeu: " + c2.nome);
		pessoa2.comer(c2);
		pessoa2.imprimirPeso();
		
		
	
		
		
		
	}

}
