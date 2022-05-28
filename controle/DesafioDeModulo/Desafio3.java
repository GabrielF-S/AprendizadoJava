package controle.DesafioDeModulo;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		double nota1, nota2, media;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe  a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.print("Informe  a segunda nota: ");
		nota2 = input.nextDouble();
		input.close();
		media = (nota1+nota2)/2;
		
		if(media>=7) {
			System.out.println("Aprovado!");
		}else if(media<7 && media>=4) {
			System.out.println("Recuperação");
		}else
			System.out.println("Reprovado");
		
	}

}
