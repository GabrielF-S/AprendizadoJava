package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(F - 32) * 5/9 = C
		final int COMPENSADOR = 32;
		final double MULTIPLICADOR = 5.0/9;
		
		double f = 86;
		double c = (f - COMPENSADOR)* MULTIPLICADOR;
		
		
		long numerogrande = 3_456_268_765L;
		System.out.println(numerogrande);
		System.out.println(c);
		
		
	}

}
