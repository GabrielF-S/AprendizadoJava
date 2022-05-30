package oo.composisao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.curso.add(this);
		
	}

}
//Uma lista constante é uma lista que foi instanciada na memoria 