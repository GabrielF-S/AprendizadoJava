package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<String> caixa = new Caixa<>();
		
		caixa.guardar("Segredo");
		
		String coisa = caixa.abrir();
		System.out.println(coisa);
		
		Caixa<Double> caixab = new Caixa<>();
		
		caixab.guardar(3.2);
		
		Double coisab = caixab.abrir();
		System.out.println(coisab);
	}

}
