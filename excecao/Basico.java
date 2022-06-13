package excecao;

public class Basico {
	public static void main(String[] args) {
		Aluno aluno = null;
		
		try {
			imprimirAluno(aluno);
		}catch(Exception e){
			System.out.println("Houve um erro no momento de imprimir o usuario");
		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim: ");
	}
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}