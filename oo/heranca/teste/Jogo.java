package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
		public static void main(String[] args) {
		Jogador j1 = new Heroi(10,20);
		
		Jogador j2 = new Monstro(11,11);
		
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println("Heroi - vida: "+j1.vida);
		System.out.println("Monstro - vida: "+j2.vida);
		
		
		 
	}

}
