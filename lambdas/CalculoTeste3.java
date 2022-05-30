	package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc;
		
		calc = (x,y) -> {return  x+y;};
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (a,b)->  a-b;
		System.out.println(calc.apply(5.0, 2.0));
		
		calc = (a,b) -> a*b;
		System.out.println(calc.apply(2.0, 3.0));
		
		
	}

}
