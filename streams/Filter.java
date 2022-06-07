package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		
	Aluno aluno1 = new Aluno("Antonio", 7.8);
	Aluno aluno2 = new Aluno("Ana", 5.8);
	Aluno aluno3 = new Aluno("Gui", 9.8);
	Aluno aluno4 = new Aluno("Becca", 6.8);
	Aluno aluno5 = new Aluno("Mabel", 7.1);
	Aluno aluno6 = new Aluno("Joao", 8.2);
	
	
	List<Aluno> lista = Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6);
	
	Predicate<Aluno> aprovado = a -> a.nota>= 7.0;
	Function<Aluno, String> saudacao = a -> "Parabéns "+ a.nome +"!! Você foi aprovado!";
	
	lista.stream().filter(aprovado).map(saudacao).forEach(System.out::println);

	
	//Pode se fazer diretamente
//	lista.stream().filter(a -> a.nota>= 7.0).map(a -> "Parabéns "+ a.nome +"!! Você foi aprovado!").forEach(System.out::println);
		
		
	}

}
