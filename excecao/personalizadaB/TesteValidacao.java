package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacao {
	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("Ana", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException  | NumeroForaDoIntervaloException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :) ");
	}

}
