package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio9 {
	public static void main(String[] args) {
		int numero=0, maior=0, contador=0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Informe um numero: ");
			numero = input.nextInt();
			
			if(numero>maior) {
				maior = numero;
			}
			
			contador ++;
		}while(contador<10);
		input.close();
		System.out.println("O maior numero inserido foi: "+ maior);
		
		
	}

}
