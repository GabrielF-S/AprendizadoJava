package Arrays;

import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Quantas notas deseja inserir? ");
		int qtde = input.nextInt();

		double[] notas = new double[qtde];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a " + (i + 1) + "º nota: ");
			notas[i] = input.nextDouble();
		}
		input.close();

		double soma = 0;
		for (double d : notas) {
			soma += d;

		}
		double media = soma / notas.length;
		System.out.println("Média: " + media);

	}

}
