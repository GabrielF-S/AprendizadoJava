package Classe.DesafioDeModulo;

public class Pessoa {
	String nome;
	double peso;
	
	//construtores
	Pessoa(){
		this("Zé", 30.0);
	}
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	//metodos
	public void comer(Comida comida) {
		
		this.peso += comida.peso;
		
	}
	
	public String mostrarPeso() {
		return String.format("Nome: %s, esta pesando: %.2f", this.nome,this.peso);
	}
	
	public void imprimirPeso() {
		System.out.println(mostrarPeso());
	}
}
