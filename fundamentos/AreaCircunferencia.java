package fundamentos;

public class AreaCircunferencia {
	public static double area(double raio, double pi) {
		double area = pi * raio*raio;
		return area;
	}
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		double valor1, valor2;
		
		valor1 = area(raio, PI);
		System.out.println(valor1);
		
		
		raio= 10;
		valor2 = area(raio, PI);
		System.out.println(valor2);
		
	}
	
}
