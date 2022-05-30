	package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calc;
		
		calc = (x,y) -> {return  x+y;};
		
		System.out.println(calc.executar(2, 3));
		
		calc = (a,b)->  a-b;
		System.out.println(calc.executar(5, 2));
		
		calc = (a,b) -> a*b;
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		
		System.out.println(Calculo.bemLoco());
		
		
	}

}
