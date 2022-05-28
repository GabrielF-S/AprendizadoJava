package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean primo = true;
		
		System.out.print("Informe um numero: ");
		int numero = input.nextInt();
		
		input.close();
		
		for (int i = 2; i < numero; i++) {
			
			if(numero%i == 0 && numero !=2) {
				primo=false;
			}
		}
		if(primo == true) {
			System.out.printf("%d é primo", numero);
			
		}else {
			System.out.printf("%d não é primo", numero);
		}
		
	}

}
