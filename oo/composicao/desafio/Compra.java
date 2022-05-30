	package oo.composicao.desafio;
	
	import java.util.ArrayList;
	
	public class Compra {
	
		ArrayList<Item> items = new ArrayList<Item>();
	
		void adicionarItem(int quantidade, Produto produto) {
			this.items.add(new Item(quantidade, produto));
			
			
		}
		
		double obterValorTotal() {
			double total = 0;
			for (Item item : items) {
				total+= item.produto.preco * item.quantidade;  
				
			}
			return total;
	
		}
	
	}
