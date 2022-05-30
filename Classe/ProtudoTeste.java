package Classe;

public class ProtudoTeste {
	public static void main(String[] args) {
		double precoFinal1, precoFinal2, mediaCarrinho;
		Produto p1, p2;
		
		p1 = new Produto("Notebook", 4356.89);

		p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		

		System.out.println(p1.nome);
		System.out.printf("Preço com desconto: %.2f\n", p1.precoComDesconto());
		System.out.println(p2.nome);
		System.out.printf("Preço com desconto: %.2f\n",p2.precoComDesconto());
		
		//alterar desconto
		Produto.desconto = 0.35;
		
		
		System.out.println(p1.nome);
		System.out.printf("Preço com desconto: %.2f\n", p1.precoComDesconto());
		System.out.println(p2.nome);
		System.out.printf("Preço com desconto: %.2f\n",p2.precoComDesconto());

		precoFinal1 = p1.precoComDesconto();
		precoFinal2 = p2.precoComDesconto();

		mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		
		
		System.out.printf("Preço total = R$%.2f.", mediaCarrinho);
	}

}
