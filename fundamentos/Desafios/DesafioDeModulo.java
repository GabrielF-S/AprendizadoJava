package fundamentos.Desafios;
import java.util.Scanner;

public class DesafioDeModulo {
	
	public static void main(String[] args) {
		int num1, num2, result;
		String operador;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o 1º numero: ");
		num1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Informe operador ");
		operador = input.nextLine().trim();
		
		System.out.println("Informe o 2º numero: ");
		num2 = input.nextInt();

		input.close();
		
		
		
		
		result = operador.equals("+") ?  num1 + num2 : operador.equals("-")? num1 - num2 : operador.equals("*")? num1 * num2 : operador.equals("/")? num1/num2 : operador.equals("%")? num1%num2 : 0 ;
		
		System.out.println(result);
	}

}
