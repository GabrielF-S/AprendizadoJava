package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um numero entre 0 e 10: ");
		int numero = input.nextInt();
		input.close();
		if(numero>=0 && numero<=10) {
			if(numero%2 == 0) {
				System.out.println("Numro é par");
			}else {
				System.out.println("Não é par");
			}
			
			
		}else {
			System.out.println("Numero inválido");
		}
	}

}
