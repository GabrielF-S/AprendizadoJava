package fundamentos.Desafios.DesafioModuloFundamentos;

import java.util.Scanner;

public class Fundamentos3 {
	public static void main(String[] args) {
		float altura,peso, imc;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite sua altura");
		altura = input.nextFloat();
		
		System.out.println("Digite seu peso");
		peso = input.nextFloat();
		
		input.close();
		
		imc = peso / (altura*altura);
		System.out.println("Sua altura é: " + altura + "\nSeu peso é: " + peso+"\nSeu IMC é: "+ imc);
	
		
		
	}

}
