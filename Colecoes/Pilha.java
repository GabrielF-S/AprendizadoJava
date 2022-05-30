package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
//last in first out 
public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		//livros.add(null);
		for (String livro : livros) {
			System.out.println(livro);
			
		}
		
		
		//System.out.println(livros.peek());
		//System.out.println(livros.element());
		
		
		//System.out.println(livros.remove());
		System.out.println(livros.pop());
		//System.out.println(livros.poll());
		//System.out.println(livros.poll());
		//System.out.println(livros.poll());
		
		//fila.clear(); -> para limpar a fila
		//fila.size(); -> retorna o tamanho da fila
		//fila.isEmpty(); -> para saber se a fila está ou não vazia
		//fila.contains(fila); -> verifica se o objeto esta contido na fila
		
		System.out.println(livros.toString());
	}

}
