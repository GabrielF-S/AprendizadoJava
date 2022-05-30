package Classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1,1,1997);

	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	String obterDataFormatada() {

		return String.format("Dia: %2d/%2d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
