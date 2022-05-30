package Classe;

public class ClasseVsReferencia {
	public static void main(String[] args) {
		int a = 2;
		int b = a;
		
		a++;
		b--;
		
		System.out.println(a+ " " + b);
		
		
		Data d1 = new Data(19,4,2022);
		
		Data d2 = d1;
		
		d1.dia = 17;
		d2.mes = 12;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia =1;
		d.mes =1;
		d.ano= 1970;
	}
}
