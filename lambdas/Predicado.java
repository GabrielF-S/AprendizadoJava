package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isSpensive = prod -> (prod.preco * (1 - prod.disconto)) >=750;
		
		Produto produto = new Produto("Notebool", 3600, 0.15); 
		
		System.out.println(isSpensive.test(produto));
	}

}
