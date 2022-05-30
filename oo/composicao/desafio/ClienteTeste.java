package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Banana",7.50);
		Produto produto3 = new Produto("Queijo",14.20);
		Produto produto4 = new Produto("Maça",2.50);
		Produto produto5 = new Produto("Aguá 1L",6.30);
		
	
		Compra compra1 = new Compra();
		compra1.adicionarItem(6,produto4);
		compra1.adicionarItem(2,produto5);
		
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(4,produto1);
		compra2.adicionarItem(1,produto3);
		
		
		Cliente cliente1 = new Cliente("João");
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.printf("Total: %.2f",cliente1.obterValorTotal());

		
		
// 27.6
	}

}
