package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio7 {
	public static void main(String[] args) {
		int numero, soma=0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Digite um numero: ");
			numero= input.nextInt();
			if(numero>=0) {
				soma+=numero;
				System.out.println("Total: "+ soma);
			}
			
		} while (numero >= 0);
		input.close();
		System.out.println("Encerrando...");
	}

}
