package Classe;

public class DataTestar {
	public static void main(String[] args) {
		Data d1 = new Data(8,5,1997);

		

		var d2 = new Data();

		

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}
//this() pode ser usaco como construtor, dentro de outro construtor
//this. para diferenciar parametro e atributo da instancia - pode ser usado também no metodo
