package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero, contador = 0;
		System.out.print("Informe um numero: ");
		numero = input.nextInt();
		input.close();
		
		for (int i = 2; i <= numero; i++) {
			
			if(numero%i == 0 && numero !=2) {
				contador ++;
			}
		}
		switch(contador) {
		case 1:
			System.out.printf("%d é primo", numero);
			break;
		default:
			System.out.printf("%d não é primo",numero);
		}
	
		

	}

}
