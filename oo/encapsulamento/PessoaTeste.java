package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Francisco", "Cunha",-30);
		
		p1.setIdade(230);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}

}
