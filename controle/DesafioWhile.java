package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		double nota = 0, contador = 0, total = 0;

		Scanner input = new Scanner(System.in);

		while (nota != -1) {
			System.out.print("Digite a  nota ");
			nota = input.nextInt();
			if (nota >= 0 && nota <= 10) {
				total += nota;
				contador++;
			} else if (nota == -1) {
				System.out.println("Saindo...");

			} else
				System.out.println("Nota invalida");

		}
		input.close();
		double media = total / contador;

		System.out.println(media);
	}

}
