package lambdas;

public class Produto {
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		double valorFinal = (preco*(1-desconto));
		return String.format("Produto: %s tem o preço de: %.2f", this.nome, valorFinal);
	}
	
	

}
