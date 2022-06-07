package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Liz", 6.1);
		Aluno a3 = new Aluno("Caua", 8.1);
		Aluno a4 = new Aluno("Gui", 10);
		Aluno a5 = new Aluno("Antonieta", 5.1);
		
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
		Function<Aluno, Double> getNota= a-> a.nota;
		
		BinaryOperator<Double> somatoria = (a,b) -> a+b;
		
		
		alunos.stream().filter(aprovado).map(getNota).reduce(somatoria).ifPresent(System.out::println);
	}

}
