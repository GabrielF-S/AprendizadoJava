package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		Somar soma = new Somar();
		
		Multiplicar multiplicar = new Multiplicar();
		
		System.out.println(soma.executar(2, 3));
		System.out.println(multiplicar.executar(2, 3));
		
	}

}
