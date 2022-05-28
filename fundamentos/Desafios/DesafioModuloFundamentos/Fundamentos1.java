package fundamentos.Desafios.DesafioModuloFundamentos;

public class Fundamentos1 {
	
	public static void main(String[] args) {
		//(F - 32) * 5/9 = C
				final int COMPENSADOR = 32;
				final double MULTIPLICADOR = 5.0/9;
				
				double f = 86;
				double c = (f - COMPENSADOR)* MULTIPLICADOR;
				
				System.out.println(c);
		
	}

}
