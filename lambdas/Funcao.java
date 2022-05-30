package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				num ->  num%2 ==0 ? "Par":"Impar";
				
		System.out.println(parOuImpar.apply(5));
		
		Function<String, String> oResultadoE = valor -> "O Resultado �: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!!!";
		
		//Jun��o de duas fun��es
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);
		
	}
	
}
