package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Liz", 6.1);
		Aluno a3 = new Aluno("Caua", 8.1);
		Aluno a4 = new Aluno("Gui", 10);
		Aluno a5 = new Aluno("Antonieta", 5.1);
		Aluno a6 = new Aluno("Ana", 7.1);
		Aluno a7 = new Aluno("Liz", 6.1);
		Aluno a8 = new Aluno("Caua", 8.1);
		
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6, a7,a8);
		
		System.out.println("Distrinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip and Limit");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
		
		
		
		System.out.println("\nTakeWhile");
		alunos.stream().distinct().takeWhile(a -> a.nota >= 7 ).forEach(System.out::println);
		System.out.println("Skip 2");
		alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7 ).forEach(System.out::println);
		
	}

}
