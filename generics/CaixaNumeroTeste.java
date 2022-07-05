package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(123.0);
		System.out.println(caixaA.abrir());
		
		
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		caixaB.guardar(12);
		System.out.println(caixaB.abrir());
	

	}
}
