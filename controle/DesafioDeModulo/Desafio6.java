package controle.DesafioDeModulo;

import java.util.Random;
import java.util.Scanner;

public class Desafio6 {
	public static void main(String[] args) {
		int numero, tentativas=1, random;
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		random = r.nextInt(0,100);
		
		System.out.print("Tente adivinhar o numero que estou pensando: ");
		numero = input.nextInt();
		
		
		while(tentativas<=10) {
			
			if(numero == random) {
				System.out.println("Acerto!!!");
				break;
			}else if(numero> random){
				System.out.println("O numero  inserido é maior que o numero pensado, tentativas restantes: " + (10-tentativas));
				
			}else if (numero< random) {
				System.out.println("O numero  inserido é menor que o numero pensado, tentativas restantes: " + (10-tentativas));
			}
			System.out.print("Tente novamente: ");
			numero = input.nextInt();
			tentativas++;
		}
		input.close();
	}
	
}
