package Arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double [] notasAlunoA = new double [4];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 9.8;
		notasAlunoA[1] = 6;
		notasAlunoA[2] = 7.2;
		notasAlunoA[3] = 8.5;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA+= notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA/ notasAlunoA.length);
		
		
		
		double totalAlunoB = 0, notaArmazenada = 5.9;
		double []notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB+= notasAlunoB[i];
		}
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.println(String.format("%.2f", totalAlunoB/ notasAlunoB.length));
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.println(notasAlunoB[i]);
			
		}
	}

}
