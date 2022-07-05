package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		
		
		List<String> langs = Arrays.asList("PHP","Java","C++", "JS");
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		
		int ultimoNumero = (Integer) ListaUtil.getUltimo1(numbers);
		System.out.println(ultimoNumero);
		
		String ultimaLinguagem2 =  ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		
		int ultimoNumero2 =  ListaUtil.getUltimo2(numbers);
		System.out.println(ultimoNumero2);
	}

}
