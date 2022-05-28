package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um ano para saber se ele é bissexto: ");

		int ano = input.nextInt();
		input.close();
		if (ano % 400 == 0) {
			System.out.printf("O ano %d é bissexto", ano);
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.printf("O ano %d é bissexto", ano);
		} else {
			System.out.println("O ano não é bissexto");
		}

	}
}
