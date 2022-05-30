package Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		listaAprovados.add("Carlos");
		
		for(String aprovados: listaAprovados) {
			System.out.println(aprovados);
		}
	}

}
