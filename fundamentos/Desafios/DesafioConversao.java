package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioConversao {

	/*
	 * usar o scanner para pegar 3 string com os 3 ultimos salarios do funcionario
	 * calcular a média salaria
	 * usuario pode separar as casas decimais por virgula ou ponto
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		double salarios[] = {0,0,0};
		double mediaSalario, salario=0;
		System.out.println("Informe seus 3 ultimos salarios");
		for(int i = 0; i<3;i++) {
			System.out.printf("Informe o %dº salarios:\n", i+1);
			String valor = input.nextLine();
			if(valor.contains(",")) {
				valor = valor.replace(",", ".");
			}
			salarios[i]= Double.parseDouble(valor);
			salario+=salarios[i];
		}
		mediaSalario = salario/salarios.length;
		System.out.println(mediaSalario);
		
		/*System.out.println("Digite o primeiro salarios");
		String salario1 = input.next();
		salario1= salario1.replace(",", ".");
		
		System.out.println("Digite o segundo salarios");
		String salario2 = input.next();
		salario2 = salario2.replace(",", ".");
		
		System.out.println("Digite o terceriro salarios");
		String salario3 = input.next();
		 salario3 = salario3.replace(",", ".");
		
		System.out.println(salario1 + " " + salario2 + " " + salario3);
		
		double salario1Convertido = Double.parseDouble(salario1);
		double salario2Convertido = Double.parseDouble(salario2);
		double salario3Convertido = Double.parseDouble(salario3);
		
		System.out.println((salario1Convertido + salario2Convertido + salario3Convertido)/3);*/
		
		input.close();
	}
	
}
