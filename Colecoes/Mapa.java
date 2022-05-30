package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// chave e valor
public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); 
		usuarios.put(20, "Ricardo"); 
		usuarios.put(3, "Rafaela"); 
		usuarios.put(4, "Raquel");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Raquel"));
		
		System.out.println(usuarios.get(20));
		
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(3, "Gui"));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
			
		}
		
		for(String user : usuarios.values()) {
			System.out.println(user);
		}
		
		for(Entry<Integer, String> regristro : usuarios.entrySet()) {
			System.out.print(regristro.getKey()+" ");
			System.out.println(regristro.getValue());
			
		}
	}

}
