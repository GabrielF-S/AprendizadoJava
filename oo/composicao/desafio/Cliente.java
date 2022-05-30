package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	ArrayList<Compra> compra = new ArrayList<Compra>();
	

	/***
	 * Calcular o valor total do cliente
	 * pegar  total do numero de compras 
	 * Nas compras percorrer todos os itens
	 */
	Cliente(String nome){
		this.nome = nome;
		
	}
	void adicionarCompra(Compra compra) {
		this.compra.add(compra);
	}
	double obterValorTotal(){
		double total=0;
		for (Compra compras : compra) {
			total += compras.obterValorTotal();
			
		}
		return total;
		
	}
	

}
