package fundamentos.Desafios.DesafioModuloFundamentos;

import java.util.Scanner;

public class Fundamentos4 {
	public static void main(String[] args) {
		double valor;
		Scanner input = new Scanner( System.in);
		System.out.println("Informe um valor:");
		valor = input.nextDouble();
		
		System.out.printf("O Valor digitado foi: %.2f, seu valor ao quadrado é: %.2f e seu valor ao cubo é: %.2f", 
				valor, Math.pow(valor, 2),Math.pow(valor, 3));
		
		
		input.close();
	}

}
