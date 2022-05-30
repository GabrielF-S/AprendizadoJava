package Colecoes;

import java.util.LinkedList;
import java.util.Queue;
// first in firt out
public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
	
		fila.add("Ana"); // retorna false caso a fila esteja cheia
		fila.offer("Bia"); // lança um exception
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		for (String nome : fila) {
			System.out.println(nome);
			
			
		}
		System.out.println();
		System.out.println(fila.peek()); // retorna null caso a fila estiver vazia 
		System.out.println(fila.peek()); // retorna o proximo elemento da fila
		System.out.println(fila.element()); // lança um exception
		System.out.println(fila.element()); // retorna o proximo elemento da fila
		
		
		//fila.poll();-> retorna o proximo elemento da fila excluindo ele
		//fila.remove(); -> retorna o proximo  elemento da fila excluindo ele 
		//diferença ocorre quando a fila esta vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // // lança um exception
		
		//fila.clear(); -> para limpar a fila
		//fila.size(); -> retorna o tamanho da fila
		//fila.isEmpty(); -> para saber se a fila está ou não vazia
		//fila.contains(fila); -> verifica se o objeto esta contido na fila
	}
}
