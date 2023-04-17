package Colecoes;

import java.util.LinkedList;
import java.util.Queue;
// first in firt out
public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
	
		fila.add("Ana"); // lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia"); // retorna falso caso a fila esteja cheia.
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
		System.out.println(fila.element()); // lanca um exception
		System.out.println(fila.element()); // retorna o proximo elemento da fila
		
		
		//fila.poll();-> retorna o proximo elemento da fila excluindo ele
		//fila.remove(); -> retorna o proximo  elemento da fila excluindo ele 
		//diferen�a ocorre quando a fila esta vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // // lan�a um exception
		
		//fila.clear(); -> para limpar a fila
		//fila.size(); -> retorna o tamanho da fila
		//fila.isEmpty(); -> para saber se a fila est� ou n�o vazia
		//fila.contains(fila); -> verifica se o objeto esta contido na fila
	}
}
