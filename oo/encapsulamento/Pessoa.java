package oo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	private String sobrenome;
	// Constructor
	
	public Pessoa(String nome,String sobrenome, int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	
	//Getter
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	// Setter
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome= sobrenome;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade>=0 && novaIdade<=120) {
			this.idade = novaIdade;
			
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Olá eu sou o %s e tenho %d anos", getNome(), getIdade());
	}
}
