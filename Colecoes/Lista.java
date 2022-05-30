package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");

		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.indexOf(u1));
		System.out.println(lista.get(3));
		System.out.println(lista);
		System.out.println(lista.remove(new Usuario("Manu")));
		lista.remove(1);
		for (Usuario user : lista) {
			System.out.println(user);
		}
	}
}
