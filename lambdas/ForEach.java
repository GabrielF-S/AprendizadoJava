package lambdas;

import java.util.ArrayList;

public class ForEach {
	public static void main(String[] args) {
		
		ArrayList<String> aprovados =  new  ArrayList<>();
				
		aprovados.add("Bia");
		aprovados.add("Ana");
		aprovados.add("Liz");
		aprovados.add("Gui");
		
		//usando o for 
		System.out.println("Usando For");
		for(int i = 0; i<aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nForEach tradicional");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nForeach Lambda #01");
		aprovados.forEach(nome-> System.out.println(nome+ "!!!"));
		
		System.out.println("\nMethod Reference #01");
		aprovados.forEach(System.out::println);
		
		// Lambda usando o Metodo estatico  imprimir criado abaixo
		System.out.println("\nForeach Lambda #02");
		aprovados.forEach(nome-> imprimir(nome));
		
		System.out.println("\nMethod Reference #02");
		aprovados.forEach(ForEach::imprimir);
		
	}
	
	public static void imprimir(String nome) {
		System.out.println("Olá meu nome é: " + nome);
	}

}
