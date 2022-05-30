package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Quantidade de alunos: ");
		int qtdeAluno = input.nextInt();

		System.out.print("Quantidade de notas: ");
		int qtdeNotas = input.nextInt();

		double[][] notasTurma = new double[qtdeAluno][qtdeNotas];

		double total = 0;
		for (int aluno = 0; aluno < notasTurma.length; aluno++) {
			for (int nota = 0; nota < notasTurma[aluno].length; nota++) {
				System.out.printf("Informe a %dº nota do %dº aluno: ", nota + 1, aluno + 1);
				notasTurma[aluno][nota] = input.nextDouble();
				total += notasTurma[aluno][nota];
			}
			System.out.println();

		}

		double media = total / (qtdeAluno * qtdeNotas);
		System.out.println("Media da turma: " + media);

		for (double[] notas : notasTurma) {

			System.out.println(Arrays.toString(notas));
		}

		input.close();
	}

}
