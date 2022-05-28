package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class If {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a média: ");
		double media = input.nextDouble();
		
		if(media >= 7 && media<=10) {
			System.out.println("Aprovado");
		}else if(media>10) {
			System.out.println("Mentira");
		}else {
			System.out.println("Reprovado");
		}
		
		input.close();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		
		if(numero%2==0) {
			JOptionPane.showMessageDialog(null, "Numero Par");
		}else {
			JOptionPane.showMessageDialog(null, "Numero impar");
		}
		
		
		
		
		
	}

}
