package fundamentos.Desafios.DesafioModuloFundamentos;

public class Fundamentos2 {
	public static void main(String[] args) {
		// (C * 9/5) + 32 = f
		
		final int COMPENSADOR = 32;
		final double MULTIPLICADOR = 9/5.0;
		
		
		double c = 22;
		double f = (c*MULTIPLICADOR)+ COMPENSADOR;
		
		System.out.println("A conversão de " + c +" graus celsius é igual a " + f + " graus fahrenheit");
		
		
	}

}
