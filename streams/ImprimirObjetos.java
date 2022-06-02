package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu","Gui","Lucca","Ana");
		
		
		//usando o for
		System.out.println("Usando For:");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados);
					}
		
		//usando o foreach
		System.out.println("\nUsando o Foreach:");
		for (String string : aprovados) {
			System.out.println(string);
			
		}
		
		// usando forEach Lambda
		System.out.println("\nUsando ForEach com Lambda:");
		aprovados.forEach(nome -> System.out.println(nome));
		
		
		System.out.println("\nUsanto Iterator");
		
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}

}
