package fundamentos;

import java.util.Scanner;

public class InserirNumeroLine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = input.nextInt();
		input.nextLine();
		System.out.println("Qual o seu nome?");
		String nome = input.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = input.nextLine();
		 
		input.close();
		System.out.printf("Nome: $s\nSobrenome: %s\nIdade: %d", nome,sobrenome, idade);
	}

}
