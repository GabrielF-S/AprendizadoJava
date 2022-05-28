package fundamentos.Desafios.DesafioModuloFundamentos;

import java.util.Scanner;

public class Fundamentos5 {
	public static void main(String[] args) {
		float base, altura, area;
		
		Scanner input = new Scanner( System.in);
		System.out.println("Informe o valor da base");
		base = input.nextFloat();
		
		System.out.println("Informe o valor da altura");
		altura = input.nextFloat();
		input.close();
		
		area = base * altura;
		System.out.println("A area correspondente é:" + area);
		
	}
}
