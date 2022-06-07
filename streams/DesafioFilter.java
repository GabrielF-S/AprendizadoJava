package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("caneta", 12.0, 0.02);
		Produto p2 = new Produto("Notebook", 3515.79, 0.18);
		Produto p3 = new Produto("Geladeira", 2700.0, 0.2);
		Produto p4 = new Produto("Televisão", 1500.0, 0.35);
		Produto p5 = new Produto("Armario", 975.42, 0.12);
		Produto p6 = new Produto("Serra Eletrica", 7002.15, 0.4);
		
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		
		Predicate<Produto> valorDesconto = prod -> (prod.preco * (1 - prod.desconto)>= 800.0);
		Predicate<Produto> valorProd = prod -> (prod.preco >= 2000.0);
		Function<Produto, String> valeAPena = p -> "Vale a pena comprar: " + p.nome;
		
		
		
		produtos.stream().filter(valorDesconto).filter(valorProd).map(valeAPena).forEach(System.out::println);
		
		
	}

}
