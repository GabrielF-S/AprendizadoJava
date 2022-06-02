package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto b = new Produto("Ipad", 3235.89, 0.13);
		
		/***
		 * 1 - Calcular preço com desconto
		 * 2 - Imposto Munincipal: >= 2500 (8,5%) / < 2500 (isento)
		 * 3 - Frete >- 3000 (100) /  > 3000 (50)
		 * 4 - Arredondar: Deixar duas casas decimais
		 * 5 - Formatar: exp R$ 1234,56
		 */
		
		Function<Produto, Double> desconto = prod -> (prod.preco *(1 - prod.desconto));
		
		
		UnaryOperator<Double> imposto = imp -> imp>= 2500? imp * 1.085 :imp*1;
		
		UnaryOperator<Double> comFrete = valor -> valor>= 3000? valor+ 100.0: valor+50.0;
		
		UnaryOperator<Double> doFrete = valor -> valor>= 3000? 100.0: 50.0;
		
		BiFunction<Double, Double, String> valorFinal = (n1, n2) -> String.format("Valor Total: R$%.2f", n1+n2);
		
		Function<Double, String> valorFinal2 = valor -> String.format("Valor Total: R$%.2f", valor).replace(".", ",");
		
		
		
		System.out.println("Valor com desconto: ");
		 System.out.println(desconto.apply(b));
		 System.out.println("Valor com o imposto: ");
		 System.out.println(desconto.andThen(imposto).apply(b));
		 
		 System.out.println("Valor do Frete: ");		 
		 System.out.println(desconto.andThen(imposto).andThen(doFrete).apply(b));
		 
		 System.out.println("Valor com Frete: ");		 
		 System.out.println(desconto.andThen(imposto).andThen(comFrete).apply(b));
		 
		 System.out.println("\nValor Final2: ");		 
		 System.out.println(desconto.andThen(imposto).andThen(comFrete).andThen(valorFinal2).apply(b));
		 
		 
		 System.out.println("\nValor Final1");
		 System.out.println(valorFinal.apply(desconto.andThen(imposto).apply(b), desconto.andThen(imposto).andThen(doFrete).apply(b)));
		 
		 
		
		 //criando um metodo para imprimir
		 imprimir(desconto.andThen(imposto).andThen(comFrete).andThen(valorFinal2).apply(b));
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}

}
