package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio8 {
	public static void main(String[] args) {
		String palavra;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma palavra para ser soletrada: ");
		palavra = input.nextLine();
		
		for(int i=0; i< palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		input.close();
	}

}
