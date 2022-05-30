package oo.composisao;

import java.util.ArrayList;


public class Aluno {
	final String nome;
	ArrayList<Curso> curso = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.curso.add(curso);
		curso.alunos.add(this);
	}

	void verificarCursos() {
		System.out.println("Meu nome é " + this.nome);
		for (Curso cursos : curso) {
			System.out.println(cursos.nome);
			
			
		}
	}
}
