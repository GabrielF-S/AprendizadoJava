package controle;

import java.util.Scanner;

public class DesafioSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana");
		String dia = input.nextLine().toLowerCase();
		input.close();
		if(dia.equals("domingo")) {
			System.out.println("1");
		}else if(dia.equals("segunda") || dia.equals("segunda-feira") || dia.equals("segunda feira")) {
			System.out.println("2");
		}else if(dia.equals("terça") || dia.equals("terça-feira") || dia.equals("terça feira")) {
		System.out.println("3");
		}else if(dia.equals("quarta") || dia.equals("quarta-feira") || dia.equals("quarta feira")) {
			System.out.println("4");
		}else if(dia.equals("quinta") || dia.equals("quinta-feira") || dia.equals("quinta feira")) {
			System.out.println("5");
		}else if(dia.equals("sexta") || dia.equals("sexta-feira") || dia.equals("sexta feira")) {
			System.out.println("6");
		}else if(dia.equals("sabado") || dia.equals("sábado")) {
			System.out.println("7");
		}else {
			System.out.println("Dia invalido");
		}
	}

}
